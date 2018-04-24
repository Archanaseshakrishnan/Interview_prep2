package CTC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GS {
public static void main(String args[]){
	String[][] d=new String[][]{{"Bobby","87"},{"Charles","100"},{"Eric","64"},{"Charles","22"}};
	System.out.println(bg(d));
}
public static int bg(String[][] marks){
	HashMap<String,ArrayList<Integer>> hm=new HashMap<String,ArrayList<Integer>>();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	HashSet<String> names=new HashSet<String>();
	
	for(int i=0;i<marks.length;i++){
		names.add(marks[i][0].toLowerCase());
		if(hm.get(marks[i][0])==null){
			arr.add(Integer.parseInt(marks[i][1]));
			hm.put(marks[i][0], arr);
			
		}
		else{
			arr = hm.get(marks[i][0]);
			arr.add(Integer.parseInt(marks[i][1]));
		}
		arr=new ArrayList<Integer>();
	}
	System.out.println(names);
	ArrayList<String> names2=new ArrayList<String>(names);
	arr=new ArrayList<Integer>();
	
	int max=-1;
	int sum = 0;
    for(int i=0;i<names.size();i++){
    	arr=hm.get(names2.get(i));
    	for(int j=0;j<arr.size();j++)
    		sum = sum+arr.get(j);
    	
    	sum=sum/arr.size();
    	if(sum>max)
    		max=sum;
    	sum=0;
    }
    System.out.println(max);
    
    return (max);
	
	
}
}
