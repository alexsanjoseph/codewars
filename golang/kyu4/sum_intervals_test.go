package kata_test

import (
	. "codewarrior/kata/kyu4"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Tests", func() {
	It("Sample tests", func() {
		Expect(SumOfIntervals([][2]int{{1, 5}})).To(Equal(4))
		Expect(SumOfIntervals([][2]int{{1, 5}, {6, 10}})).To(Equal(8))
		Expect(SumOfIntervals([][2]int{{1, 5}, {1, 5}})).To(Equal(4))
		Expect(SumOfIntervals([][2]int{{1, 4}, {7, 10}, {3, 5}})).To(Equal(7))
	})

	It("Large intervals", func() {
		Expect(SumOfIntervals([][2]int{{-1_000_000_000, 1_000_000_000}})).To(Equal(2_000_000_000))
		Expect(SumOfIntervals([][2]int{{0, 20}, {-100_000_000, 10}, {30, 40}})).To(Equal(100_000_030))
	})

	It("Random intervals", func() {
		Expect(SumOfIntervals([][2]int{{1, 12}, {7, 10}, {3, 5}})).To(Equal(11))
	})
})
