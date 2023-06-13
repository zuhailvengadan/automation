package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderPractice {

	@Test(dataProvider = "dataforTickets")
	public void ticketBookingTest(String src,String dest) {
		System.out.println("frome: "+src+"\t"+"To: "+dest);
	}
	@DataProvider
	public Object[][] dataforTickets(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="Banglore";
		obj[0][1]="Kochi";
		
		obj[1][0]="Banglore";
		obj[1][1]="Hydrabad";
		
		obj[2][0]="Chennai";
		obj[2][1]="Banglore";
		
		return obj;
	}
}
