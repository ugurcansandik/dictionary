import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Main
{
	public static void main(String[] args) throws Exception
	{
	    Word[] words = new Word[100];
		Dictionary dict = new Dictionary(words);
		String original;
		String translation;
		
		Scanner scanner = new Scanner(new File("dictionary.txt"));
		while(scanner.hasNext() == true)
		{
		    original = scanner.next();
		    translation = scanner.next();
		    Word wordObject = new Word(original, translation);
		    dict.addWord1(original, translation);
		    dict.addWord2(wordObject);
		}
		scanner.close();
		
		System.out.print(dict.toString());
	}
}

