import java.util.Scanner;
/*
 * Prompt user to enter a value
 * 
 * check that value entered is valid
 * 
 * split value up 
 * 
 * decrypt each digit, decryption will be a shift by 3, with another mod 10
 * 7+3= 10, undoing the original mod 10. 
 * 
 * print encryption to user
 * 
 */
public class Decrypter {

	public static void DecryptFromUser(){
		 
		final Scanner in = new Scanner(System.in);

		System.out.print("Enter Value To Decrypt \n");
		int input ;
		do {
			 input =in.nextInt();

		}while(input>9999||input<0);
		
		int temp=input;
		int[] digits= new int[4];
		
		for(int i=3; i>=0;i--) {
			digits[i]=temp%10;
			temp=temp/10;	
			
			digits[i]=(digits[i]+3)%10;
			}
		
		System.out.print("Decrypted Value is: ");
		
		for(int i=0;i<4;i++) {
			System.out.print(digits[i]);
		}
		
		
		
		
	}
	
}
