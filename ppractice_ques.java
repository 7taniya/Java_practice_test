package lab2;

import java.util.Scanner;

public class ppractice_ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no. of elements:");
		 int n=sc.nextInt();
		 double tmarks = 0,perc;
		 double marks[]=new double[n];
		 System.out.println("Enter the marks");
		 for(int i=0;i<n;i++)  {
				 marks[i]=sc.nextDouble();
				 
		 }
		 for(int i=0;i<marks.length;i++) {
			 tmarks+=marks[i];
		 }
		 perc=tmarks/n;
		 System.out.println(tmarks+"\t"+perc);
		 }
	
		

	}


