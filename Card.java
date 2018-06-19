
public class Card {
	
	private final int suit;
	private final int face;
	
	public Card(int cardSuit, int cardFace){
		suit= cardSuit;
		face= cardFace;
	}

	public int getSuit(){
		return suit;
	}
	
	public int getFace(){
		return face;
	}
	public String getSuitString(){
		if(suit==0){
			return " of Spades";
		}else if(suit==1){
			return " of Hearts";
		}else if(suit==2){
			return " of Clubs";
		}else if(suit==3){
			return " of Diamonds";
		}
		return "??";
	}
	public String getFaceString(){
		if(face==1){
			return "Ace";
		}else if(face==2){
			return "Two";
		}else if(face==3){
			return "Three";
		}else if(face==4){
			return "Four";
		}else if(face==5){
			return "Five";
		}else if(face==6){
			return "Six";
		}else if(face==7){
			return "Seven";
		}else if(face==8){
			return "Eight";
		}else if(face==9){
			return "Nine";
		}else if(face==10){
			return "Ten";
		}else if(face==11){
			return "Jack";
		}else if(face==12){
			return "Queen";
		}else if(face==13){
			return "King";
		}
		return "??";
	}
	public int getValue(){
		if(face==1){
			return 1;
		}else if(face==2){
			return 2;
		}else if(face==3){
			return 3;
		}else if(face==4){
			return 4;
		}else if(face==5){
			return 5;
		}else if(face==6){
			return 6;
		}else if(face==7){
			return 7; 
		}else if(face==8){
			return 8;
		}else if(face==9){
			return 9;
		}else if(face==10){
			return 10;
		}else if(face==11||face==12||face==13){
			return 10;
		}
			return -1;
	}

	
}
