package kata

import "fmt"

func GCD(a, b int64) int64 {
	for b != 0 {
		t := b
		b = a % b
		a = t
	}
	return a
}

func LCM(a, b int64, integers ...int64) int64 {
	result := a * b / GCD(a, b)

	for i := 0; i < len(integers); i++ {
		result = LCM(result, integers[i])
	}

	return result
}

func SumFraction(num1, denom1, num2, denom2 int64) (int64, int64) {
	if num1 == 0 {
		return num2, denom2
	}
	if num2 == 0 {
		return num1, denom1
	}
	lcmVal := LCM(denom1, denom2)
	num, denom := (num1*lcmVal/denom1)+(num2*lcmVal/denom2), lcmVal
	gcdVal := GCD(num, denom)

	return num / gcdVal, denom / gcdVal
}

func Game2(n int) []int {
	fmt.Println("START")
	if n == 0 {
		return []int{0}
	}
	num, denom := int64(0), int64(1)
	for i := int64(0); i < int64(n); i++ {
		for j := int64(1); j <= int64(n); j++ {
			num, denom = SumFraction(i+1, i+j+1, num, denom)
		}
	}
	if denom == 1 {
		return []int{int(num)}
	}
	return []int{int(num), int(denom)}
}

func Game(n int) []int {
	if n%2 == 1 {
		return []int{n * n, 2}
	}
	return []int{n * n / 2}
}
