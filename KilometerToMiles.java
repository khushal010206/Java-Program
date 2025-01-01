import java.util.Scanner;
public class KilometerToMiles
{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter Kilometer :" );
		int KM = sc.nextInt();
		double miles = (double)KM*0.6;
		System.out.println("Miles :"+miles +" Miles");
	}
}
