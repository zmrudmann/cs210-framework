package adt;

import adt.HashMap;

/** 
 * This class is a hash map alias providing
 * a Primary Key Value -> Row mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Table extends HashMap<Object, Row> {
	/** Do not modify. **/
	public Table() {
		super();
	}
	
	/** Do not modify. **/
	public Table(Table table) {
		super(table);
	}
	
	/** Do not modify. **/
	private Schema schema = new Schema();
	
	/** Do not modify. **/
	public Schema schema() {
		return schema;
	}
	
	@Override
	public String toString() {
		return "[schema=" + schema.toString() + "]" + super.toString();
	}
}