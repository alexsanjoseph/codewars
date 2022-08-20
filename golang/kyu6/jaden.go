package kata

import (
	"strings"
)

func ToJadenCase(str string) string {

	split_string := strings.Split(str, " ")
	for i := range split_string {
		split_string[i] = strings.Title(split_string[i])
	}
	return strings.Join(split_string, " ")
}
