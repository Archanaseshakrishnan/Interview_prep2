package CTC;

public class string_builder {
public static void main(String args[]){
	System.out.println(change("aaabbcccdddd"));
}

public static String change(String word){
	char[] word1=new char[word.length()];
	char[] word2=new char[word.length()];
	word1=word.toCharArray();
	int j=0,count=1,i;
	for(i=1;i<word.length();i++){
		if(word1[i] == word1[i-1]){
			count++;
		}
		else{
			word2[j]=word.charAt(i-1);
			j++;
			word2[j] = (char) count;
			System.out.println(count);
			j++;
			count=1;
		}
	}
	word2[j]=word.charAt(i-1); 
	j++;
	word2[j]=(char)count;
	System.out.println(count);
	return String.copyValueOf(word2);
}
}
