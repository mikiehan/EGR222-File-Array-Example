import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ProcessFile {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        processFile("numbers.txt", "numbers_cleaned.txt");
    }

    public static void processFile(String fileName, String newFileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        PrintStream outFile = new PrintStream(new File(newFileName));
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            outFile.println(processLine(line));
        }
    }

    //this will clean up whitespace in line
    //and return a cleaned line with a single space
    private static String processLine(String line) {
        Scanner strScanner = new Scanner(line);
        String cleanedStr = "";
        while(strScanner.hasNextInt()) {
            int num = strScanner.nextInt();
            cleanedStr += num + " ";
        }
        return cleanedStr;
    }
}
