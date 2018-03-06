package pkgCore;

public class Deck {
	
	private ArrayList<Card> Card = new ArrayList<Card>();

	public Deck(int numDecks) {
		super();
		for (int i = 1; i <= numDecks; i++) {
				for (int j = 1; j <= 4; j++) {
						for (int k = 1; k <= 13; k++) {
								Card card = new Card(eRank.values()[k],eSuit.values()[j-1]);
								this.Card.add(card);
						}
				}
		}
	}
	
	public Card draw() {
		return this.Card.get(rand.nextInt(52)+1);
	
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
}
