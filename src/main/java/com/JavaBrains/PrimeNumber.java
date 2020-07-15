package com.JavaBrains;

public class PrimeNumber {

	public boolean validate(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
