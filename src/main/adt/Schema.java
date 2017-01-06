package adt;

/** 
 * This class is a hash map alias providing
 * a Field Name -> Field Value mapping.
 * 
 * Additional non-map features can be implemented.
 */
public class Schema extends HashMap<String, Object> {
	/** Do not modify. **/
    public Schema() {
    	super();
    }
    
    /** Do not modify. **/
    public Schema(Schema response) {
    	super(response);
    }
}