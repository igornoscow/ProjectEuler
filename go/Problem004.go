package main

import "fmt"

func main() {
	find := false
	n := 999*999
	var n1, n2 int

	for !find && n>=100*100 {
		n1 = n/1000
		n2 = n%10*100+n%100/10*10+n%1000/100
		if n1 == n2 {
			find = haveFactors(n)
		}
		n--
	}
	fmt.Println(n+1)
}

func haveFactors(n int) bool {
	for i:=999; i>=100; i-- {
		if n%i == 0 && n/i<=999 && n/i>=100 {
			return true
		}
	}
	return false
}
