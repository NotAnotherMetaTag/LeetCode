
/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode answerNodeHolder = new ListNode(0);
		ListNode answerNode = answerNodeHolder;
		int carry = 0;
		while((l1 != null) || (l2 != null)) {
			int sum = carry;
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
				System.out.println("l1 " + sum);
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
				System.out.println("l2 " + sum);
			}

			if(sum <= 9) {
				carry = 0;
			}
			else {
				carry = 1;
				sum = sum-10;
			}

			ListNode sumNode = new ListNode(sum);
			answerNode.next = sumNode;
			answerNode = answerNode.next;
		}
		if(carry > 0) {
			ListNode carryNode = new ListNode(carry);
			answerNode.next = carryNode;
		}
		return answerNodeHolder.next;
	}
}
