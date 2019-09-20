package craps;

public class Main {

	public static void main(String[] args) {
		Main main1 = new Main();
		Integer rollValue1 = main1.rollDice();
		Integer rollValue2 = main1.rollDice();
		Integer sumOfDice = main1.addDice(rollValue1, rollValue2);
		String rollResult = main1.playFirstTry(sumOfDice);
		System.out.println(rollResult);
	}
	
	private Integer point = 0;
	
	
	public Integer rollDice() {
		return (int)(Math.random() * 6) + 1;
	} 
	
	public Integer addDice (Integer dice1, Integer dice2) {
		if (dice1 > 6 || dice2 > 6 || dice1 < 1 || dice2 < 1) {
			return null;			
		}
		return dice1 + dice2;
		
	}
	
	public String playFirstTry(Integer diceTotal) {
		if(diceTotal == 7 || diceTotal == 11) {
			System.out.println("You rolled a " + diceTotal);
			return "You Win!";
		}
		else if(diceTotal == 2 || diceTotal == 3 || diceTotal == 12) {
			System.out.println("You rolled a " + diceTotal);
			return "You Lose!";
		}
		else if(diceTotal > 12 || diceTotal < 2) {
			System.out.println("You rolled a " + diceTotal + ". That is out of range");
			return "Out Of Range";
		}
		else { 
			this.point = diceTotal;
			System.out.println("You rolled a " + diceTotal + " on your first roll.");
			System.out.println("You must now roll a " + this.point + " to win.");
			System.out.println("If you roll a 7, you lose.");
			return this.reRoll();
		}
	}
	
	private String reRoll() {
		Integer sum = 0;
		Integer val1;
		Integer val2;
		while(this.point != sum && sum != 7) {
			val1 = this.rollDice();
			val2 = this.rollDice();
			sum = this.addDice(val1, val2);
			System.out.println("You rolled a " + val1 + " and a " + val2);
		}
		if(this.point == sum) {
			return "You Win!";
		}else{
			return "You Lose!";
			
		}
	}

}
