package kata

import (
	"regexp"
)

func Alphanumeric(str string) bool {
	output, _ := regexp.Match(`[^\d\w]`, []byte(str))
	return len(str) != 0 && !output
}
