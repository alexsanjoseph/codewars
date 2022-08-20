package kata

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}

func Gcdi(x, y int) int {
	min_val := Mini(x, y)
	max_val := Maxi(x, y)
	rem := max_val % min_val
	var temp int
	for rem != 0 {
		temp = min_val
		min_val = max_val % min_val
		max_val = temp
		rem = max_val % min_val
	}
	return abs(min_val)
}

func Som(x, y int) int {
	return x + y
}

func Maxi(x, y int) int {
	if x > y {
		return x
	}
	return y
}
func Mini(x, y int) int {
	if x > y {
		return y
	}
	return x
}

func Lcmu(x, y int) int {
	return abs(x * y / Gcdi(x, y))
}

type FParam func(int, int) int

func OperArray(f FParam, arr []int, init int) []int {
	output := make([]int, len(arr)+1)
	output[0] = init
	for i := 1; i < len(output); i++ {
		output[i] = f(output[i-1], arr[i-1])
	}
	return output[1:]
}
