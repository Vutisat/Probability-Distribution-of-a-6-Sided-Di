// Author: Vutisat

public class DiceSim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("# of Rolls 1s     2s     3s     4s     5s     6s  ");
		System.out.println("====================================================");
		System.out.println("10         ");
		rollingDice(10);
	}
	
	public static void rollingDice(int n){
		
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		
		for(int i = 0; i < n; i++){
			int roll;
			roll = (int) (Math.random() * (6 - 1) + 2);
			
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
		
		System.out.print(ones + " ");
		System.out.print(twos + " ");
		System.out.print(threes + " ");
		System.out.print(fours + " ");
		System.out.print(fives + " ");
		System.out.print(sixes + " ");
	}

}
