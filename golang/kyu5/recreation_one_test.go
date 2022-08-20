package kata_test

import (
	. "codewarrior/kata/kyu5"
	"sort"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

func dotest_r1(m, n int, exp [][]int) {
	var ans = ListSquared(m, n)
	Expect(ans).To(Equal(exp))
}

func dotest_divisors(m int, exp []int) {
	var ans = FindDivisors(m)
	sort.Ints(ans)
	sort.Ints(exp)
	Expect(ans).To(Equal(exp))
}

func dotest_square(m int, exp bool) {
	var ans = IsSquare(m)
	Expect(ans).To(Equal(exp))
}

var _ = Describe("Test Example", func() {

	It("should find divisors", func() {
		dotest_divisors(12, []int{1, 2, 3, 4, 6, 12})
		dotest_divisors(25, []int{1, 5, 25})
		dotest_divisors(76, []int{1, 2, 4, 19, 38, 76})
		// dotest_divisors()
	})

	It("should check square", func() {
		dotest_square(12, false)
		dotest_square(25, true)
		// dotest_divisors()
	})

	It("should sum of squares", func() {
		Expect(SumArraySquare(FindDivisors(246)), 84100)
		Expect(SumArraySquare(FindDivisors(42)), 2500)
		Expect(SumArraySquare(FindDivisors(1)), 1)
		// dotest_divisors()
	})

	It("should handle basic cases", func() {
		dotest_r1(1, 250, [][]int{{1, 1}, {42, 2500}, {246, 84100}})
		dotest_r1(250, 500, [][]int{{287, 84100}})
		dotest_r1(300, 600, [][]int{})
	})
})
