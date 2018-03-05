package pkgCore;
import pkgEnum.*;

public class Card implements Comparable {

	private enum eRank;
	private enum eSuit;
	
	
	public Card(enum eRank, enum eSuit) {
		super();
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	public enum geteRank() {
		return this.eRank;
	}
	public void seteRank(enum eRank) {
		this.eRank = eRank;
	}
	
	public enum geteSuit() {
		return this.eSuit;
	}
	public void seteRank(enum eSuit) {
		this.eRank = eSuit;
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
