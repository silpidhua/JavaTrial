import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.HashMap;  
public class test {
		public static void main(String args[]) {
			System.out.println("Hello World!");
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date1 = new Date();  
		    System.out.println(formatter.format(date1)); 
		    System.out.println("getTimeDate1 "+date1.getTime());
		    System.out.println("Hello World!");

		    try {
				Thread.sleep(2400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Date date2 = new Date();  
		    System.out.println(formatter.format(date2));
		    System.out.println("getTimeDate1 "+date1.getTime());
		    System.out.println("getTimeDate2 "+date2.getTime());
		    long difference = date2.getTime() - date1.getTime(); 
		    System.out.println(difference);
		    
		    HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		    System.out.println("Initial list of elements: "+hm);  
		      hm.put(100,"Amit");    
		      hm.put(101,"Vijay");    
		      hm.put(102,"Rahul");   
		}
}
