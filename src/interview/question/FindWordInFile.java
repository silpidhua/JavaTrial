/*20.	Write a code to find the number of time given word appear in a file  */
package interview.question;

import java.awt.geom.RectangularShape;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordInFile {
	public int searchByWordComparision(String searchedWord)throws IOException {
		File file = new File("Files/ReadFile.txt");
		String line = null;
		String[] words = null;
		int count = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((line=br.readLine())!=null) {
				words = line.split("\\s|\\.");
				System.out.println("words:"+Arrays.toString(words));
				for(String s: words) {
					if(s.equalsIgnoreCase(searchedWord)) {
						count++;
					}
				}
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return count;
	}
	public int searchByRegex(String searchedWord) throws IOException {
		File file = new File("Files/ReadFile.txt");
		String line = null;
		int count = 0;
		StringBuffer sb = new StringBuffer();
		//(?i) ignorecose in regular expression
		Pattern p = Pattern.compile("(?i)"+searchedWord);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((line= br.readLine())!=null) {
				sb.append(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Matcher m = p.matcher(sb.toString());
		while(m.find()) {
			count++;
		}
		return count;
	}
	public static void main(String[] args)  {
		FindWordInFile obj = new FindWordInFile();
		try {
			//System.out.println(obj.searchByWordComparision("write"));
			System.out.println(obj.searchByRegex("find"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
