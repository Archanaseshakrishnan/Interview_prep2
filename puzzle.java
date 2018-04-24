package CTC;

public class puzzle {
public static void main(String args[]){
	int[][] matrix=new int[20][20];
	for(int i=1;i<=9;i++)
	matrix[i][4]=1;
	matrix[10][3]=1;
	String dir="N	E	W	N	N	S	E	E	E	N	N	N	E	N	W	N	E	E	S	N	N	E	W	S	E	N	E	E	S	W	N	N	S	N	E	N	S	N	W	W	W	S	S	S	E	W	S	S	W	S	E	S	W	W	N	E	W	W	W	N	E	N	W	N	N	N	E	W	E	N	S	N	S	S	N	E	E	E	E	E	W	S	E	W	E	E	W	N	S	N	N	S	N	W	W	E	S	W	W";
	String w=dir.replaceAll("\\s", "");
	System.out.println(w);
	int r=0;c=0;
	char[] d=new char[w.length()];
	d = w.toCharArray();
	int i=0;
	while(d[i]!='\0'){
		if(d[i]=='N'){
			r-1;
		}
		else ifif(d[i]=='N')
	}
}
}
