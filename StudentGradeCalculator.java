import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int m=sc.nextInt();
		int i;
		int sum=0;
		for(i=1;i<=m;i++) {
			System.out.println("Enter the marks in subject "+ i +"(out of 100):");
			int n=sc.nextInt();
			sum=sum+n;
		}
		System.out.println("The average percentage of student is:");
		double avgPercent=(double)sum/m;
		System.out.println(avgPercent);
		char grade=calculateGrade(avgPercent);
		System.out.println("Results:");
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Percentage: " + avgPercent+ "%");
        System.out.println("Grade: " + grade);
		
	}
	public static char calculateGrade(double avgPercent) {
		if (avgPercent >= 90) {
            return 'A';
        } 
		else if (avgPercent >= 80) {
            return 'B';
        } 
		else if (avgPercent >= 70) {
            return 'C';
        } 
		else if (avgPercent >= 60) {
            return 'D';
        } 
		else {
            return 'F';
        }
	}

}
