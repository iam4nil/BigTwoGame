import java.util.ArrayList;
/**
 * This class is used to model a hand of Triple in Big Two Game.
 * It is a subclass of the class Hand. It stores the information of
 * the player who plays his / her hand. It provides concrete implementations of
 * two abstract methods in the superclass and overrides several methods for its use.
 * This class also provides a static method to check whether a given hand is a
 * valid Triple.
 *	<br>
 *
 *	<br>
 *	<p>	<b>Copyright Information</b>
 *	<br> <br> <i> COMP 2396 OOP &amp; Java Assignment #3 </i>
 *	<br> <i> ZHANG, Jiayao Johnson / 3035233412 </i>
 *	<br> Department of Computer Science, The University of Hong Kong
 *  <br> <a href = "jyzhang@cs.hku.hk"> Contact me via email </a>
 *  <br> <a href = "http://i.cs.hku.hk/~jyzhang/"> Visit my webpage </a>
 *
 * @author ZHANG, Jiayao Johnson
 * @version 0.1
 * @since 2016-10-08
 */
public class Triple extends Hand
{
	// Private variable storing the type of this hand in String
	private String type;

/**
 * This constructor construct a Triple object with specified player and list
 * of cards.
 *	<br>
 * @param player The player who plays his / her hand
 * @param cards the list cards that the player plays
 */
	public Triple(CardGamePlayer player, CardList cards)
	{
		super(player,cards);
		this.type = "Triple";
	}

/**
 * This method is used to check if this is a valid Triple.
 *	<br>
 * @return a boolean value specifying whether this hand is a valid Pair
 */
	public boolean isValid()
	{
		return Triple.isValid(this);
	}

/**
 * This method is used to check whether a given hand is a valid Triple hand.
 * This method is a static method.
 *	<br>
 * @param hand the hand given to be checked validity
 * @return the boolean value to specify whether the given hand is a valid
 * Triple in Big Two Game.
 */
	public static boolean isValid(CardList hand)
	{
		if(hand.size() == 3)
		{
			int firstRank = hand.getCard(0).getRank();
			for(int i = 0; i < 3; ++i)
			{
				Card card = hand.getCard(i);
				int suit = card.getSuit();
				int rank = card.getRank();
				if(!(-1 < suit && suit < 4 && -1 < rank && rank < 13 && rank == firstRank))
				{
					return false;
				}
			}

			return true;
		}
		return false;
	}

/**
 * This method is used to return the type of this hand in
 * String representation.
 * @return the String specification of the type of this hand
 */
	public String getType()
	{
		return this.type;
	}
}
