package CTC;

public class String7row_col_set_to_zero {
public static void main(String args[]){
	int[][] mat={{1,2,3},{4,0,6},{7,8,9}};
	mat=change(mat);
	for(int i=0;i<mat.length;i++)
		{
		for(int j=0;j<mat[0].length;j++){
		System.out.print(mat[i][j]);
		}
		System.out.println();
		}
}
	public static int[][] change(int[][] mat){
		int[] row=new int[mat.length];
		int[] col=new int[mat[0].length];
	//	int r=0,c=0;
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[0].length;j++)
				if(mat[i][j]==0){
					row[i]=1;
					col[j]=1;
				}
		for(int i=0;i<row.length;i++)
			if(row[i]==1){
				for(int j=0;j<mat[0].length;j++)
					mat[i][j]=0;
			}
		for(int i=0;i<col.length;i++)
			if(col[i]==1){
				for(int j=0;j<mat.length;j++)
					mat[j][i]=0;
			}
		return mat;
	}
}
