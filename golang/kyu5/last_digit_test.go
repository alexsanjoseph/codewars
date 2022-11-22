// TODO: replace with your own tests (TDD). An example to get you started is included below.
// Ginkgo BDD Testing Framework <http://onsi.github.io/ginkgo/>
// Gomega Matcher Library <http://onsi.github.io/gomega/>

package kata_test

import (
	. "codewarrior/kata/kyu5"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Tests", func() {
	It("Sample tests", func() {
		Expect(LastDigit("4", "1")).To(Equal(4))
	})
	It("Sample tests", func() {
		Expect(LastDigit("4", "2")).To(Equal(6))
	})
	It("Sample tests", func() {
		Expect(LastDigit("9", "7")).To(Equal(9))
	})
	It("Sample tests", func() {
		Expect(LastDigit("10", "10000000000")).To(Equal(0))
	})
	It("Sample tests", func() {
		Expect(LastDigit("1606938044258990275541962092341162602522202993782792835301376", "2037035976334486086268445688409378161051468393665936250636140449354381299763336706183397376")).To(Equal(6))
	})
	It("Sample tests", func() {
		Expect(LastDigit("3715290469715693021198967285016729344580685479654510946723", "68819615221552997273737174557165657483427362207517952651")).To(Equal(7))
	})

	It("Sample tests", func() {
		Expect(LastDigit("33", "77")).To(Equal(3))
	})

	It("Sample tests", func() {
		Expect(LastDigit("9", "10")).To(Equal(1))
	})

})
