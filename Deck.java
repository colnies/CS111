
public class Deck {
	private Card[] deck;
	private static int cardsUsed;
	private static double low;
	private static double med;
	private static double high;
	
	public Deck(){
		deck= new Card[52];
		int cardCt=0;
		for(int suit=0; suit<=3; suit++){
			for(int value=1; value<=13;value++){
				deck[cardCt]= new Card (suit,value);
				cardCt++;
			}
		}
		cardsUsed=0;
	}
	
	public Card deal(){
		
		if (cardsUsed == 52){
	           shuffle();
		}
	        cardsUsed++;
			Card temp= deck[cardsUsed-1];
			System.out.println(temp.getFaceString()+temp.getSuitString());
			if(temp.getValue()>=2&&temp.getValue()<=5){
				low++;
			}else if(temp.getValue()==1||temp.getValue()==9||temp.getValue()==10){
				high++;
			}else{
				med++;
			}
			return temp;
			}	
	
	public boolean isEmpty(){
		if(cardsUsed==52){
			return true;
		}else{
			return false;
		}
	}
	
	public void shuffle(){
		for(int i=51;i>0;i--){
			int rand =(int)(Math.random()*(i+1));
			Card temp=deck[i];
			deck[i]=deck[rand];
			deck[rand]=temp;
		}
		cardsUsed=0;
		low=0;
		med=0;
		high=0;
		System.out.println("SHUFFLING");
	}
public void output(int x){
		Card temp=deck[x];
		System.out.println(temp.getFaceString()+temp.getSuitString());
	}

public static void cardCount(){
		double h=Math.round(((24-high)/(52-cardsUsed))*100);
		double l=Math.round(((16-low)/(52-cardsUsed))*100);
		double m=Math.round(((12-med)/(52-cardsUsed))*100);
		System.out.println(h + "% chance of drawing a high card, " + m + "% chance of drawing a medium card, " + l + "% chance of drawing a low card");
}
}

