package general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		String s = "33,44,55,66,a, ,df, ,ff";
		int result = 0;
		
		
		
		
		String [] a = s.split(",");
		
		for(String q :a)
		{
			Pattern p = Pattern.compile("-?\\d+");
			
			Matcher m = p.matcher(q);
			
			while(m.find())
			{
				System.out.println(m.group());
			}
		}
		
		System.out.println(result);
		
		
		
	}

}
