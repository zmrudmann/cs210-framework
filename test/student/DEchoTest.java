package student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import adt.Response;
import core.Server;

/** 
 * This class provides example unit tests for a
 * deprecated driver included in the framework.
 * 
 * It is not required for submission and can
 * be deleted if desired.
 */
@Deprecated
public class DEchoTest {
	private static Server SERVER;
	private static String query;
	private static Response response;
	
	@BeforeClass
	public static void initialize() {
		SERVER = new Server();
		
		query = "ECHO \"Hello, world!\"";
		response = SERVER.interpret(query).get(0);
	};
	
	@Test
	public void testDriverEchoSuccess() {
		assertEquals(
			"Query <" + query + "> must succeed,",
			true,
			response.get("success")
		);
	}
	
	@Test
	public void testDriverEchoMessage() {
		assertEquals(
			"Query <" + query + "> must return correct message,",
			"Hello, world!",
			response.get("message")
		);
	}
	
	@Test
	public void testDriverEchoTable() {
		assertEquals(
			"Query <" + query + "> must not return table,",
			null,
			response.get("table")
		);
	}
}
