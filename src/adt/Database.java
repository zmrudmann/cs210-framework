package adt;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Table Name -> Table Object mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Database extends HashMap<String, Table> {
	/** Do not modify. **/
	public Database() {
		super();
	}
	
	/** Do not modify. **/
	public Database(Database database) {
		super(database);
	}
}