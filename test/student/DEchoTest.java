package student;

import static org.junit.Assert.*;

import java.util.List;

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
	private static List<Response> responses;
	
	private static String query;
	private static int count = 1;
	
	@BeforeClass
	public static void initialize() {
		SERVER = new Server();
		
		query = "ECHO \"Hello, World!\"";
		responses = SERVER.interpret(query);
	};
	
	@Test
	public void testDriverQueryResponses() {
		assertEquals(
			"Query <" + query + "> must return " + count + "responses,",
			count,
			responses.size()
		);
	}
	
	@Test
	public void testDriverEchoSuccess() {
		assertEquals(
			"Query <" + query + "> must succeed,",
			true,
			responses.get(0).get("success")
		);
	}
	
	@Test
	public void testDriverEchoMessage() {
		assertEquals(
			"Query <" + query + "> must return correct message,",
			"Hello, world!",
			responses.get(0).get("message")
		);
	}
	
	@Test
	public void testDriverEchoTable() {
		assertEquals(
			"Query <" + query + "> must not return table,",
			null,
			responses.get(0).get("table")
		);
	}
}
