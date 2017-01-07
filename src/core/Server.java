package core;

import driver.*;
import adt.Response;
import adt.Database;

import java.util.List;
import java.util.ArrayList;

/** 
 * This class implements a server with an active
 * connection to a backing database.
 * 
 * Finishing implementing the required features
 * but do not modify the protocols.
 */
public class Server {
	public Server() {
		// TODO: Instantiate a non-static database field.
	}
	
	public Database database() {
		// TODO: Return a reference to the database field.
		return null;
	}
	
	public List<Response> interpret(String script) {
		/*
		 * TODO: This assumes that there is only one
		 * query in the script. However, there may be
		 * one or more semicolon-delmited queries in
		 * the script, and semicolons are only used
		 * for that exact purpose.
		 */
		String query = script;
		
		List<Response> responses = new ArrayList<Response>();
		
		/*
		 * TODO: This manually passes the single query
		 * to each driver until it finds one that works.
		 * It would be much better to encapsulate all
		 * drivers into a single collection, then pass
		 * each query in sequence into each driver in
		 * sequence to find a working driver.
		 */
		
		Driver ECHO = new DEcho();
		Response echo_response = ECHO.execute(null, query);
		if (echo_response != null) {
			responses.add(echo_response);
			return responses;
		}
		
		Driver RANGE = new DRange();
		Response range_response = RANGE.execute(null, query);
		if (range_response != null) {
			responses.add(range_response);
			return responses;
		}
		
		// TODO: Uncomment block during DSquares lab activity.
		
//		Driver SQUARES = new DSquares();
//		Response squares_response = SQUARES.execute(null, query);
//		if (squares_response != null) {
//			responses.add(squares_response);
//			return responses;
//		}
		
		Response res = new Response();
		res.put("success", false);
		responses.add( res );
		
		return responses;
	}
}
