package core;

import adt.Response;

/** 
 * This class provides a sandbox for manual
 * testing of the rest of the project components.
 * 
 * It is not required for submission and can
 * be deleted if desired. You should use unit
 * tests for testing when possible.
 */
@Deprecated
public class Sandbox {
	public static void main(String[] args) {
		Server SRV = new Server();
		
		Response response = SRV.interpret("ECHO \"Hello, world!\"").get(0);
		
		System.out.println(response.get("message"));
	}
}
