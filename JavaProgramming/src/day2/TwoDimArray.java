package day2;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		int a[][]=new int[4][5];
		System.out.println(a.length);
		System.out.println(a[0].length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		a[1][4]=10;
		a[2][2]=20;
		a[3][1]=30;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
