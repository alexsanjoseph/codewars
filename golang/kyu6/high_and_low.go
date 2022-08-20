package kata

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

func HighAndLow(in string) string {
	splitString := strings.Split(in, " ")
	smallest := math.MaxInt32
	largest := math.MinInt32
	for _, val := range splitString {
		conv, _ := strconv.Atoi(val)
		if conv < smallest {
			smallest = conv
		}
		if conv > largest {
			largest = conv
		}
	}
	return fmt.Sprintf("%d %d", largest, smallest)
}
