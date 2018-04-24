package CTC;
/*
 * String concatenation takes O(n^2) times
 * So use string buffer else
 * 
 * */
public class String5String_compression {
public static void main(String args[]){
	System.out.println(comp("wwee"));
	System.out.println(comp("wweeef"));
	System.out.println(comp("aaabcccccaaa"));
	System.out.println(comp("we"));
}
public static String comp(String word){
	StringBuffer newword=new StringBuffer();
	int count=1;
	char c;
	for(int i=0;i<word.length();i++){
		c=word.charAt(i);
		if(i+1<word.length()){
		if(word.charAt(i)==word.charAt(i+1)){
			//c=word.charAt(i);
			count++;
		}
		else{
			newword.append(c);
			newword.append(count);
			//newword=newword+String.valueOf(c)+String.valueOf(count);
			count=1;
		}
		}
		else{
			newword.append(c);
			newword.append(count);
		}
	}
	if(newword.length()>word.length())
		return word;
	else
		return newword.toString();
}
}
