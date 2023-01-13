package main

import "fmt"

func main() {
	x3  := 999/3
	x5  := 999/5
	x15 := 999/15
	fmt.Println(x3," ", x5," ",x15)

	sum_x3  := (3  + x3 *3) * x3 /2
	sum_x5  := (5  + x5 *5) * x5 /2
	sum_x15 := (15 + x15*15)* x15/2
	fmt.Println(sum_x3," ",sum_x5," ",sum_x15)

	sum := sum_x3 + sum_x5 - sum_x15
	fmt.Println(sum)
}
