package CricketApp;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner scan = new Scanner(System.in);
		
		Playing play =new Playing();
		Intro iT = new Intro();
		
		ScoreBoard.getScore();
		
		while(ScoreBoard.currOver < ScoreBoard.totalOver && ScoreBoard.wicketCount < 11)
		{

			System.out.println("Enter the score of ball " + ScoreBoard.ballCount+ " to "+ play.getCurrPlayer("")  );
			String input = scan.next();
			if(input.length() == 1)
				play.add(input);
			else 
				iT.invalidInput();
			
			if(ScoreBoard.ballCount == 7)
				play.overEnd();
		}
		ScoreBoard.getScoreBoard();
	}
}
