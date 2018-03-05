package pkgCore;
import pkgEnum.*;

public class Card implements Comparable {

	private eRank rank;
	private eSuit eSuit;
	
	
	public Card(eRank rank, eSuit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public eRank geteRank() {
		return this.rank;
		
	}
	public void seteRank(eRank rank) {
		this.rank = rank;
	}
	
	public eSuit geteSuit() {
		return this.suit;
	}
	public void seteSuit(eSuit suit) {
		this.suit = suit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
