package kata

import "math"

func Solve(n int) int {

	k := 1
	for k < n {
		sqr_val := n + (k * k)
		sqrt_val := int(math.Sqrt(float64(sqr_val)))
		if sqrt_val*sqrt_val == sqr_val {
			return k * k
		}
		k += 1
	}
	return -1

}
