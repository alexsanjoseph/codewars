package kata

import (
	"sort"
	"strconv"
	"strings"
)

func swap(stringArray []string, index int, swapIndex int) int64 {
	copyArray := make([]string, len(stringArray))
	copy(copyArray, stringArray)

	if index != swapIndex {
		swapVar := copyArray[index]
		if index < swapIndex {
			copy(copyArray[index:swapIndex], copyArray[index+1:swapIndex+1])
		} else {
			copy(copyArray[swapIndex+1:index+1], copyArray[swapIndex:index])
		}
		copyArray[swapIndex] = swapVar
	}

	output, err := strconv.ParseInt(strings.Join(copyArray, ""), 10, 64)
	if err != nil {
		panic(err)
	}
	return output
}

func Smallest(n int64) []int64 {
	stringArray := strings.Split(strconv.Itoa(int(n)), "")
	allOutputs := [][]int64{}
	for i := 0; i < len(stringArray); i++ {
		for k := 0; k < len(stringArray); k++ {
			output := swap(stringArray, i, k)
			allOutputs = append(allOutputs, []int64{output, int64(i), int64(k)})
		}
	}

	sort.SliceStable(allOutputs, func(i, j int) bool {
		if allOutputs[i][0] < allOutputs[j][0] {
			return true
		}
		if allOutputs[i][0] > allOutputs[j][0] {
			return false
		}
		if allOutputs[i][1] < allOutputs[j][1] {
			return true
		}
		if allOutputs[i][1] > allOutputs[j][1] {
			return false
		}
		return allOutputs[i][2] < allOutputs[j][2]
	})
	return allOutputs[0]
}
