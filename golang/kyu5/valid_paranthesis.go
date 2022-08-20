package kata

import "strings"

func ValidParentheses(parens string) bool {
	parensSplit := strings.Split(parens, "")
	sum := 0
	for _, x := range parensSplit {
		if x == ")" {
			sum -= 1
		} else if x == "(" {
			sum += 1
		} else {
			panic("unknown input")
		}
		if sum < 0 {
			return false
		}
	}
	return sum == 0
}
