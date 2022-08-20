package kata

import (
	"sort"
	"strconv"
	"strings"
)

func stringSum(x string) int {
	splitVal := strings.Split(x, "")
	sum := 0
	for _, x := range splitVal {
		xInt, err := strconv.ParseInt(x, 10, 32)
		if err != nil {
			panic("Why error?")
		}
		sum += int(xInt)
	}
	return sum
}

func OrderWeight(input string) string {

	splitString := strings.Split(input, " ")
	sort.Slice(splitString, func(i, j int) bool {
		iSum := stringSum(splitString[i])
		jSum := stringSum(splitString[j])
		if iSum == jSum {
			return splitString[i] < splitString[j]
		}
		return iSum < jSum
	})
	return strings.Join(splitString, " ")
}
