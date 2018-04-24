package CTC;

import java.util.HashSet;

public class String3one_string_permutation_of_another {
public static void main(String args[]){
	System.out.println(check("cat","cat"));
}
public static boolean check(String a, String b){
	if(a.length()==b.length()){
		HashSet<Character> hs=new HashSet<Character>();
		HashSet<Character> hs2=new HashSet<Character>();
		for (int i=0;i<a.length();i++){
			hs.add(a.charAt(i));
		}
		for (int i=0;i<b.length();i++){
			hs2.add(b.charAt(i));
		}
		System.out.println(hs.toString());
		System.out.println(hs2.toString());
		if (hs.toString().equals(hs2.toString()))
			return true;
		else return false;
	}
	else 
		return false;
	
}
}
