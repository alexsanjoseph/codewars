package kata

import (
	"math"
	"math/big"
	"strconv"
)

// 0, 0
// 1, 1,
// 2, 4, 8, 6, 2
// 3, 9, 7, 1, 2
// 4, 6, 4
// 5, 5
// 6, 6
// 7, 9, 3, 1, 7
// 8, 4, 2, 6, 8
// 9, 1, 9

func LastDigit(n1, n2 string) int {
	periods := []int{1, 1, 4, 4, 2, 1, 1, 4, 4, 2}
	baseLastDigit, err := strconv.Atoi(string(n1[len(n1)-1]))
	if err != nil {
		panic("cannot convert")
	}
	currentPeriod := periods[baseLastDigit]
	substring := n2
	if len(substring) > 2 {
		substring = string(n2[len(n2)-2:])
	}
	expLastDigits, err := strconv.Atoi(substring)
	if err != nil {
		panic("cannot convert")
	}

	finalPeriod := expLastDigits%currentPeriod + currentPeriod
	output := int(math.Pow(float64(baseLastDigit), float64(finalPeriod)))
	return output % 10
}

func LastDigitOnline(n1, n2 string) int {
	a, b := big.NewInt(0), big.NewInt(0)
	a.SetString(n1, 10)
	b.SetString(n2, 10)

	a.Exp(a, b, big.NewInt(10))

	return int(a.Int64())
}
