package main

import "fmt"

func main() {
	n := 1
	b := false
	for i:=2; i<=20; i++ {
		n *= i
	}
	for i:=2; i<=20; i++ {
		for j:=2; j<=20; j++ {
			if n/i%j != 0 {
				b = true
			}
		}
		if !b {
			n /= i
		}
		b = false

	}
	fmt.Println(n)
}
