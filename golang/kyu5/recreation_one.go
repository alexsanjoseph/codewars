package kata

import (
	"math"
)

func FindDivisors(n int) []int {
	if n == 1 {
		return []int{1}
	}
	divisors := []int{1, n}
	sqrtN := math.Sqrt(float64(n))
	for i := 2; float64(i) <= sqrtN; i++ {
		if n%i == 0 {
			divVal := n / i
			divisors = append(divisors, i)
			if i != divVal {
				divisors = append(divisors, divVal)
			}
		}
	}
	return divisors
}

func SumArraySquare(arr []int) int {
	sum := 0
	for _, x := range arr {
		sum += (x * x)
	}
	return sum
}

func IsSquare(n int) bool {
	sqrtN := int(math.Ceil(math.Sqrt(float64(n))))
	return sqrtN*sqrtN == n
}

func ListSquared(m, n int) [][]int {

	output := [][]int{}
	for i := m; i <= n; i++ {
		sumSquares := SumArraySquare(FindDivisors(i))
		if IsSquare(sumSquares) {
			output = append(output, []int{i, sumSquares})
		}
	}

	return output
}
