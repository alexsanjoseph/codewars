package kata

import (
	"strings"
)

func Accum(s string) string {
	output := ""
	for pos, char := range s {
		for i := 0; i < pos+1; i++ {
			if i == 0 {
				output += strings.ToUpper(string(char))
			} else {
				output += strings.ToLower(string(char))
			}

		}
		output += "-"
	}
	return output[:len(output)-1]
}
