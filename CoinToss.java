import java.util.*;

public class CoinToss {
	public static void main(String args[]) {
		
		System.out.println("Tossing a coin...");
		
		String[] Result = {"Heads","Tails"};
		int[] resultValue = {0,0};
		int Toss = 0;
		for (int i = 1; i < 6; i++) {
			
			Toss = (int)(Math.random() * ((1 - 0) + 1));

			System.out.println("Round" +i+":" +Result[Toss]);
			resultValue[Toss] = resultValue[Toss] + 1;
			
		}
		
		System.out.println(Result[0]+":" +resultValue[0]+ "," +Result[1]+":" +resultValue[1]);
		
		if (resultValue[0]>resultValue[1]) {
			System.out.println("You win");
		}
		else {
			System.out.println("You lose");
		}
		
	}

}
