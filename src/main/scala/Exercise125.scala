package com.melifaro

object Exercise125 extends App {

  def isPalindrome(s: String): Boolean = {

    val trimmed = s.toLowerCase.trim.filter(_.isLetterOrDigit)

    val length = trimmed.length
    if (length > 0) {
      println(trimmed)
      for {
        pos <- 0 to length / 2
        isSame = trimmed(pos) == trimmed(length - 1 - pos)
        _ = if (!isSame) return false
      } yield true
      true
    } else {
      false
    }
  }

  println(isPalindrome(""))
  println(isPalindrome("aba"))
  println(isPalindrome("abba"))
  println(isPalindrome("abbba"))
  println(isPalindrome("abbbac"))
  println(isPalindrome("cabbbac"))
}
