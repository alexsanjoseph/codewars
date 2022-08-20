package kata_test

import (
	. "codewarrior/kata/kyu5"
	"fmt"
	"strings"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

func arrayToString(a []int, delim string) string {
	return strings.Join(strings.Split(fmt.Sprint(a), " "), delim)
}
func dotest_buddy(start, limit int, exp string) {
	ans := arrayToString(Buddy(start, limit), " ")
	Expect(ans).To(Equal(exp))
}

var _ = Describe("Test Example", func() {
	It("should handle basic cases buddy", func() {
		dotest_buddy(40, 80, "[48 75]")
		dotest_buddy(1071625, 1103735, "[1081184 1331967]")
		dotest_buddy(57345, 90061, "[62744 75495]")
		dotest_buddy(2693, 7098, "[5775 6128]")
		dotest_buddy(6379, 8275, "[]")
	})

})
