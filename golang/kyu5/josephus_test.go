package kata_test

import (
	. "codewarrior/kata/kyu5"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

func dotest(items []interface{}, k int, exp []interface{}) {
	// Println("input:", items, k)
	var ans = Josephus(items, k)
	Expect(ans).To(Equal(exp))
}

var _ = FDescribe("Sample Tests", func() {
	It("should handle basic test cases", func() {
		items := []interface{}{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		result := []interface{}{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		k := 1
		// dotest(items, k, result)
		items = []interface{}{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
		result = []interface{}{2, 4, 6, 8, 10, 3, 7, 1, 9, 5}
		k = 2
		dotest(items, k, result)
		items = []interface{}{1, 2, 3, 4, 5, 6, 7}
		result = []interface{}{3, 6, 2, 7, 5, 1, 4}
		k = 3
		dotest(items, k, result)

		items = []interface{}{1, 2, 3, 4, 5, 6, 7}
		result = []interface{}{3, 6, 2, 7, 5, 1, 4}
		k = 3
		dotest(items, k, result)

		items = []interface{}{1, 2, 3}
		result = []interface{}{1, 3, 2}
		k = 4
		dotest(items, k, result)

		items = []interface{}{}
		result = []interface{}{}
		k = 3
		dotest(items, k, result)
	})
})
