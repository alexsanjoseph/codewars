package kata

import (
	"math"
)

func findFactorSum(n int) int {
	factorSum := 1
	for i := 2; i <= int(math.Sqrt(float64(n))); i++ {
		if n%i == 0 {
			factorSum += i
			if n/i != i {
				factorSum += +n / i
			}
		}
	}
	return factorSum
}

func Buddy(start, limit int) []int {

	factorMap := map[int]int{}
	for i := start; i <= limit; i++ {
		val, ok := factorMap[i]
		if !ok {
			factorMap[i] = findFactorSum(i)
			val = factorMap[i]
		}
		buddy := val - 1
		if buddy >= start {
			buddyVal, ok := factorMap[buddy]
			if !ok {
				factorMap[buddy] = findFactorSum(buddy)
				buddyVal = factorMap[buddy]
			}
			if val-1 == buddy && buddyVal-1 == i {
				return []int{i, buddy}
			}
		}
	}
	return []int{}
}
