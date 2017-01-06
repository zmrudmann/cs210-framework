package adt;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Field Name -> Field Value mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Row extends HashMap<String, Object> {
	/** Do not modify. **/
    public Row() {
    	super();
    }
    
    /** Do not modify. **/
    public Row(Row row) {
    	super(row);
    }
}