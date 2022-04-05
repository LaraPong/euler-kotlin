package euler_kotlin.implementation

import euler_kotlin.model.Implementation
import kotlin.math.*

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

object Implementation003 : Implementation {
    override fun computeSolution(): String =
        (775_146L downTo 2).filter { 600_851_475_143 % it == 0L }.filter(this::findOutIfPrimeNumber).first().toString()

    private fun findOutIfPrimeNumber(factor: Long): Boolean {
        for (i in 2..(ceil(sqrt(factor.toDouble()))).toLong()) {
            if (factor % i == 0L)
                return false
        }
        return true
    }

    // TODO This doesn't work.
    private fun largestPrimeFactor(number:Long):Long {
        var n:Long = number
        var isNPrime:Boolean = false
        while(!isNPrime) {
            for (f in 2..(n / 2)) {
                if (n % f == 0L) {
                    n /= f
                    break
                }
            }
            isNPrime = true
        }
        return n
    }
}
