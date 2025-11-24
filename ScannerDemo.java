
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	// This needs to be changed !
	private static String file1 = "/Users/diyabrown/Documents/Scanner/ScannerParser/prog1.kay";
	private static int counter = 1;

	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		Token t = ts.nextToken();
		
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED
			System.out.println("Token " + counter++ + " - Type: " + t.getType() + " - Value: " + t.getValue());
			t = ts.nextToken();
		}
	}
}
