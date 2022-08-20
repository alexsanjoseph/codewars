package kata

func MoveZeros(arr []int) []int {
	outputArray := make([]int, len(arr))
	nonZeroInd := 0
	for i, x := range arr {
		if x != 0 {
			outputArray[nonZeroInd] = arr[i]
			nonZeroInd++
		}
	}
	return outputArray
}
