package partylist.database;

import java.util.List;

import partylist.structures.Guest;

public interface IDatabase 
{
	/**
	 * Retrieves a guest based on their first and last names
	 * @param first - the first name of the guest
	 * @param last - the last name of the guest
	 * @return a Guest that has the same name 
	 */
	public Guest getGuest(String first, String last);
	
	/**
	 * adds a guest to the database
	 * 
	 * @return true if the guest was successfully created, false otherwise
	 */
	public boolean addGuest();
	
	/**
	 * retrieves a guest based a partial strnig of their name.
	 * 
	 * planned for use in type ahead system
	 * 
	 * @param partial - a string representing a partial complete name
	 * 
	 * @return a List of guests that match the partial string
	 */
	public List<Guest> getGuestFromPartialName(String partial);
}
