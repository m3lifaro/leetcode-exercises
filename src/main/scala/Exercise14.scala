package com.melifaro

object Exercise14 extends App {
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.isEmpty) ""
    else if (strs.length == 1) strs.head
    else {
      val maxLength = strs.minBy(_.length).length
      val first = strs.head


      def maxCommonPrefix(str1: String, str2: String, pos: Int = 0, pref: String = ""): String = {
        if (pos >= maxLength) pref
        else {
          if (str1(pos) == str2(pos)) maxCommonPrefix(str1, str2, pos + 1, pref + str1(pos))
          else pref
        }
      }

      strs.tail.map(maxCommonPrefix(first, _)).minBy(_.length)
    }
  }
}