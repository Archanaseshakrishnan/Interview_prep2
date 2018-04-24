package CTC;

public class String6Matrix_rotation_90 {
public static void main(String args[]){
	int[][] mat=new int[4][4];
	int count=1;
	for(int i=0;i<4;i++)
		for(int j=0;j<4;j++){
			mat[i][j]=count++;
		}
	for(int i=0;i<4;i++)
	{
	for(int j=0;j<4;j++)
	System.out.print(mat[i][j]);
	System.out.println("\n");
	}
	mat=rotate(mat);
	for(int i=0;i<4;i++)
		{
		for(int j=0;j<4;j++)
		System.out.print(mat[i][j]);
		System.out.println("\n");
		}
}
public static int[][] rotate(int[][] mat){
	int r=mat.length;
	int c=mat[0].length;
	for(int i=0;i<=r/2;i++)
		for(int j=i;j<c;j++){
			if(i!=j){
			int temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
			}
		}
	System.out.println("Transpose:");
	for(int i=0;i<4;i++)
	{
	for(int j=0;j<4;j++)
	System.out.print(mat[i][j]);
	System.out.println("\n");
	}
	for(int i=0;i<r;i++)
		for(int j=0;j<c/2;j++){
			int temp=mat[i][j];
			mat[i][j]=mat[i][c-1-j];
			mat[i][c-1-j]=temp;
		}
	 return mat;
}
}
