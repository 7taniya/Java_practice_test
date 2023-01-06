import java.util.Scanner;

public class PQ3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tmarks = 0;
		double marks[][][]=new double[3][2][3];
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.println("Marks of "+(j+1)+" Student of department "+(i+1));
				for(int k=0;k<marks[i][j].length;k++) {
					marks[i][j][k]=sc.nextDouble();
				}
			}
		}
		System.out.println("Total marks of Students: ");
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				for(int k=0;k<marks[i][j].length;k++) {
					tmarks+=marks[i][j][k];
				}
				System.out.print(tmarks+" ");
			}
		}

	}

}
