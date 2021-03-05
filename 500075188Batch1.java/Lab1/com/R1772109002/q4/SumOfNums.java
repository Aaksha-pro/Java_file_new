package com.R1772109002.q4;
public class SumOfNums {

	public static void main(String[] args){
		int sum =0;
		System.out.println("numbers greater than 40 and less than 250 that are divisible by 5:-\t");
		for(int i=40;i<250;i++) {
			if(i%5==0) {
				sum =sum + i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of numbers greater than 40 and less than 250 that are divisible by 5:-\t"+sum);
	}

}
