package charAt_scanners_optionDialogs;
import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {
	
	 // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		Random BOb = new Random();
	int bOb =	BOb.nextInt(10);
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String bob = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
	// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
for (int i=-0;i<bOb;i++) {
int Bob = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "cuddle", "feed", "give water", "walk", "groom", "clean up poop" }, null);
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
System.out.println(Bob);
			// 5. Use user input to call the appropriate method created in step 4.
if (Bob == 1) {
cleanUpPoop();	
}
if (Bob == 2) {
cuddle();	
}

if (Bob == 3) {
food();	
}

if (Bob == 4) {
water();	
}

if (Bob == 5) {
walk();	
}

if (Bob == 6) {
groom();	
}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel==bOb) {
	JOptionPane.showMessageDialog(null, "Your "+bob+" loves you");
}
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

static void cuddle() {
happinessLevel=happinessLevel+1;	
}
static void cleanUpPoop() {
happinessLevel=happinessLevel+1;	
}

static void groom() {
happinessLevel=happinessLevel+1;	
}

static void walk() {
happinessLevel=happinessLevel+1;	
}

static void water() {
happinessLevel=happinessLevel+1;	
}

static void food() {
happinessLevel=happinessLevel+1;	
}


}




