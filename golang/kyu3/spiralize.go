package kata

var kernels = [][][]int{
	{{}},
	{{1}},
	{{1, 1}, {0, 1}},
	{{1, 1, 1}, {0, 0, 1}, {1, 1, 1}},
	{{1, 1, 1, 1}, {0, 0, 0, 1}, {1, 0, 0, 1}, {1, 1, 1, 1}},
}

func Spiralize(size int) [][]int {
	if size < 5 {
		return kernels[size]
	}
	output := [][]int{}
	endRow := []int{}
	secondRow := []int{}

	for i := 0; i < size; i++ {
		endRow = append(endRow, 1)
	}

	for i := 0; i < size-1; i++ {
		secondRow = append(secondRow, 0)
	}
	secondRow = append(secondRow, 1)

	output = append(append(output, endRow), secondRow)
	core := Spiralize(size - 4)
	for i := 2; i < size-2; i++ {
		newRow := []int{1, 0}
		if i == 2 {
			newRow[1] = 1
		}
		newRow = append(append(newRow, core[i-2]...), []int{0, 1}...)
		output = append(output, newRow)
	}

	penultimateRow := []int{}
	penultimateRow = append(penultimateRow, 1)
	for i := 1; i < size-1; i++ {
		penultimateRow = append(penultimateRow, 0)
	}
	penultimateRow = append(penultimateRow, 1)
	output = append(append(output, penultimateRow), endRow)
	return output
}
