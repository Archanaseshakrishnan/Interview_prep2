package CTC;

import java.util.ArrayList;

/*
 * Idea : 
 * 1. substring i+3 till end
 * 2. i+3 till end replacement = " "
 * 3. use replaceAll function to empty the last half of the string
 * 4. concatenation with the new one
 * */
//more elegant solution approach from the back
public class String4space_replacement_20 {
public static void main(String args[]){
	System.out.println(repla("welcome honey"));
}
public static String repla(String sent){
	char nextchar;
	nextchar = sent.charAt(0);
	//ArrayList<Character> sent2=new ArrayList<Character>();
	/*for(int j=0;j<sent.length();j++)
		sent2.add(sent.charAt(j));*/
	int i=0;
	while(i<sent.length())
	{	
		nextchar = sent.charAt(i);
		if(nextchar == ' '){
		String newName = sent.substring(0,i)+"%20"+sent.substring(i+1);
		sent = newName;i+=3;
		}
		else
			i++;
		/*if(nextchar == ' '){
			if(i+1 < sent.length() && i+2 < sent.length() && i+3<sent.length() && i<sent.length()){
			String new1 = sent.substring(i+1);
			System.out.println(new1);
			sent.replace(sent.charAt(i), '%');
			sent.replace(sent.charAt(i+1), '2');
			sent.replace(sent.charAt(i+2), '0');
			System.out.println(sent);
			String new2 = sent.substring(i+3);
			System.out.println(new2);
			sent.replaceAll(new2, "");
			System.out.println(sent);
			sent=sent+new1;
			System.out.println(sent);
			i+=3;
			}
			else
				return sent;
		}
		else{
			
			i++;
		}
		if(i<sent.length())
		nextchar = sent.charAt(i);*/
		
	}
	return sent;
}
}
