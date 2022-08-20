// TODO: replace with your own tests (TDD). An example to get you started is included below.
// Ginkgo BDD Testing Framework <http://onsi.github.io/ginkgo/>
// Gomega Matcher Library <http://onsi.github.io/gomega/>

package kata_test

import (
	. "codewarrior/kata/kyu5"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Test Example", func() {
	It("should test that the solution returns the correct value", func() {
		Expect(MoveZeros([]int{1, 2, 0, 1, 0, 1, 0, 3, 0, 1})).To(Equal([]int{1, 2, 1, 1, 3, 1, 0, 0, 0, 0}))
		Expect(MoveZeros([]int{0, 1, -1, 2, -2, 1, 0})).To(Equal([]int{1, -1, 2, -2, 1, 0, 0}))
	})
})
