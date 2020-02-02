import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		BMICalculator.calculateFromUser();
		BMICalculator.displayCategories();		
	}
	
	private static void calculateFromUser() {
		Scanner in= new Scanner(System.in);
		
		
		System.out.println("Press 1 to calculate bmi from metric and 2 to calculate from imperial");
		
		
		
		int choice= in.nextInt();
		
		System.out.println("Enter height (inches/meters)");
		double height=in.nextDouble();
		
		System.out.println("Enter weight (pounds/kilos)");
		double weight=in.nextDouble();
		double BMI;
		
		if(choice==1) {
			BMI= weight/(height*height);
		}
		else {
			BMI= (703*weight)/(height*height);
		}
		
		System.out.println("BMI is "+BMI);
		in.close();
	}
	
	private static void displayCategories(){
		System.out.println("Underweight = <18.5\r\n" + 
				"Normal weight = 18.5–24.9\r\n" + 
				"Overweight = 25–29.9\r\n" + 
				"Obesity = BMI of 30 or greater");
	}
}
