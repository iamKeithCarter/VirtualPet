
//import java.util.Scanner;

public class VirtualPet {

	//Scanner scanner = new Scanner(System.in);
	
	private String itsName = "";
	
	private int hungerFactor;
	private int thristFactor;
	private int sleepFactor;
	private int wasteFactor;
	private int playFactor;
	
	private long startTrackingTime = System.currentTimeMillis();
	private long initialLoopTime = 0;
	
	private int thirst;
	private int hunger = 0;
	private int sleep;
	private int waste;
	private int playfulness;
	private int numberOfTicksPast;
	
	


	public int tick() {
		initialLoopTime = System.currentTimeMillis();
		long timepast = initialLoopTime - startTrackingTime;
		startTrackingTime = initialLoopTime;
		numberOfTicksPast = (int) (timepast / 3) / 1000;
		return numberOfTicksPast;
	}
	
	

	
	public int chooseAttributeFactors(int input) {
	
		if (input == 1) {/// feed

			hungerFactor = +(-5);
			thristFactor = +(2);
			sleepFactor = +(2);
			playFactor = +(-2);
			wasteFactor = +(2);

			return input;

		} else if (input == 2) {/// water

			hungerFactor = +(-2);
			thristFactor = +(-3);
			sleepFactor = +(-1);
			playFactor = +(-1);
			wasteFactor = +(2);

			return input;

		} else if (input == 3) {/// sleep

			hungerFactor = +(-2);
			thristFactor = +(1);
			sleepFactor = +(-5);
			playFactor = +(-1);
			wasteFactor = +(1);

			return input;

		} else if (input == 4) {// play

			hungerFactor = +(4);
			thristFactor = +(5);
			sleepFactor = +(3);
			playFactor = +(-3);
			wasteFactor = +(2);

			return input;

		} else if (input == 5) {// clean

			hungerFactor = +(1);
			thristFactor = +(1);
			sleepFactor = +(-1);
			playFactor = +(-1);
			wasteFactor = +(-4);

			return input;
		}

		return input;

	}
	

	public int hungerStatus() {

		hunger = hunger + hungerFactor + numberOfTicksPast;
		return hunger;
	}

	public int thristStatus() {
		thirst = thirst + thristFactor + numberOfTicksPast;
		return thirst;
	}

	public int sleepStatus() {
		sleep = sleep + sleepFactor + numberOfTicksPast;
		return sleep;
	}

	public int playStatus() {
		playfulness = playfulness + playFactor + numberOfTicksPast;
		return playfulness;
	}

	public int wasteStatus() {
		waste = waste + wasteFactor + numberOfTicksPast;
		return waste;
	}


	public String hungerString() {
		if (hunger <= 0) {

		} else if (hunger > 0 && hunger < 20) {
			return (", a little hungry" + " (bark)");
		} else if (hunger > 30 && hunger <= 80) {
			return (" very hungry" + " (BARK),(BARK)");
		} else if (hunger > 80) {
			return (" GROWL");
		}
		return (" Full");
	}

	public String thristString() {
		if (thirst <= 0) {

		} else if (thirst > 0 && thirst < 30) {
			return (", a little thiristy" + " (bark)");
		} else if (thirst > 30 && thirst <= 60) {
			return (", parched " + " (BARK) (BARK)");
		}else if (thirst >60) {
			return (", Weakeyed and breathing shallowly");
		}
		return (", Hydrated");

	}

	public String sleepString() {
		if (sleep <= 0) {

		} else if (sleep > 0 && sleep < 20) {
			return (", a little sleepy" + " bark");
		} else if (sleep > 30 && sleep < 60) {
			return (", exhausted and " + itsName + "'s eyes won't open");
		} else if (sleep > 60 && sleep < 80) {
			return (", sleep");
		}
		return (", Playful");

	}

	public String playfulnessString() {
		if (playfulness <= 0) {

		} else if (playfulness > 0 && playfulness <= 40) {
			return (", wants to play (yap)");
		} else if (playfulness > 40 && playfulness <= 80) {
			return (", standing at the door with the leash");
		} else if (playfulness > 80) {
			return (", Ran away");
		}
		return (", Calm");

	}

	public String wasteString() {
		if (waste <= 0) {

		} else if (waste > 0 && waste < 20) {
			return (", a little pooey" + " (bark)");
		} else if (waste > 30 && waste < 60) {
			return (", living in poo" + " (BARK) (BARK)");
		}else if (thirst > 60 && thirst <=80) {
				return (", parched " + " (BARK) (BARK)");
		}else if (thirst >80) {
			return (", whimpering " + " (whimper)");
		}
		return (", Smelling great");

	}
	
	

	public boolean isPetAlive() {
		
		if (thirst >= 100 || hunger >= 100 || sleep>= 100 || playfulness>= 100 || waste > 100) {
			//System.out.println(itsName + "is quite and not moving please bury " + itsName);
			return false ;
		}

		return true;
	}

}
