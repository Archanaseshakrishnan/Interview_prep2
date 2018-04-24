package CTC;

import java.util.HashMap;

public class two_oper {
public static void main(String args[]){
	long[] arr={1,2,3,5};
	int[] result=new int[arr.length];
	result=countOperationsToK(arr);
	for(int i=0;i<arr.length;i++)
		System.out.println(result[i]);	

}

/*
 * Complete the function below.
 */
static int[] countOperationsToK(long[] kValues) {
    
    int[] arr=new int[kValues.length];
    HashMap<Long,Integer> hm=new HashMap<Long, Integer>();
    for(int i=0;i<kValues.length;i++){
        arr[i]=fun(1,kValues[i],0,hm);
      hm=new HashMap<Long, Integer>();
    }
return arr;

}

static int fun(long value,long orig,int count,HashMap<Long,Integer> hm){
int c1,c2;
System.out.print("value: ");
System.out.println(value);
System.out.print("orig: ");
System.out.println(orig);
System.out.print("count: ");
System.out.println(count);
if(value==orig)
{   hm.put(value, count);
	return count;
	}
else{
	if(value<orig){
		if(value*2==orig){
		c1=count+1;
		}
		else if(value*2>orig){
			c1=Integer.MAX_VALUE;
		}
		else{
    if(hm.get(value*2)!=null){
    	
        c1=hm.get(value*2);
    }
    else{
        c1=Math.min(fun(value*2*2,orig,count+1,hm),fun(value*2+1,orig,count+1,hm));
        hm.put(value*2,c1);
    }
    }
		if(value+1==orig)
			c2=count+1;
		else if(value+1>orig)
			c2=Integer.MAX_VALUE;
		else{
    if(hm.get(value+1)!=null){
        c2=hm.get(value+1);
    }
    else{
        c2=Math.min(fun((value+1)*2,orig,count+1,hm),fun((value+1)+1,orig,count+1,hm));
         hm.put(value+1,c2);
    }
		}
  return Math.min(c1,c2);
}
	else
		return Integer.MAX_VALUE;
}

}


}
