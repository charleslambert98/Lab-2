package pkgCore;

import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> Cards = new ArrayList<Card>();

	public Deck(int numDecks) {
		super();
		for (int i = 1; i <= numDecks; i++) {
				for (int j = 1; j <= 4; j++) {
						for (int k = 1; k <= 13; k++) {
								Card card = new Card(eRank.values()[k],eSuit.values()[j-1]);
								this.Cards.add(card);
						}
				}
		}
		Collections.shuffle(Cards);
	}
	
	public Card draw() throws Exception {
		if (Cards.size() == 0) {
			throw new Exception("Deck is empty");
		}
		Card drawnCard = this.Cards.get(rand.nextInt(52)+1);
		Cards.remove(drawnCard);
		return drawnCard;
}
