package kata

import "sort"

func SumOfIntervals(intervals [][2]int) int {

	sort.Slice(intervals, func(i, j int) bool {
		return intervals[i][0] < intervals[j][0]
	})

	total := 0
	for i := 0; i < len(intervals)-1; {
		if intervals[i+1][0] < intervals[i][1] {
			if intervals[i+1][1] > intervals[i][1] {
				intervals[i][1] = intervals[i+1][1]
			}
			intervals = append(intervals[:(i+1)], intervals[i+2:]...)
		} else {
			total += (intervals[i][1] - intervals[i][0])
			i += 1
		}

	}
	total += (intervals[len(intervals)-1][1] - intervals[len(intervals)-1][0])
	return total
}
