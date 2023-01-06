import java.util.Scanner;

public class P_Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the elements: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
