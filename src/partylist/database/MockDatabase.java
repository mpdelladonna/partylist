/**
 * 
 */
package partylist.database;

import java.util.List;

import partylist.structures.Guest;

/**
 * @author mpdelladonna
 *
 */
public class MockDatabase implements IDatabase {

	/**
	 * 
	 */
	public MockDatabase() {
		
	}

	@Override
	public Guest getGuest(String first, String last) {
		
		return new Guest(first, last);
	}

	@Override
	public boolean addGuest() {
		return true;
	}

	@Override
	public List<Guest> getGuestFromPartialName(String partial) {
		return null;
	}

}
