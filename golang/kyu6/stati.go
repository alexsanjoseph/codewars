package kata

import (
	"fmt"
	"sort"
	"strconv"
	"strings"
)

func ConvertToSeconds(time string) int {
	var split = strings.Split(time, "|")
	hours, _ := strconv.Atoi(split[0])
	minutes, _ := strconv.Atoi(split[1])
	seconds, _ := strconv.Atoi(split[2])
	return int(hours*3600 + minutes*60 + seconds)
}

func ConvertToString(sec int) string {
	hours := int32(sec / 3600)
	minutes := int32(sec%3600) / 60
	seconds := int32(sec % 60)
	return fmt.Sprintf(
		"%02d|%02d|%02d",
		int(hours),
		int(minutes),
		int(seconds))
}

func average(nums []int) int {
	total := 0
	for _, x := range nums {
		total += x
	}
	return total / len(nums)
}

func median(nums []int) int {
	strLen := len(nums)
	if strLen%2 == 1 {
		return nums[(strLen-1)/2]
	}
	return (nums[strLen/2] + nums[strLen/2-1]) / 2
}

func Stati(strg string) string {
	if strg == "" {
		return ""
	}
	splitString := strings.Split(strg, ", ")
	splitNum := []int{}
	for _, s := range splitString {
		splitNum = append(splitNum, ConvertToSeconds(s))
	}
	sort.Ints(splitNum)
	rangeVal := ConvertToString(splitNum[len(splitNum)-1] - splitNum[0])
	medianVal := ConvertToString(median(splitNum))
	avgVal := ConvertToString(average(splitNum))

	return fmt.Sprintf(
		"Range: %s Average: %s Median: %s",
		rangeVal, avgVal, medianVal)

}
