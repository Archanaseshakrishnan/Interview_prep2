package CTC;
/*
 * Another idea: put it in arraylist as characters and sort then compare?? 
 * think about it the partition may be several
 *Understand this question carefully this solution is flawed
 * */
public class String8Str_rotation {
public static void main(String args[])
{
System.out.println(rote("waterbottle","bottlewater"));	
}
public static boolean rote(String a, String b){
	if(a.length()!=b.length())
	return false;
	else{
		int i;
		for(i=0;i<a.length()-1;i++){
			String w1=a.substring(0, i+1);
			//System.out.println(w1);
			String w2=a.substring(i+1);
			//System.out.println(w2);
			w1 = w2+w1;
			//System.out.println(w1);
			if(b.equals(w1))
				return true;
		}
		return false;
		
	}
}
}
