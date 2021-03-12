package day2;

//Assignment Day-2
public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,5,9,4};
		//Find Total, Even and Odd Sum
		int evensum=0, oddsum=0, total=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evensum+=a[i];
			else
				oddsum+=a[i];
		}
		total=evensum+oddsum;
		System.out.println("Total Sum : "+total);
		System.out.println("Even Sum : "+evensum);
		System.out.println("Odd Sum : "+oddsum);
		
		//Find Min and Max no
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		
		//Sort the Array Elements
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
