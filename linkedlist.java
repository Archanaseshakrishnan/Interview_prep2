package CTC;
class llnode{
	int data;
	llnode next;
}
class ll {
llnode head;
ll(){
	head=null;
}
void insert(int data){
	llnode temp=head;
	if(head==null){
		//System.out.println("here");
		head=new llnode();
		head.data=data;
		head.next=null;
	}
	else{
		while(temp.next!=null){
			temp=temp.next;
		}
		llnode temp2=new llnode();
		temp2.data = data;
		temp2.next=null;
		temp.next=temp2;
	}
}
void printlist(){
	llnode temp=head;
	while(temp!=null){
		System.out.println(temp.data);
		temp=temp.next;
	}
}
}
public class linkedlist{
public static void main(String args[]){
	ll now=new ll();
	now.insert(5);
	now.insert(4);
	now.insert(3);
	now.insert(2);
	now.printlist();
	
}
}