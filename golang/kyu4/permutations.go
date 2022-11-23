package kata

import "strings"

func removeIndex(s []string, index int) []string {
	ret := make([]string, 0)
	ret = append(ret, s[:index]...)
	return append(ret, s[index+1:]...)
}

func Permutations(s string) []string {

	splitString := strings.Split(s, "")
	if len(splitString) == 1 {
		return splitString
	}

	uniqueCombinations := map[string]bool{}

	for i, x := range splitString {
		newString := removeIndex(splitString, i)
		allPermutations := Permutations(strings.Join(newString, ""))
		for _, single := range allPermutations {
			uniqueCombinations[x+single] = true
		}
	}

	output := []string{}
	for key := range uniqueCombinations {
		output = append(output, key)
	}

	return output
}
