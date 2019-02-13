package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String n = JOptionPane.showInputDialog("how many nickels do you have?");
int N =Integer.parseInt(n);
//Convert their answer to an int using Integer.parseInt()
		// Ask the user how many dimes they have, and convert their answer
String d = JOptionPane.showInputDialog("how many dimes do you have?");
int D=Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
String q = JOptionPane.showInputDialog("how many quarters do you have?");
int Q=Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable 
double money =(Q*25+D*10+N*5)*.01;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "you have $"+money);
String sandwich = JOptionPane.showInputDialog("what type of sandwich do you want?");
if(sandwich.equals("tuna")) {
	JOptionPane.showMessageDialog(null, "I made you a tuna sandwich");
}
else if(sandwich.equals("peanut butter and jelly")) {
	JOptionPane.showMessageDialog(null, "I made you a peanut butter and jelly sandwich");
}
else if(sandwich.equals("banana")) {
	JOptionPane.showMessageDialog(null, "I made you a banana sandwich");
}
else if(sandwich.equals("hotdog")) {
	JOptionPane.showMessageDialog(null, "I made you a hotdog");
}
else if(sandwich.equals("salami and bacon")) {
	JOptionPane.showMessageDialog(null, "I made you a salami and bacon sandwich");
}
else if(sandwich.equals("french dip")) {
	JOptionPane.showMessageDialog(null, "I made you a french dip sandwich");
}
else if(sandwich.equals("egg salad")) {
	JOptionPane.showMessageDialog(null, "I made you an egg salad sandwich");
}
else if(sandwich.equals("ham and cheese")) {
	JOptionPane.showMessageDialog(null, "I made you a ham and cheese sandwich");
}
else if(sandwich.equals("poop")) {
	JOptionPane.showMessageDialog(null, "I made you a poop sandwich");
}
else if(sandwich.equals("human")) {
	JOptionPane.showMessageDialog(null, "I made you a human sandwich (are you a cannibal?)");
}
else {
	JOptionPane.showMessageDialog(null, "I can't make that kind of sandwich yet");
}
	}
}

