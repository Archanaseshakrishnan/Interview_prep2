package CTC;

import java.util.Arrays;
import java.util.HashMap;

public class acme {
public static void main(String args[]){
System.out.println(acme("baabccd"));	
}

private static int acme(String str) {
	// TODO Auto-generated method stub
	char[] ins=new char[str.length()];
	int[] value=new int[str.length()];
	String dup;
	HashMap<Character,String> hm=new HashMap<Character,String>();
	hm.put('a', "01");
	hm.put('b', "02");
	hm.put('c', "03");
	hm.put('d', "04");
	hm.put('e', "05");
	hm.put('f', "06");
	hm.put('g', "07");
	hm.put('h', "08");
	hm.put('i', "09");
	hm.put('j', "10");
	hm.put('k', "11");
	hm.put('l', "12");
	hm.put('m', "13");
	hm.put('n', "14");
	hm.put('o', "15");
	hm.put('p', "16");
	hm.put('q', "17");
	hm.put('r', "18");
	hm.put('s', "19");
	hm.put('t', "20");
	hm.put('u', "21");
	hm.put('v', "22");
	hm.put('w', "23");
	hm.put('x', "24");
	hm.put('y', "25");
	hm.put('z', "26");
	ins = str.toCharArray();
	int count=0,result=0;
	long min=Long.MAX_VALUE;
	String val="";
	for(int j=0;j<str.length();j++){
	for(int i=0;i<str.length();i++)
	{	
		val=val+hm.get(ins[i]);
	}
	System.out.println(val);
	if(min>Long.parseLong(val)){
		min=Long.parseLong(val);result=count;
		System.out.println(min);
	}
	val="";
	if(j+1<str.length()){
	dup=str.substring(j+1);
	System.out.println("here: "+dup);
	dup = dup+ins[j];
	System.out.println(dup);
	str=dup;
	ins = new char[str.length()];
	ins = dup.toCharArray();
	System.out.println(ins);
	count++;
	}
	}
	
	return result;
}

}
