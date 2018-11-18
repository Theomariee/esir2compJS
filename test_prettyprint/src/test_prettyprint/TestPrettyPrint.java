package test_prettyprint;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;

public class TestPrettyPrint {
	static String expectedDirectory = "../../expectedCompilation/";
	static String compiledDirectory = "../../compiled/";

	public void testFile(String fileName) throws IOException {
		String expected = new String(expectedDirectory + "expectedTest" + fileName + ".wh");
		String compiled = new String(compiledDirectory + "test" + fileName + ".wh");

		File expectedFile = new File(expected);
		File compiledFile = new File(compiled);
		assertTrue("Expected file doesn't exist", expectedFile.exists());
		assertTrue("Compiled file doesn't exist", compiledFile.exists());
		try {
			assertTrue("Files are not equal", FileUtils.contentEqualsIgnoreEOL(expectedFile, compiledFile, "UTF-8"));
		} catch (AssertionError e) {
			System.out.println("Fail from " + compiledFile
					+ ", comparison:\n-------------------------------------------- expected:\n");
			BufferedReader br = new BufferedReader(new FileReader(expected));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			System.out.println("\n-------------------------------------------- compiled:\n");
			br = new BufferedReader(new FileReader(compiled));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			System.out.println("\n--------------------------------------------\n");
			fail(e.toString());
		}
	}

	// tests 1 a 7 : les fichiers ont etes crees et le pretty-printer a agit comme
	// prevu
	// s'il n'agit pas comme prevu, on montre le pretty-print attendu/le
	// pretty-print qui a eu lieu
	@org.junit.Test
	public void test1() throws IOException {
		testFile("1");
	}

	@org.junit.Test
	public void test2() throws IOException {
		testFile("2");
	}

	@org.junit.Test
	public void test3() throws IOException {
		testFile("3");
	}

	@org.junit.Test
	public void test4() throws IOException {
		testFile("4");
	}

	@org.junit.Test
	public void test5() throws IOException {
		testFile("5");
	}

	@org.junit.Test
	public void test6() throws IOException {
		testFile("6");
	}

	@org.junit.Test
	public void test7() throws IOException {
		testFile("7");
	}

	// test 8 : le fichier ne doit pas etre cree car il n'est pas correct
	// syntaxiquement
	public void test8() throws IOException {
		assertFalse("Expected file shouldn't exist", new File(compiledDirectory + "test8.wh").exists());
	}

	// test 9 : le fichier pretty-print du pretty-print doit être égal au fichier pretty-print
	@org.junit.Test
	public void test9() throws IOException {
		testFile("9");
	}
	
	// test 10 : spécificités du pretty-printer : imbrication plus poussée que tests 1->7
	@org.junit.Test
	public void test10() throws IOException {
		testFile("10");
	}
		
	
	public static void main(String[] args) throws Exception {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
	        JUnitCore.main(TestPrettyPrint.class.getName());            
	}
}
	