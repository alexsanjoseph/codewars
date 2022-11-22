package kata

func Josephus(items []interface{}, k int) []interface{} {
	output := []interface{}{}
	if len(items) == 0 {
		return output
	}
	deadList := map[int]bool{}
	i := (k - 1) % len(items)
	missed := k - 1

	for len(output) < len(items) {
		dead := deadList[i]
		if !dead {
			if missed == k-1 {
				deadList[i] = true
				output = append(output, items[i])
				missed = 0
			} else {
				missed += 1
			}
		}
		i++
		i %= len(items)
	}
	return output
}
