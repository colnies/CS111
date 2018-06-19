public class Blackjack {
	public static void main(String[] args) {
		
		//Variable Declaration//
		Deck deck = new Deck();
		deck.shuffle();
		int total=0;
		int dealerTotal=0;
		
		//Player Array Creation//
		System.out.println("How many players are in this game?");
		int numPlyer=IO.readInt();
		Player[] arrPly=new Player[numPlyer+1];
		for(int t=1;t<=numPlyer;t++){
			arrPly[t-1]= new Player();
		}
		//Starting game loop//
		String ans1="Y";
		while (ans1.equals("Y")){		
			
		//Taking bets & clearing player scores//
		for(int x=1;x<=numPlyer;x++){
			Player tempPlyr=arrPly[x-1];
			tempPlyr.newGame();
			System.out.println("Player "+x+" what is your bet?");
			tempPlyr.addBet(IO.readInt());
		}
		
		//Creating Individual Players//
		for(int i=1;i<=numPlyer;i++){
			
			System.out.println("");
			System.out.println("Player "+i+"'s card(s) are:");
			
		//Dealing Cards to Players//
			for(int j=0;j<2;j++){
				Player curr=arrPly[i-1];
				Card temp = deck.deal();
				total=temp.getValue();
			
				if(total==1){
					System.out.println("Would you like it to be worth 1 or 11?");
					int ans=IO.readInt();
					
					 if(ans==11){
						curr.addScore(11);
					 }else if(ans==1){
						curr.addScore(1);
						 }
				}else{
				curr.addScore(total);
				}
			}
		}
		System.out.println("");
		
		//Dealer being dealt his cards//
		System.out.println("The Dealer's card(s) are:");
		arrPly[numPlyer]= new Player();
		
		Card temp = deck.deal();
		dealerTotal=temp.getValue();
		Player dealer=arrPly[numPlyer];
		if(dealerTotal==1){
			dealer.dealerScore(11);
			for(int t=1;t<=numPlyer;t++){
				Player curr=arrPly[t-1];
				System.out.println("Player " + t+" would you like to add insurance? Yes (Y) or No (N)");
				String insAns= IO.readString();
				if(insAns.equals("Y")){
					System.out.println("How much would you like to add to your bet? (Up to half of original bet)");
					curr.addInsBet(IO.readInt());
				}
				
			}
		}else{
		dealer.dealerScore(dealerTotal);
		}
		System.out.println("");
		
		//Hit or Stand//
		for(int j=0;j<numPlyer;j++){
			Player curr=arrPly[j];
			
			do{
			System.out.println("Would Player " +(j+1)+" like to hit (H), stand (S), double down (DD) or would like a hint (HT)? Currently has a score of " + curr.returnScore()+".");
			String ans=IO.readString();
			
				//Hit//
				if(ans.equals("H")){
					Card tempPly =deck.deal();
					total=tempPly.getValue();
					if(total==1){
						System.out.println("Would you like it to be worth 1 or 11?");
						int ans2=IO.readInt();
						
						if(ans2==11){
							curr.addScore(11);
						}else if(ans2==1){
							curr.addScore(1);
							 }
					}else{
					curr.addScore(total);
					}
				
				//Stand//
				}else if(ans.equals("S")){
					System.out.println("Player "+ (j+1)+"'s final score is: " +curr.returnScore());
					break;
					
				//Double Down//
				}else if(ans.equals("DD")){
					System.out.println("What is your second bet?");
					int ddInt=IO.readInt();
					curr.addingBet(ddInt);
					Card tempPly =deck.deal();
					total=tempPly.getValue();
						if(total==1){
							System.out.println("Would you like it to be worth 1 or 11?");
							int ans2=IO.readInt();	
						if(ans2==11){
							curr.addScore(11);
						}else if(ans2==1){
							curr.addScore(1);
							 }
					}else{
					curr.addScore(total);	
					}
						
				//Hint//
				}else if(ans.equals("HT")){
					if(dealer.returnScore()==2){
						if(curr.returnScore()>=13){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()==12||curr.returnScore()<=9){
							System.out.println("Would recommend hitting");
						}else if(curr.returnScore()==11||curr.returnScore()==10){
							System.out.println("Would recommend doubling down");
						}
					}else if(dealer.returnScore()==3){
						if(curr.returnScore()>=13){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()==12||curr.returnScore()<=8){
							System.out.println("Would recommend hitting");
						}else if(curr.returnScore()==11||curr.returnScore()==10||curr.returnScore()==9){
							System.out.println("Would recommend doubling down");
						}
					}else if(dealer.returnScore()==4||dealer.returnScore()==5||dealer.returnScore()==6){
						if(curr.returnScore()>=12){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()<=8){
							System.out.println("Would recommend hitting");
						}else if(curr.returnScore()==11||curr.returnScore()==10||curr.returnScore()==9){
							System.out.println("Would recommend doubling down");
						}
					}else if(dealer.returnScore()==7||dealer.returnScore()==8||dealer.returnScore()==9){
						if(curr.returnScore()>=17){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()<=9||(curr.returnScore()>=12&&curr.returnScore()<=16)){
							System.out.println("Would recommend hitting");
						}else if(curr.returnScore()==11||curr.returnScore()==10){
							System.out.println("Would recommend doubling down");
						}
					}else if(dealer.returnScore()==10){
						if(curr.returnScore()>=17){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()<=16&&curr.returnScore()!=11){
							System.out.println("Would recommend hitting");
						}else if (curr.returnScore()==11){
							System.out.println("Would recommend doubling down");
						}
					}else if (dealer.returnScore()==11){
						if(curr.returnScore()>=17){
							System.out.println("Would recommend standing");
						}else if(curr.returnScore()<=16){
							System.out.println("Would recommend hitting");
						}
					}
					Deck.cardCount();
				}
				}while(curr.returnScore()<=21);
		}
		System.out.println("");
		
		//Dealer revealing second card//
		System.out.println("Now that every player is finished it is time for the dealer to reveal his second card.");
		temp = deck.deal();
		dealerTotal=temp.getValue();
		if(dealerTotal==1&&dealer.returnScore()<=10){
				dealer.dealerScore(11);
		}else{
				//Insurance Win or Loss//
				if(dealerTotal==10&&dealer.returnScore()==11){
						for(int i=0;i<numPlyer;i++){
							Player curr = arrPly[i];
							System.out.println("Player " +(i+1)+" has won " + curr.returnInsBet()*2+ " dollars from insurance");
							curr.insBetWin();
							}
				}else if(dealer.returnScore()==11&&dealerTotal!=10){
					for(int i=0;i<numPlyer;i++){
						Player curr = arrPly[i];
						System.out.println("Player " +(i+1)+" has lost " + curr.returnInsBet()+ " dollars from insurance");
						curr.insBetLoss();
						}
					}
				
		dealer.dealerScore(dealerTotal);
			
		}
		System.out.println("");
			while(dealer.returnScore()<17){
				System.out.println("The dealer is under 17 and must draw another card");
				temp=deck.deal();
				dealerTotal=temp.getValue();
				if(dealerTotal==1&&dealer.returnScore()<10){
						dealer.dealerScore(11);
				}else{
				dealer.dealerScore(dealerTotal);
				}
				System.out.println("");
			}
				System.out.println("The dealer's final score is " +dealer.returnScore());
			
	//Win and Loss Declaration//
	
			for(int j=0;j<numPlyer;j++){
				Player tempPlyr2=arrPly[j];
			if(dealer.returnScore()>21&&tempPlyr2.returnScore()<=21||tempPlyr2.returnScore()>dealer.returnScore()&&tempPlyr2.returnScore()<=21){
				System.out.println("Player " + (j+1)+ " has won! You have won " + tempPlyr2.returnBet()*2+" dollars");
				tempPlyr2.betWin();
				tempPlyr2.addWin();
			}else if(tempPlyr2.returnScore()<dealer.returnScore()||tempPlyr2.returnScore()>21){
				System.out.println("Player " + (j+1)+ " has lost. You have lost " + tempPlyr2.returnBet()+" dollars");
				tempPlyr2.betLoss();
				tempPlyr2.addLoss();
			}else if(tempPlyr2.returnScore()==dealer.returnScore()){
				System.out.println("Player " + (j+1)+ " has tied.");
				tempPlyr2.addTie();
			}
	}
			//Starting game loop again//
			System.out.println("Do you want to play Blackjack again? Yes (Y) or No (N)?");
			ans1=IO.readString();
			continue;
}
		for(int x=0;x<numPlyer;x++){
			Player score=arrPly[x];
			System.out.print("Player " + (x+1)+"'s record: ");
			score.getRecord();
		}
}
}

