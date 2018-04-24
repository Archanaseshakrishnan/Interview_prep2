package CTC;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int sum=0,carry=0;
        ListNode temp1 = l1, temp2 = l2, result=null;
        while(temp1 != null){
            if(temp2 != null){
                sum=(temp1.val+temp2.val+carry)%10;
                if(result==null){
                    result=new ListNode(sum);
                    result.next = null;
                }
                else{
                    ListNode temp = result;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    ListNode now = new ListNode(sum);
                    now.next=null;
                    temp.next=now;
                }
                carry = (temp1.val+temp2.val)/10;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else{
                break;
            }
        }
        if(temp1==null){
            while(temp2!=null){
                sum=(temp2.val+carry)%10;
                if(result==null){
                    result=new ListNode(sum);
                    result.next = null;
                }
                else{
                    ListNode temp = result;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    ListNode now = new ListNode(sum);
                    now.next=null;
                    temp.next=now;
                }
                carry = (carry+temp2.val)/10;
                temp2 = temp2.next;
            }
        }
        else if (temp2==null){
            while(temp1!=null){
                sum=(temp1.val+carry)%10;
                if(result==null){
                    result=new ListNode(sum);
                    result.next = null;
                }
                else{
                    ListNode temp = result;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    ListNode now = new ListNode(sum);
                    now.next=null;
                    temp.next=now;
                }
                carry = (carry+temp1.val)/10;
                temp1 = temp1.next;
            }
        }
        if(carry!=0){
            ListNode temp = result;
            while(temp.next!=null){
                temp=temp.next;
            }
            ListNode now = new ListNode(carry);
            now.next=null;
            temp.next=now;
        }
        return result;
    }
    public ListNode reverse(ListNode l1){
        ListNode currNode=l1,nextNode=null,prevNode=null;
        
        while(currNode!=null){
             nextNode = currNode.next;
             currNode.next = prevNode;
             prevNode = currNode;
             currNode = nextNode;
        }
        l1=prevNode;
        return l1;
    }
}
public class Reverse_and_add_singly_ll {
public static void main(String args[]){
	
}
}
