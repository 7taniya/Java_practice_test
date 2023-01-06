import java.util.Scanner;

public class PQ25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount: ");
		int amt=sc.nextInt();
		int currency[]={2000,500,200,100,50,20,10,5,2,1};
		for(int i=0;i<currency.length;i++) {
			if(amt/currency[i]>=1) {
				System.out.println(currency[i]+" : "+amt/currency[i]);
				amt=amt%currency[i];
			}
		}
	}

}
