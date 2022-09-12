package Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	 @Test(dataProvider="bookticket")
	    public void bookalltickets(String source, String destination ) {
	    System.out.println(source + destination);
	    	
	    }
		@DataProvider 
		public Object[][] bookticket(){
			
			Object[][] data = new Object[2][2];
			data[0][0]= "Pune";	
			data[0][1]= "banglore";
			data[1][0]="Mysore";
			data[1][1]="Goa";
			return data;
    }

}
