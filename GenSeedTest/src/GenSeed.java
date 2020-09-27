import java.util.Random;

public class GenSeed {

	public static void main(String[] args) {
		
		//array to store letters
		final String[] ALPHA = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		int seedLength = genSeedLength();
		
		//array to store generated seed
		String[] seed = new String[seedLength];
		
		//loop to store seed
		for (int p = 0; p < seedLength; p++) {
		
		//variable and method to determine if generate number or letter
		int i = genGen();
		
		//variable to determine if letter should be lower or upperCase
		int z = 0;
		
		//determine if generate number or letter
		if (i == 0) {
			//generate number
			System.out.print(genNumber());
		}else {
			//determine if letter should be lower or upperCase
			z = genAlpha();
		if (z == 0) {
			//lowerCase
			System.out.print(ALPHA[genLetter()].toLowerCase());
		}else {
			//upperCase
		System.out.printf(ALPHA[genLetter()].toUpperCase());
	}
		}
		}
		
		/*alternative way of printing out the results after all calculations have been made
		 You would have to replace all of the print statements with seed[p] = */
		
		/*for (int k = 0; k < seedLength; k++)
		System.out.print(seed[k]);
		*/
		
	}
	
	private static int genSeedLength() {
		//generate random number for seed length
		Random r = new Random();
		int low = 23;
		int high = 30;
		//number to determine length of seed
		int seedLength = r.nextInt(high-low) + low;
		return seedLength;
	}
	
	//method to find out whether to generate number or letter
	private static int genGen() {
	int i = 0;
	i = (int) Math.round(Math.random());
	return i;
}
	//method to find out whether to generate upper or lowerCase
	public static int genAlpha() {
		int z = 0;
		z = (int)Math.round(Math.random());
		return z;
	}
	
	//method to generate number 0-9
	public static String genNumber() {
		int x = 0;
		x = (int)(Math.random() * 10);
		String numString = Integer.toString(x);
		return numString;
	}
	
	////method to generate number to be changed into letter 1-26
	private static int genLetter() {
		Random l = new Random();
		int bottom = 0;
		int top = 26;
		//number to determine length of seed
		int letter = l.nextInt(top-bottom) + bottom;
		return letter;
	}
}
