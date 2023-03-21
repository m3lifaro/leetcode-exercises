package com.melifaro

object Exercise10 extends App {
  def isMatch(s: String, p: String): Boolean = {
    var str =
    for {
      pos <- 0 until p.length
      pattern = p(pos)
      isMatch = (s.head == pattern) || (pattern == '.')
    }
  }
}

List(1).fold(_ + _)