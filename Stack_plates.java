package CTC;
class Stack1{
	int[] arr;
	int last;
	Stack1(int n){
		arr=new int[n];
	}
	Stack1(){
		arr=new int[1];
	}
}
public class Stack_plates {
Stack1 st;
Stack_plates(){
	st=new Stack1();
}
void push(int i,int t){
	int elt=st.arr[i];
	int l=st.last;
	if(elt!=0){//on the assumption that the stack size had been previously given
		for(int j=st.last;j>=i;j++)
			{st.arr[j+1]=st.arr[j];}
		st.last++;
	}
	else{
		if(st.last+1==i){
			st.arr[++st.last]=t;
		}
	}
}
void push(int i){
	st.arr[++st.last]=i;
}
int pop(){
	int elt=st.arr[st.last];
	st.last--;
	return elt;
}
}
