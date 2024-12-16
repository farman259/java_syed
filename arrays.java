package com.jit.thirdsem;

public class arrays {
	int arr[][]= {{1,2,7},{4,3,2},{8,3,5}};
	public static void main(String[] args)
	{
		arrays obj=new arrays();
		System.out.println("row Major");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(obj.arr[i][j]+" ");
		System.out.println("coloumn Major");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				System.out.println(obj.arr[j][i]+" ");
	}

}
