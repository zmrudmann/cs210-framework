package adt;

import java.util.Map;

/** 
 * This is currently just an alias for a built-in
 * implementation of a hash-based map and is therefore
 * noncompliant with the Final Module specification.
 * 
 * You must replace this file with your own hash-based
 * map implementation when attempting the Hash modules.
 * However, you can continue to use this noncompliant
 * class for all other modules.
 */
public class HashMap<K,V>
	extends java.util.HashMap<K,V>
	implements Map<K,V> 
{
	public HashMap() {
		super();
	}
	
	public HashMap(Map<? extends K, ? extends V> copy) {
		super(copy);
	}
}
