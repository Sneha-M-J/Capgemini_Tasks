package day2;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int jag[][]=new int[4][];  //no of columns not fixed so not mentioned
		jag[0]=new int[3]; 
		jag[1]=new int[5];
		jag[2]=new int[2];
		jag[3]=new int[7];
		for(int i=0;i<jag.length;i++)
		{
			for(int j=0;j<jag[i].length;j++)
			{
				System.out.print(jag[i][j]+" ");
			}
			System.out.println();
		}
	}

}
