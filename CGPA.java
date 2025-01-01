import java.util.Scanner;
public class CGPA
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Subject 1 :");
	   int a = sc.nextInt();
	   System.out.println("Subject 2 :");
	   int b = sc.nextInt();
	   System.out.println("Subject 3 :");
	   int c =sc.nextInt();
	   int total = a + b + c;
	   float cgpa = (float)total/30;
	   System.out.print(  "CGPA :");
	   System.out.printf("%.2f%n", +cgpa);
	}
}
