// Author: Vutisat

public class DiceSim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("# of Rolls 1s     2s     3s     4s     5s     6s  ");
		System.out.println("====================================================");
		System.out.print("10         ");
		rollingDice(10);
		System.out.print("100        ");
		rollingDice(100);
		System.out.print("1000       ");
		rollingDice(1000);
		System.out.print("10000      ");
		rollingDice(10000);
		System.out.print("100000     ");
		rollingDice(100000);
		System.out.print("1000000    ");
		rollingDice(1000000);
	}
	
	public static void rollingDice(int n){
		
		double ones = 0;
		double twos = 0;
		double threes = 0;
		double fours = 0;
		double fives = 0;
		double sixes = 0;
		
		for(int i = 0; i < n; i++){
			int roll;
			roll = (int)(6.0 * Math.random()) + 1;
			
			if(roll == 1){
				ones++;
			}else if (roll == 2){
				twos++;
			}else if (roll == 3){
				threes++;
			}else if (roll == 4){
				fours++;
			}else if (roll == 5){
				fives++;
			}else if (roll == 6){
				sixes++;
			}
		}
		
		System.out.printf("%05.2f%2s", ((ones/n) *100), "% ");
		System.out.printf("%05.2f%2s", ((twos/n) *100), "% ");
		System.out.printf("%05.2f%2s", ((threes/n) *100), "% ");
		System.out.printf("%05.2f%2s", ((fours/n) *100), "% ");
		System.out.printf("%05.2f%2s", ((fives/n) *100), "% ");
		System.out.printf("%05.2f%2s%n", ((sixes/n) *100), "% ");
	}

}
