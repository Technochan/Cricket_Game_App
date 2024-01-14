package CricketApp;

public class ScoreBoard {
	static int[] playerScores = new int[11];
	static String playerNames[] = {"Rohit",
							   	   "Raina",   
							   	   "Virat",
							   	   "Rahul",
							   	   "Dhoni",
							   	   "Rayudu",
							   	   "Jadeja",
							   	   "Ashwin",
							   	   "Chahar",
							   	   "Shami",
							   	   "Bumhra"};
	
	
	static int score = 0;
	static int extra = 0;
	
	static int totalOver = 10;
	static int currOver = 0;
	
	static int ballCount = 1;
	static int wicketCount = 0;
	
	public static void getScore(){
		System.out.println(" ___________________________________ ");
		System.out.println("|                                   |");
		System.out.println("|     Score : "+Intro.ANSI_YELLOW+(score+extra)+Intro.ANSI_RESET+
							"/"+wicketCount+"\t Over : "+Intro.ANSI_GREEN+currOver+Intro.ANSI_RESET+"   |");
		System.out.println("|                                   |");
		System.out.println("\t"+playerNames[Playing.x]+" : "+playerScores[Playing.x]+"    "+
						    playerNames[Playing.y]+" : "+playerScores[Playing.y] );
		System.out.println("|___________________________________|");
		System.out.println();
	}
	
	public static void getScoreBoard() {
		System.out.println(" _______________________________ ");
		System.out.println("|                             "+"\t"+"|");
		System.out.println("|  Player " +"\t" +"      " + "Score   "+"\t"+"|");
		System.out.println("|  ------ " +"\t" +"      " + "-----   "+"\t"+"|");
		for(int i=0 ; i<playerScores.length ; i++) {
			System.out.println("|  "+playerNames[i] +"\t" +"  =    " + playerScores[i]+"\t"+"|");
		}
		System.out.println("|_______________________________|");
		
		System.out.println();
		System.out.println(" ___________________________________ ");
		System.out.println("|                                   |");
		System.out.println("|     Score : "+Intro.ANSI_YELLOW+(score+extra)+Intro.ANSI_RESET+
							"/"+Intro.ANSI_RED+wicketCount+Intro.ANSI_RESET+"\t Over : "+
							Intro.ANSI_GREEN+currOver+Intro.ANSI_RESET+"\t\t"+"    |");
		System.out.println("|___________________________________|");
		
	}
}
