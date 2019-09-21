import java.util.Scanner;

public class Rocha_p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int userInput;
		int userChoice;
		int[] numbers = new int[4];
		int temp;
		boolean quit = false;
		
		
		
		while (!quit) {
			System.out.println("Press 1 if you wish to encrypt.\nPress 2 if you wish to decrypt.\nPress 3 if you wish to quit.");
			userChoice = in.nextInt();
			
			if (userChoice == 1) {
			
				System.out.println("Please, enter the 4 digits you wish to encrypt:");
				userInput = in.nextInt();
				
				for (int i=3; i>=0; i--) {
					numbers[i] = userInput % 10;
					userInput /= 10;
				}
				
				for (int i=0; i<4; i++) {
					numbers[i] += 7;
					numbers[i] = numbers[i] % 10;
				}
				
				temp = numbers[0];
				numbers[0] = numbers[2];
				numbers[2] = temp;
				
				temp = numbers[1];
				numbers[1] = numbers[3];
				numbers[3] = temp;
				
				System.out.println("Encrypted number: ");
				
				for (int i=0; i<4; i++) {
					System.out.print(numbers[i]);	
				}
				
				System.out.print("\n\n");
			}
			
			else if (userChoice == 2) {
				System.out.println("Please, enter the 4 digits you wish to encrypt:");
				userInput = in.nextInt();
				
				for (int i=3; i>=0; i--) {
					numbers[i] = userInput % 10;
					userInput /= 10;
				}
				
				for (int i=0; i<4; i++) {
					if (numbers[i]>= 7) {
						numbers[i] -= 10;
					}
					numbers[i] += 3;
				}
				
				temp = numbers[0];
				numbers[0] = numbers[2];
				numbers[2] = temp;
				
				temp = numbers[1];
				numbers[1] = numbers[3];
				numbers[3] = temp;
				
				System.out.println("Decrypted number: ");
				
				for (int i=0; i<4; i++) {
					System.out.print(numbers[i]);
				}
			
				System.out.print("\n\n");
			}
			
			else if (userChoice == 3)
				quit = true;
			
			else
				System.out.println("Please enter a valid numnber\n.");
			
			}
		}
	}