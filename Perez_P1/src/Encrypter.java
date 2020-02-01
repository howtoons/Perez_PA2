import java.util.Scanner;
/*
 * Prompt user to enter a value
 * 
 * check that value entered is valid
 * 
 * split value up 
 * 
 * encrypt each digit
 * 
 * print encryption to user
 * 
 */
public class Encrypter {
		
		public static void EncryptFromUser() {
			 final Scanner in = new Scanner(System.in);
			
			System.out.print("Enter Value To Encrypt\n ");
			int input ;
			do {
				 input =in.nextInt();

			}while(input>9999||input<0);
			
			int temp=input;
			int[] digits= new int[4];
			
			for(int i=3; i>=0;i--) {
				digits[i]=temp%10;
				temp=temp/10;	
				
				digits[i]=(digits[i]+7)%10;
				}
			
			System.out.print("Encrypted Value is: ");
			
			for(int i=0;i<4;i++) {
				System.out.print(digits[i]);
			}
			
			
			
			
			
		}
}
