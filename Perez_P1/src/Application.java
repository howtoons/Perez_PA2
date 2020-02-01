import java.util.Scanner;
// create a menu of choices for the user
public class Application {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);
		int choice;
		
		do{
			System.out.printf("\nEnter 1 to encrypt, 2 to decrypt, 3 to exit \n ");
			
			choice = inp.nextInt();
			
			switch(choice) {
			case 1 :
				Encrypter.EncryptFromUser();
				break;
			case 2 :
				Decrypter.DecryptFromUser();
				break;
			}
			
			
		}while(choice != 3);
		inp.close();
		
		System.out.print("\nThanks for using my program, I hoped it worked!");
	}
	
	
}
