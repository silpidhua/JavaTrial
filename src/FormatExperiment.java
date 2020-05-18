import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class FormatExperiment {

	public static void main(String[] args) {
		double result;
		double val1= 4001;
		double val2 = 3000;
		result = val1/val2;
		
		result = Math.round(result*100.0)/100.0;
		//System.out.println(result);
		
		DecimalFormat df = new DecimalFormat("#.######");
		df.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println(result>=1?Math.round(result):df.format(result));
		String searchArray[] = {};
		String search = "3 STAR CHEMICALS (0001696375)^&3M FILM CONSTRUCTION SHANGHAI (0001810849)^&ABC KIMYA SAN DIS TIC A S (0001722797)";
		System.out.println(search.contains("^&"));
		searchArray = search.trim().split("\\s*\\^\\&\\s*");
		System.out.println(Arrays.toString(searchArray));
	}

}
