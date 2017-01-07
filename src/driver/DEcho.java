package driver;

import adt.Response;
import adt.Database;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * This is an example driver only.
 * 
 * It is not required for submission and can
 * be deleted if desired.
 * 
 * Example:
 * 	ECHO "Hello, world!"
 * 
 * Response:
 * 	success flag
 * 	message "Hello, world!"
 * 	no result table
 */
@Deprecated
public class DEcho implements Driver {
	private static final Pattern pattern;
	static {
		pattern = Pattern.compile(
			"ECHO\\s*\"(.*)\"",
			Pattern.CASE_INSENSITIVE
		);
	}

	private String text;

	@Override
	public Response execute(Database db, String query) {
		Matcher matcher = pattern.matcher(query.trim());
		if (!matcher.matches()) return null;

		text = matcher.group(1);
		
		return new Response(true, text, null);
	}
}
