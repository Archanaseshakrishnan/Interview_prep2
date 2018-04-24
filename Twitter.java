package CTC;

import java.util.Scanner;

public class Twitter {
public static void main(String args[]){
	String email1, ph;
	System.out.print("E: ");
	Scanner sc = new Scanner(System.in);
	email1=sc.nextLine();
	System.out.print("P: ");
	ph=sc.nextLine();
	StringBuilder sb = new StringBuilder("nileshkemse@gmail.com");
	char c = 0;
	int i;
	for (i = 1; i < sb.length() && sb.charAt(i) != '@'; ++i) {
		c=sb.charAt(i);
		sb.setCharAt(i, '*');
	  
	}
	if(sb.charAt(i)=='@')
	sb.setCharAt(i-1,c);
	String email = sb.toString();
	System.out.println("E: "+email);
	StringBuilder sb1 = new StringBuilder("+1 (480)-410-9942");
	for(i=0;i<sb1.length() && i<sb1.length()-4;i++){
		if(sb1.charAt(i)=='+'){
			continue;
		}
		else if(Character.isWhitespace(sb1.charAt(i)) || sb1.charAt(i)=='-'){
			sb1.setCharAt(i,'_');
		}
		else if(sb1.charAt(i)=='(' || sb1.charAt(i)==')'){
			sb1.deleteCharAt(i);
			i--;
		}
		else{
			sb1.setCharAt(i, '*');
		}
	}
	String number=sb1.toString();
	System.out.println("P: "+number);
}
}
