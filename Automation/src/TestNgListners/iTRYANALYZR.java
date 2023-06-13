package TestNgListners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class iTRYANALYZR implements IRetryAnalyzer{ 


int count;
int maxRetries= 4;

@Override
public boolean retry(ITestResult result) {
	// TODO Auto-generated method stub
	
	return false;
}
}
