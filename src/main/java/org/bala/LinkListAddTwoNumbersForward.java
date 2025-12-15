package org.bala;

import java.util.Stack;

public class LinkListAddTwoNumbersForward {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode temp = this;

            while (temp != null) {
                sb.append(temp.val);
                if (temp.next != null) sb.append(" -> ");
                temp = temp.next;
            }

            return sb.toString();
        }
    }
    public static void main(String[] args) {
        ListNode l1 = buildList(new int[]{2,4,3,4});
        ListNode l2 = buildList(new int[]{5,6,4,4});

        ListNode result=addTwoList(l1,l2);
        ListNode reversedSum=addTwoListResversed(l1,l2);
        System.out.println("Result List:=:"+result);
        System.out.println("Reversed List:=:"+reversedSum);
    }
    public static ListNode buildList(int[] arr) {
        ListNode head = null, tail = null;
        for (int num : arr) {
            ListNode newNode = new ListNode(num);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static ListNode addTwoList(ListNode l1, ListNode l2){

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
         ListNode result=null;

        int carry=0;
        while (!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            int sum=carry;
            if(!s1.isEmpty()){
                sum=sum+s1.pop();
            }
            if(!s2.isEmpty()){
                sum=sum+s2.pop();
            }
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            newNode.next=result;
            result=newNode;
        }
        return result;
}


  public static ListNode addTwoListResversed(ListNode l1,ListNode l2){

        ListNode result=new ListNode(0);
        ListNode cheker=result;
        int carry=0;
        while (l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            carry=sum/10;
            cheker.next=new ListNode(sum%10);
            cheker=cheker.next;

        }

        return result.next;
  }
}
