package kata

import (
	"strings"
)

func FirstNonRepeating(str string) string {

	splitString := strings.Split(str, "")
	charCount := map[string]int{}
	occurenceOrder := []string{}
	for _, x := range splitString {
		lX := strings.ToLower(x)
		_, ok := charCount[lX]
		if !ok {
			occurenceOrder = append(occurenceOrder, x)
		}
		charCount[lX]++
	}
	for _, x := range occurenceOrder {
		if charCount[strings.ToLower(x)] == 1 {
			return x
		}
	}
	return ""
}
