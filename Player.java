
public class Player {
	private int wins;
	private int ties;
	private int losses;
	private int score;
	private int bet;
	private int money;
	private int insBet;
	public Player(){
		wins=0;
		ties=0;
		losses=0;
		score=0;
		bet=0;
		money=100;
		insBet=0;
	}
	public void addInsBet(int x){
		insBet=x;
	}
	public int returnInsBet(){
		return insBet;
	}
	public void addBet(int x){
		bet=x;
	}
	public void addingBet(int x){
		bet+=x;
	}
	public int returnBet(){
		return bet;
	}
	public void betWin(){
		money+=(bet*2);
	}
	public void insBetWin(){
		money+=(insBet*2);
	}
	public void insBetLoss(){
		money-=insBet;
	}
	public void betLoss(){
		money-=bet;
	}
	public void addTie(){
		ties++;
	}
	public void addWin(){
		wins++;
	}
	public void addLoss(){
		losses++;
	}
	public void addScore(int x){
		score+=x;
		if(score>21&&x>0){
			System.out.println("You have busted. Your score was: " + score);
		}else{
			System.out.println("Your score is: "+score);
		}
	}
	public void dealerScore(int x){
		score+=x;
		if(score>21&&x>0){
			System.out.println("Dealer has busted. His score was: " + score);
		}else{
			System.out.println("Dealer's score is: "+score);
		}
	}
	
	public int returnScore(){
		return score;
	}
	public void newGame(){
		score=0;
	}
	public void getRecord() {
		System.out.println("Balance: "+money+", "+ wins+" wins,"+ties+" ties,"+losses+" losses");
	}
}
