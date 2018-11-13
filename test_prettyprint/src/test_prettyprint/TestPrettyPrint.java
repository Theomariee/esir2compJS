package test_prettyprint;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestPrettyPrint {
	static String expectedDirectory = "./expectedCompilation/";
	static String compiledDirectory = "./compiled/";

	void testFile(String fileName) throws IOException {
		String expected = new String(expectedDirectory + "expectedTest" + fileName + ".wh");
		String compiled = new String(compiledDirectory + "test" + fileName + ".wh");

		File expectedFile = new File(expected);
		File compiledFile = new File(compiled);
		assertTrue("Expected file doesn't exist", expectedFile.exists());
		assertTrue("Compiled file doesn't exist", compiledFile.exists());
		try {
			assertTrue("Files are not equal", FileUtils.contentEquals(expectedFile, compiledFile));
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

	@Test
	void test1() throws IOException {
		testFile("1");
	}
	@Test
	void test2() throws IOException {
		testFile("2");
	}
	@Test
	void test3() throws IOException {
		testFile("3");
	}
	@Test
	void test4() throws IOException {
		testFile("4");
	}
	@Test
	void test5() throws IOException {
		testFile("5");
	}
	@Test
	void test6() throws IOException {
		testFile("6");
	}
	@Test
	void test7() throws IOException {
		testFile("7");
	}
}
