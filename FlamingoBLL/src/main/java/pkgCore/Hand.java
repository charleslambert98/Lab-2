package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int rankNumber;
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[1];
		
		iScore[0] = 0;
		
		Collections.sort(cards);
		
		
		for (Card c: cards)
		{
			rankNumber = c.geteRank().getiRankNbr();
			
			if (rankNumber > 10 && rankNumber < 14) {
				rankNumber = 10;
			}
			else if (rankNumber == 14 || rankNumber == 1) {
				if (iScore[0] + 11 > 21) {
					rankNumber = 1;
				}
				else {
					rankNumber = 11;
				}
			}
			iScore[0] += rankNumber;
			//	TODO: Determine the score.  
			//			Cards:
			//			2-3-4 - score = 11
			//			5-J-Q - score = 25
			//			5-6-7-2 - score = 20
			//			J-Q	- score = 20
			//			8-A = score = 9 or 19
			//			4-A = score = 5 or 15
		}
		
		return iScore;
	}
	
	public void Draw(Deck d) throws Exception
	{
		AddCard(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
