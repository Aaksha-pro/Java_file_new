package com.R1772109002.q5;
import java.io.IOException;
import java.util.Scanner;
public class StuMarks {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no. of elements you want in array:");
	    n = sc.nextInt();
		int temp =0;
		int arr[]=new int[n];
		String grade[] = new String[n];
		System.out.println("enter numbers of students:\t");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[n - 1]);
        System.out.println(" ");
        for(int i=0;i<n;i++) {
        	if(arr[i]>=40&&arr[i]<=50) {
            	grade[i]="Pass";
            }
            else if(arr[i]>=51&&arr[i]<=75) {
            	grade[i]=" Merit";
            }
            else if(arr[i]>75) {
            	grade[i]=" Distinction";
            }
            else {
            	grade[i]=" Fail";
            }
        }
        System.out.println("\tTABLE\t");
        System.out.println("MARKS\t"+"GRADES\t");
        for (int i=0;i<n;i++) {
        	System.out.println(arr[i]+"\t"+grade[i]);
        
        }
	}
}


