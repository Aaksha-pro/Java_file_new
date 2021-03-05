package com.R1772109002.q1;
import java.io.IOException;
import java.util.Scanner;
public class Combination {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[3];
		System.out.println("enter any 3 digits number:\t");
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		for(int k=0;k<3;k++) {
			for(int j=0;j<3;j++) {
				for(int x=0;x<3;x++) {
					if(k!=j&&j!=x&&x!=k) {
						System.out.println(arr[k]+" "+arr[j]+" "+arr[x]);
					}
				}
			}
		}
		
		

	}

}
