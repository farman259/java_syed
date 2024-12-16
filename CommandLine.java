package com.jit.thirdsem;

public class CommandLine {
	public static void main(String[] args) {
		if(args.length>0)
		{
			for(int i=0; i< args.length;i++)
				System.out.println("arg"+i+" is "+ args[i]);
		}
	}

}
