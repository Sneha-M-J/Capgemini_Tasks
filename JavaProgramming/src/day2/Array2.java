package day2;

public class Array2 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		int b[][]= {{1,2,3},{4,5,6}}; //2-D Array
		System.out.println("2-D Array");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		int c[][]= {{1,2,3},{4,5},{6},{7,8,9,10}};  //Jagged Array
		System.out.println("Jagged Array");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
