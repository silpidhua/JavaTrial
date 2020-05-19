package interview.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadLogFile {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// Read file
		try {
		File file = new File("Files/log.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!= null){
			String ip = line.split("\\s")[0];
			if(hm.get(ip)==null) {
				hm.put(ip,1);
			}
			else {
				hm.put(ip,hm.get(ip)+1);
			}
		}
		fr.close();
		}catch(IOException e) {
		e.printStackTrace();	
		}
		int largest = 0;
		String largestKey = null;
		for (String entry : hm.keySet()) {
			if(largest < hm.get(entry)){
				largest = hm.get(entry);	
				largestKey = entry;
			}
		}
		System.out.println(largest);
		System.out.println(largestKey);
		// Write to a file
		try{    
	           FileWriter fw=new FileWriter("Files/testout.txt");    
	           fw.write(largestKey);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	}


