package kata

import (
	"strconv"
)

func reverse(str string) (result string) {
	for _, v := range str {
		result = string(v) + result
	}
	return
}

func BackwardsPrime(start int, stop int) []int {
	var output []int
	for i := start; i <= stop; i++ {
		reverseI, _ := strconv.Atoi(reverse(strconv.Itoa(i)))
		if IsPrime(i) && IsPrime(reverseI) && i != reverseI {
			output = append(output, i)
		}
	}

	return output
}
