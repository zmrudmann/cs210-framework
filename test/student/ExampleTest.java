package student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import adt.Response;
import core.Server;

/** 
 * This class provides example unit tests for
 * the drivers included in the framework.
 * 
 * It is not required for submission and can
 * be deleted if desired.
 */
public class ExampleTest {
	private static Server SERVER;
	
	@BeforeClass
	public static void initialize() {
		SERVER = new Server();
	};
	
	@Test
	public void testDriverEcho() {
		String query = "ECHO \"Hello, world!\"";
		Response r = SERVER.interpret(query).get(0);
		
		assertEquals(
			"Query <" + query + "> must succeed,",
			true,
			r.get("success")
		);
		
		assertEquals(
			"Query <" + query + "> must return correct message,",
			"Hello, world!",
			r.get("message")
		);
		
		assertEquals(
			"Query <" + query + "> must not return table,",
			null,
			r.get("table")
		);
	}
}
