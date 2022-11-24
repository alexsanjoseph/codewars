package kata

import "strconv"

func SplitPyramid(pyramid [][]int) ([][]int, [][]int) {
	leftPyramid := [][]int{}
	rightPyramid := [][]int{}
	for i := 1; i < len(pyramid); i++ {
		leftPyramid = append(leftPyramid, pyramid[i][:(len(pyramid[i])-1)])
		rightPyramid = append(rightPyramid, pyramid[i][1:])
	}
	return leftPyramid, rightPyramid
}

func PyramidKey(pyramid [][]int) string {
	key := ""
	for _, x := range pyramid {
		for _, y := range x {
			key = key + strconv.Itoa(y) + ","
		}
		key = key + ":"
	}
	return key
}

func longestSlideDownInternal(pyramid [][]int, pyramidCache map[string]int) int {
	key := PyramidKey(pyramid)
	val, ok := pyramidCache[key]
	if ok {
		return val
	}

	if len(pyramid) == 0 {
		return 0
	}
	if len(pyramid) == 1 {
		return pyramid[0][0]
	}
	leftPyramid, rightPyramid := SplitPyramid(pyramid)
	output := pyramid[0][0] + max(longestSlideDownInternal(leftPyramid, pyramidCache), longestSlideDownInternal(rightPyramid, pyramidCache))
	pyramidCache[key] = output
	return output
}

func max(x, y int) int {
	if x > y {
		return x
	}
	return y
}

func LongestSlideDown(pyramid [][]int) int {
	pyramidCache := map[string]int{}
	return longestSlideDownInternal(pyramid, pyramidCache)
}
