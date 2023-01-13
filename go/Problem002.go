package main

import "fmt"

func main() {
	a1 := 1
	a2 := 2
	var a3 int
	sum := 0

	for a2 <= 4000000 {
		sum += a2
		a3 = a1+a2
		a1 = a2+a3
		a2 = a3+a1
	}

	fmt.Println(sum)
}
