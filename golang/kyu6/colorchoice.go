package kata

import (
	"math/big"
)

func factorial(x int) *big.Int {
	if x <= 1 {
		return big.NewInt(1)
	}
	output := big.NewInt(0)
	return output.Mul(factorial(x-1), big.NewInt(int64(x)))
}

func CheckChoose(m, n int) int {
	for i := 0; i < n; i++ {
		temp := big.NewInt(0)
		temp.Mul(factorial(i), factorial(n-i))
		temp.Div(factorial(n), temp)
		cmp := temp.Cmp(big.NewInt(int64(m)))
		if cmp == 0 {
			return i
		}
	}
	return -1
}
