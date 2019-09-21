import java.util.Scanner;

public class Rocha_p02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int userOption;
		double weight;
		double height;
		double bmi;

		System.out.println("Press 1 if you wish to use pounds (lbs) and inches (in).");
		System.out.println("Press 2 if you wish to use Kilograms (kgs) and meters (m).");
		userOption = in.nextInt();
		
		if (userOption == 1) {
			System.out.println("Please enter your weight in pounds.");
			weight = in.nextDouble();
			
			System.out.println("Please enter you height in inches.");
			height = in.nextDouble();
			
			bmi = (703 * weight)/(height * height);
			
			System.out.printf("\nYour BMI is: %.2f\n\n",  bmi);
			System.out.println("\nAccording to the National Heart Lung and Blood Institute, these are the BMI categories:\n");
			System.out.println("<18.5: Underweight.\n18.5 - 24.9: Normal Weight.\n25 - 29.9: Overweight.\n30 or greater: Obese.\n");
			
			
		}
		
		else if (userOption == 2) {
			System.out.println("Please enter your weight in kilograms.");
			weight = in.nextDouble();
			
			System.out.println("Please enter you height in meters.");
			height = in.nextDouble();
			
			bmi = (double) weight/(height * height);
			
			System.out.printf("\nYour BMI is: %.2f\n\n",  bmi);
			System.out.println("\nAccording to the National Heart Lung and Blood Institute, these are the BMI categories:\n");
			System.out.println("<18.5: Underweight.\n18.5 - 24.9: Normal Weight.\n25 - 29.9: Overweight.\n30 or greater: Obese.\n");
			
			
		}
		
	}

}
