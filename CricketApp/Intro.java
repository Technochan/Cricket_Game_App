package CricketApp;

public class Intro {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_CYAN = "\u001B[36m";
	
	public Intro() throws InterruptedException{
		System.out.println("Welcome to the Chan's Cricket App");
		System.out.println("_________________________________");Thread.sleep(2000);
		
		
		System.out.println();
		System.out.println(ANSI_RED+"\"Wait for Loading\""+ANSI_RESET);	Thread.sleep(5000);
	
		
		System.out.println();
		System.out.println(ANSI_GREEN+"Congratulations..." +ANSI_RESET +"You are Going to"+ANSI_GREEN+ " Bating"+ANSI_RESET);
		
		System.out.println("Total Over : " + ANSI_YELLOW + ScoreBoard.totalOver + " Overs"+ANSI_RESET );Thread.sleep(4000);
		
		
		System.out.println(ANSI_RED);
		System.out.println("Note : ");Thread.sleep(2000);
		System.out.println(ANSI_YELLOW+"\t -> Just input the Value of the score to each ball");Thread.sleep(3000);
		System.out.println("\t -> Better Choose 1 to 6 only");Thread.sleep(3000);
		System.out.println("\t -> Choose 'X' to notify wicket");Thread.sleep(3000);
		System.out.println("\t -> Choose 'W' to notify Wide");Thread.sleep(3000);
		System.out.println("\t -> Choose '0' to notify Dot - ball (NO RUN)"+ANSI_RESET);Thread.sleep(5000);
		
		System.out.println();
		System.out.println("\t  Letz Get Started " );
		System.out.println("\t  ________________ " );
		System.out.println();
	}
	public void invalidInput() {
		System.out.println(ANSI_RED+"Invalid Input : "+ANSI_RESET+" Choose 1 to 6");
		System.out.println();
		
	}
}
