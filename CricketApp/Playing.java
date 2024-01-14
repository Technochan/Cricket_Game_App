package CricketApp;

public class Playing {
	static int x = 0 , y = 1 ;
	static boolean currP1 = true;
	static String currPly = "";
	
	
	public void add(String input) throws InterruptedException
	{	
		if ("X".equals(input)) {
		    addWicket(input);
		} else if ("W".equals(input)) {
			ScoreBoard.extra++;
		} else if ("0".equals(input)) {
		    ScoreBoard.ballCount++;
		    overEnd();
		} else {
		    addRun(input);
		}
		
	}
	public void addWicket(String wicket) throws InterruptedException {
		if(currP1) {
			x = y + 1;
		}else {
			if(x>y) {
				y = x + 1;
			}else {
				y = y + 1;
			}
		}
		ScoreBoard.ballCount++;
		ScoreBoard.wicketCount++;
		overEnd();
	}
	public void addRun(String run) {
		int val = 0;
		if(currP1) 
		{
			val = Integer.parseInt(run);
			ScoreBoard.playerScores[x] += val;
			if(val%2 == 1) {
				currP1 = false;
			}
		}
		else 
		{
			val = Integer.parseInt(run);
			ScoreBoard.playerScores[y] += val;
			if(val%2 == 1) {
				currP1 = true;
			}
		}
		ScoreBoard.score += val;
		ScoreBoard.ballCount++;
	}
	public void overEnd() throws InterruptedException {
		
		if(ScoreBoard.ballCount == 7) {
			ScoreBoard.ballCount = 1;
		
		if(currP1 == true)
			currP1 = false;
		else
			currP1 = true;
		
		ScoreBoard.currOver++;
		System.out.println();
		System.out.println(Intro.ANSI_CYAN+"End of the "+ ScoreBoard.currOver+ " Over"+Intro.ANSI_RESET);
		Thread.sleep(3000);
		ScoreBoard.getScore();
		}
	}

	public String getCurrPlayer(String s) {
		return currPly = currP1 == true ? Intro.ANSI_YELLOW+(ScoreBoard.playerNames[x]+"*")+
				Intro.ANSI_RESET : Intro.ANSI_GREEN+(ScoreBoard.playerNames[y]+"*")+Intro.ANSI_RESET; 
	} 
}
