package kata

import "math"

func IsPrime(n int) bool {
	if n == 1 {
		return false
	}
	if n == 2 {
		return true
	}
	if n%2 == 0 {
		return false
	}

	sqrt := int(math.Floor(math.Sqrt(float64(n + 1))))
	for i := 3; i <= sqrt; i += 2 {
		if n%i == 0 {
			return false
		}
	}
	return true
}

func Step(g, m, n int) []int {
	var start int
	if m%2 == 0 {
		start = m + 1
	} else {
		start = m
	}
	for i := start; i < n; i += 2 {
		if IsPrime(i) {
			if IsPrime(i + g) {
				return []int{i, i + g}
			}
		}
	}
	return nil
}
