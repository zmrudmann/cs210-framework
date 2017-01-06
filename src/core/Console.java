package core;

import adt.Response;
import java.util.List;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/** 
 * This class implements an interactive console
 * for a database server.
 * 
 * Finishing implementing the required features
 * but do not modify the protocols.
 */
public class Console {
	public static void main(String[] args) {
		prompt(new Server(), System.in, System.out);
	}
	
	public static void prompt (Server server, InputStream input, OutputStream output) {
		Scanner in = new Scanner(input);
		PrintStream out = new PrintStream(output);
		
		/*
		 * TODO: Use a REPL to allow the user type in a
		 * single query script or a semicolon-delimited
		 * script of multiple queries and pass the entire
		 * script to the server to be interpreted. It is
		 * also permissible to pre-split the script and
		 * pass each individual query in sequence.
		 * 
		 * TODO: The console must terminate when the
		 * sentinel word STOP is encountered, which is
		 * not a query to be passed to the server.
		 */
		
		out.print(">> ");
		String line = in.nextLine();
		in.close();
		
		List<Response> responses = server.interpret(line);
		
		out.println("Success: " + responses.get(0).get("success"));
		out.println("Message: " + responses.get(0).get("message"));
		out.println("Table:   " + responses.get(0).get("table"));

		// TODO: Tables must eventually support tabular view.
	}
}
