package kata_test

import (
	"testing"

	. "codewarrior/kata/kyu6"

	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
)

func TestKata(t *testing.T) {
	RegisterFailHandler(Fail)
	RunSpecs(t, "Kata Suite")
}

var _ = Describe("Example tests", func() {
	It("It should work for basic tests", func() {
		Expect(Solve(1)).To(Equal(-1))
		Expect(Solve(2)).To(Equal(-1))
		Expect(Solve(3)).To(Equal(1))
		Expect(Solve(4)).To(Equal(-1))
		Expect(Solve(5)).To(Equal(4))
		Expect(Solve(7)).To(Equal(9))
		Expect(Solve(8)).To(Equal(1))
		Expect(Solve(9)).To(Equal(16))
		Expect(Solve(10)).To(Equal(-1))
		Expect(Solve(11)).To(Equal(25))
		Expect(Solve(13)).To(Equal(36))
		Expect(Solve(17)).To(Equal(64))
		Expect(Solve(88901)).To(Equal(5428900))
		Expect(Solve(290101)).To(Equal(429235524))
	})
})

// func dotest(start int, stop int, exp []int) {
// 	var ans = BackwardsPrime(start, stop)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Tests BackwardsPrime", func() {

// 	It("should handle basic cases", func() {
// 		var a = []int{13, 17, 31, 37, 71, 73, 79, 97}
// 		dotest(1, 100, a)
// 		a = []int{13, 17, 31}
// 		dotest(1, 31, a)
// 		dotest(501, 599, nil)

// 	})
// })

// func dotest(m, n int, exp int) {
// 	var ans = CheckChoose(m, n)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Test Example", func() {

// 	It("should handle basic cases", func() {
// 		dotest(6, 4, 2)
// 		dotest(6, 4, 2)
// 		dotest(4, 4, 1)
// 		dotest(4, 2, -1)
// 		dotest(35, 7, 3)
// 		dotest(36, 7, -1)
// 		dotest(184756, 20, 10)
// 		dotest(3268760, 25, 10)
// 		dotest(6540715896, 48, 10)
// 		dotest(6540715897, 48, -1)
// 	})
// })

// func dotest(n int, exp []int) {
// 	var ans = Game(n)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Test Example", func() {

// 	It("should handle basic cases", func() {
// 		dotest(0, []int{0})
// 		dotest(1, []int{1, 2})
// 		dotest(2, []int{2})
// 		dotest(3, []int{9, 2})
// 		dotest(4, []int{8})
// 		dotest(5, []int{25, 2})
// 		dotest(8, []int{32})
// 		dotest(40, []int{800})
// 	})
// })

// func dotest(a1 string, exp string) {
// 	var ans = Stati(a1)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Tests Stati", func() {

// 	It("should handle basic cases", func() {
// 		dotest("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17",
// 			"Range: 01|01|18 Average: 01|38|05 Median: 01|32|34")
// 		dotest("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41",
// 			"Range: 00|31|17 Average: 02|26|18 Median: 02|22|00")

// 	})

// 	It("should convert to second correctly", func() {
// 		Expect(ConvertToSeconds("01|15|59")).To(Equal(4559))
// 		Expect(ConvertToString(4559)).To(Equal("01|15|59"))
// 	})
// })

// func dotest(k, start, nd int, exp []int) {
// 	var ans = Step(k, start, nd)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Check for Primes", func() {

// 	It("should handle basic cases", func() {
// 		Expect(true).To(Equal(IsPrime(7)))
// 		Expect(true).To(Equal(IsPrime(2)))
// 		Expect(true).To(Equal(IsPrime(17)))
// 		Expect(true).To(Equal(IsPrime(101)))
// 		Expect(false).To(Equal(IsPrime(1)))
// 		Expect(false).To(Equal(IsPrime(1001)))
// 		Expect(false).To(Equal(IsPrime(50)))
// 		Expect(false).To(Equal(IsPrime(25)))
// 		Expect(false).To(Equal(IsPrime(30148)))
// 	})
// })

// var _ = Describe("Test Example", func() {

// 	It("should handle basic cases", func() {
// 		dotest(2, 100, 110, []int{101, 103})
// 		dotest(4, 100, 110, []int{103, 107})
// 		dotest(6, 100, 110, []int{101, 107})
// 		dotest(8, 300, 400, []int{359, 367})
// 		dotest(10, 300, 400, []int{307, 317})
// 		dotest(11, 30000, 100000, nil)
// 	})
// })

// func dotest(f FParam, arr []int, init int, exp []int) {
// 	var ans = OperArray(f, arr, init)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Test Example", func() {

// 	It("should handle basic cases gcdi", func() {
// 		var dta = []int{18, 69, -90, -78, 65, 40}
// 		var sol = []int{18, 3, 3, 3, 1, 1}
// 		dotest(Gcdi, dta, dta[0], sol)
// 	})

// 	It("should handle basic cases som", func() {
// 		var dta = []int{357, 112, 28, -52, 644, 119}
// 		var sol = []int{357, 469, 497, 445, 1089, 1208}
// 		dotest(Som, dta, 0, sol)
// 	})
// 	It("should handle basic cases maxi", func() {
// 		var dta = []int{10, -32, 190, 300, -42, -38, 50, 405, -46, 225, -31}
// 		var sol = []int{10, 10, 190, 300, 300, 300, 300, 405, 405, 405, 405}
// 		dotest(Maxi, dta, dta[0], sol)
// 	})
// 	It("should handle basic cases lcmu", func() {
// 		var dta = []int{6, -72, -62, -22, -23, 80}
// 		var sol = []int{6, 72, 2232, 24552, 564696, 5646960}
// 		dotest(Lcmu, dta, dta[0], sol)
// 	})
// 	It("should handle basic cases mini", func() {
// 		var dta = []int{64, -67, -43, 12, -15, 108, 12, 104, -36}
// 		var sol = []int{64, -67, -67, -67, -67, -67, -67, -67, -67}
// 		dotest(Mini, dta, dta[0], sol)
// 	})
// })

// var _ = Describe("Example Test", func() {
// 	It("should test that the solution returns the correct value", func() {
// 		Expect(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")).To(Equal("42 -9"))
// 	})
// })

// func dotest(s string, exp string) {
// 	var ans = Accum(s)
// 	Expect(ans).To(Equal(exp))
// }

// var _ = Describe("Test Example", func() {

// 	It("should handle basic cases", func() {
// 		dotest("ZpglnRxqenU", "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu")
// 		dotest("NyffsGeyylB", "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb")
// 		dotest("MjtkuBovqrU", "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu")
// 		dotest("EvidjUnokmM", "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm")
// 		dotest("HbideVbxncC", "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc")
// 	})
// })
