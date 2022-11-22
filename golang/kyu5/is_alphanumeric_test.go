// TODO: replace with your own tests (TDD). An example to get you started is included below.
// Ginkgo BDD Testing Framework <http://onsi.github.io/ginkgo></http:>
// Gomega Matcher Library <http://onsi.github.io/gomega></http:>

package kata

import (
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

var _ = Describe("Sample Test Cases:", func() {
	It("Should return the correct values for the sample test cases!", func() {
		Expect(Alphanumeric(".*?")).To(Equal(false))
		Expect(Alphanumeric("a")).To(Equal(true))
		Expect(Alphanumeric("Mazinkaiser")).To(Equal(true))
		Expect(Alphanumeric("hello world_")).To(Equal(false))
		Expect(Alphanumeric("PassW0rd")).To(Equal(true))
		Expect(Alphanumeric("     ")).To(Equal(false))
		Expect(Alphanumeric("")).To(Equal(false))
		Expect(Alphanumeric("\n\t\n")).To(Equal(false))
		Expect(Alphanumeric("ciao\n$$_")).To(Equal(false))
		Expect(Alphanumeric("__ * __")).To(Equal(false))
		Expect(Alphanumeric("&)))(((")).To(Equal(false))
		Expect(Alphanumeric("43534h56jmTHHF3k")).To(Equal(true))
	})
})
