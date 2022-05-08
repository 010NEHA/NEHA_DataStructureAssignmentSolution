package quest1;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
				
					Scanner input = new Scanner(System.in);
					
					System.out.print("Enter the total no of floors in the building: ");
					Building skyscraper = new Building( input.nextInt() );
					
					for(int i = 1; i <= skyscraper.getFloors(); i++) {
						System.out.printf("Enter the floor size given on day %d: ", i);
						skyscraper.add( input.nextInt() );
					}
					
					skyscraper.build();
					
					input.close();

				}
	
		
	}


