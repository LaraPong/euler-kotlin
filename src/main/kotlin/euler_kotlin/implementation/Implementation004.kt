package euler_kotlin.implementation

import euler_kotlin.model.Implementation

/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

object Implementation004 : Implementation {
    override fun computeSolution(): String = (998001 downTo 100000).first(this::findPalindrome).toString()

    //ToDo: Needs to be the product of two 3-digit numbers; make two loops?
    private fun makeNumbers(): IntArray {
        for (i in 100..999) {
            for (j in 100..999) {
                //Array[i, j] = i * j
            }
        }
        //return Array
    }

    private fun findPalindrome(product: Int): Boolean {
        val productWord = product.toString()
        return (productWord.reversed() == productWord)
    }
}
