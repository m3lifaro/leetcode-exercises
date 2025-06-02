package com.melifaro

object Exercise206 extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }
  def processListNode(currentNode: ListNode, reversedNode: ListNode): ListNode = {
    if (currentNode.next == null) {
      new ListNode(currentNode.x, _next = reversedNode)
    } else {
      processListNode(currentNode.next, new ListNode(currentNode.x, reversedNode))
    }
  }
  def reverseList(head: ListNode): ListNode = {
    if (head == null) {
      null
    } else {
      processListNode(head, null)
    }
  }
  val input = new ListNode(1, new ListNode(2, new ListNode(3)))
  val res = reverseList(input)
  println(res)
}
