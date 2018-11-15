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
	static String expectedDirectory = "./expectedCompilation/";
	static String compiledDirectory = "./compiled/";

	public void testFile(String fileName) throws IOException {
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
	@org.junit.Test
	public void test8() throws IOException {
		assertFalse("Expected file shouldn't exist", new File(compiledDirectory + "test8.wh").exists());
	}

	// test de linearite : verification que la compilation des documents 
	// 3*doc1 et 300*doc1 et 3000*doc1 a un temps d'exÃ©cution linÃ©aire
	@org.junit.Test
	public void testLinearity() throws IOException {
		// we check if the compilation happened and if the time was stored
		assertTrue("Compiled file 9 should exist", new File(compiledDirectory + "test9.wh").exists());
		assertTrue("Time 9 should exist", new File(compiledDirectory + "test9time.txt").exists());
		assertTrue("Compiled file 10 should exist", new File(compiledDirectory + "test10.wh").exists());
		assertTrue("Time 10 should exist", new File(compiledDirectory + "test10time.txt").exists());
		assertTrue("Compiled file 11 should exist", new File(compiledDirectory + "test11.wh").exists());
		assertTrue("Time 11 should exist", new File(compiledDirectory + "test11time.txt").exists());

		// then we take the time values that were stored during the compilation, and it
		// should have some linearity logic
		BufferedReader br = new BufferedReader(new FileReader(compiledDirectory + "test9time.txt"));
		double value9 = Double.parseDouble(br.readLine());
		br.close();

		br = new BufferedReader(new FileReader(compiledDirectory + "test10time.txt"));
		double value10 = Double.parseDouble(br.readLine());
		br.close();

		br = new BufferedReader(new FileReader(compiledDirectory + "test11time.txt"));
		double value11 = Double.parseDouble(br.readLine());
		br.close();
		
		// linearity logic here : compilationTime(test11) Ëœ 10*compilationTime(test10) Ëœ 100*compilationTime(test11)
		assertTrue("compilationTime(test11) Ëœ 10*compilationTime(test10)",Math.abs(value11-value10*10)<100);
		assertTrue("compilationTime(test11) Ëœ 100*compilationTime(test9)",Math.abs(value11-value9*100)<100);
	}
	
	public static void main(String[] args) throws Exception {                    
	       JUnitCore.main(TestPrettyPrint.class.getName());            
	}
}
