package main

import "fmt"

func main() {
	number := 600851475143
	primes := make([]int, 0, 10)
	complite := false

	for i:=2; !complite; i++ {
		if isPrime(i, primes) {
			primes = append(primes, i)
			complite = isLastPrime(number, primes)
		}
	}
	fmt.Println(primes[len(primes)-1])
}



func isPrime(number int, primes []int) bool {
	notPrime := false
	for _, prime := range primes {
		if number % prime == 0 {
			notPrime = true
			break
		}
	}
	return !notPrime
}



func isLastPrime(number int, primes []int) bool {
	for _, prime := range primes {
		if number % prime == 0 {
			number = number/prime
		}
	}
	if number == 1 {
		return true
	} else {
		return false
	}
}
