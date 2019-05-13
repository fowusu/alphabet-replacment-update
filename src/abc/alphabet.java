package abc;


import java.util.List;
import java.util.stream.Collectors;

public class alphabet {
	static String newString = "";
	 public static void main( String[] args )
	    {
	    	
	    	String abc1 ="This NETbuilder assessment is way too easy.";
	
//	    	
	    	
	    	
	    	change(abc1);
	    	
	    	String equal= "20 8 9 19 14 5 20 2 21 9 12 4 5 18 1 19 19 5 19 19 13 5 14 20 9 19 23 1 25 20 15 15 5 1 19 25 ";
	    				 
	    	System.out.println(newString);
	    	if(equal.equals(newString)) {
	    		System.out.println(true);
	    	}
	    	else {
	    		System.out.println(false);
	    	}
	    	
	   	
	    }
	 
	 public static void addString(String x) {
		 alphabet.newString += x + " ";
	 }
	 
	 public static void change(String x) {
		 String abc1 = x.toLowerCase();
		 
			List<String> newStrList = abc1.chars()
	    			.mapToObj(c-> (int) c-96)
	    			.filter(n -> n>=1 && n<=26)
	    			.map(c -> c.toString())
	    			.collect(Collectors.toList());
	    
	    	newStrList.stream().forEach(alphabet::addString);
	    	
	 }
	 
}
