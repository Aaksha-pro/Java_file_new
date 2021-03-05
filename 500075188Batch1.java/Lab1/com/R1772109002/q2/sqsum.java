package com.R1772109002.q2;
import java.io.IOException;
import java.util.Scanner;
public class sqsum {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("enter any 10 numbers in array:\t");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<10;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of these numbers is:-\t" + sum);
		System.out.println("square of each number of array is:-");
		for(int i=0;i<10;i++) {
			arr[i]=arr[i]*arr[i];
			System.out.println(arr[i]);
		}
	}
}
