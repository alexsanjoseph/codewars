package kata

import "fmt"

func HumanReadableTime(seconds int) string {
	secondsString := seconds % 60
	minutesString := (seconds / 60) % 60
	hoursString := seconds / 3600
	return fmt.Sprintf("%.2d:%.2d:%.2d", hoursString, minutesString, secondsString)
}
