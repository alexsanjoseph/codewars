// TODO: replace with your own tests (TDD). An example to get you started is included below.
// Ginkgo BDD Testing Framework <http://onsi.github.io/ginkgo></http:>
// Gomega Matcher Library <http://onsi.github.io/gomega></http:>

package kata_test

import (
	. "codewarrior/kata/kyu5"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Basic Tests", func() {
	It("should handle simple tests", func() {
		Expect(FirstNonRepeating("a")).To(Equal("a"))
		Expect(FirstNonRepeating("stress")).To(Equal("t"))
		Expect(FirstNonRepeating("moonmen")).To(Equal("e"))
	})
	It("should handle empty strings", func() {
		Expect(FirstNonRepeating("")).To(Equal(""))
	})
	It("should handle all repeating strings", func() {
		Expect(FirstNonRepeating("abba")).To(Equal(""))
		Expect(FirstNonRepeating("aa")).To(Equal(""))
	})
	It("should handle odd characters", func() {
		Expect(FirstNonRepeating("~><#~><")).To(Equal("#"))
		Expect(FirstNonRepeating("hello world, eh?")).To(Equal("w"))
	})
	It("should handle letter cases", func() {
		Expect(FirstNonRepeating("sTreSS")).To(Equal("T"))
		Expect(FirstNonRepeating("Go hang a salami, I'm a lasagna hog!")).To(Equal(","))
	})
})
