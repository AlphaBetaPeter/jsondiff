package de.alphabetapeter;

import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.File;
import java.io.IOException;

public class JsonDiff
{
	public static void main(String[] args) throws IOException, JSONException
	{
		System.out.println("Usage: java -jar JsonDiff.jar [expectedFile] [actualFile] [strictmode(true/false)]");

		System.out.println("expected: " + args[0]);
		System.out.println("actual: " + args[1]);
		System.out.println("strict: " + args[2]);

		String expected = readFileToString(args[0]);
		String actual = readFileToString(args[1]);
		boolean strict = Boolean.valueOf(args[2]);

//		System.out.println("Expected: " + expected);
//		System.out.println("Actual: " + actual);
//		System.out.println("Strict: " + strict);

		JSONAssert.assertEquals(expected, actual, strict);
	}

	public static void testFiles(){

	}

	private static String readFileToString(String path) throws IOException
	{
		return FileUtils.readFileToString(new File(path));
	}
}
