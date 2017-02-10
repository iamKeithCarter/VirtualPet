import java.util.Scanner;

public class VirtualPetApp {

	static boolean alive;
	static boolean aNewPet;
	private static int input;
	private static String petName;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		VirtualPet myPet = new VirtualPet();

		do {
			System.out.println("Every pet needs a name, what would you like to name your pet?");

			 petName = scanner.next();

			introText();
			
			do {
				
				whatToDo();
			
				input = scanner.nextInt();
				myPet.chooseAttributeFactors(input);
				int RelativeTimeTicks = myPet.tick()*4;
				
				alive = myPet.isPetAlive();

				//myPetStutus();
				
				//private static void myPetStatus(){
					System.out.println();
					System.out.println("    "+(RelativeTimeTicks) +" hours have past since "+petName +" was cared for");
					System.out.println();
					System.out.println("    Hunger   " + "Thrist   " + "Sleep    " + "Boredom    " + "Clean Up ");
					System.out.println("    " + myPet.hungerStatus() + "        " + myPet.thristStatus() + "        "
							+ myPet.sleepStatus() + "        " + myPet.playStatus() + "           " + myPet.wasteStatus());

			//	}
				
				if (!alive) {
					System.out.println("");
					System.out.println("");
					System.out.println(petName + " is quite and not moving please bury " + petName);
					System.out.println("");

				} else if (alive) {
					System.out.println("");
					System.out.println("  " + petName + " is" + myPet.hungerString() + myPet.thristString()
							+ myPet.sleepString() + myPet.playfulnessString() + " and" + myPet.wasteString());
					System.out.println("");
				}

			} while (alive);

			System.out.println("");
			System.out.println("Would you like another Virtual Pet? 'yes' or 'no'");
			String newPet = scanner.next();
			aNewPet = newPet.equals("yes");
			if (aNewPet) {
				alive = true;
			} else {
				alive = false;
			}

		} while (aNewPet);

		scanner.close();

		
	}

	
	private static void introText(){
		System.out.println(" Say hello to " + petName );
		System.out.println();

		System.out.println(" Thanks for adopting " + petName + ". You should know that "+ petName );
		System.out.println(" is a Relative-Time pet. As such "+petName+"'s time-stream flows much ");
		System.out.println(" faster that yours, but if you feed, play with, and let " + petName + " rest,");
		System.out.println(" you will enjoy many many years with your new Virtual pet. ");
		System.out.println();

		System.out.println(" Please dont let any of " + petName + "'s needs go above 100 or " + petName
				+ " may become unresponsive");
		System.out.println();

		System.out.println("       I think " + petName + " loves you.  Awwwww.. Take care.");
		System.out.println();
		System.out.println();

		
	}
	
	private static void whatToDo() {
		System.out.println("What would you like to do for " + petName + "? Choose 1-5");
		System.out.println("");
		System.out.println("1 feed " + petName);
		System.out.println("2 give water to " + petName);
		System.out.println("3 let " + petName + " sleep");
		System.out.println("4 play with " + petName);
		System.out.println("5 clean up " + petName);

	
		
	}

}
