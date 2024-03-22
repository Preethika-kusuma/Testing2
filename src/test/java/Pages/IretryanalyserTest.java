package Pages;
import org.testng.ITestResult;

import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class IretryanalyserTest {
	int newretry=0;
	int count=5;
  @Test
  
  public boolean retry(ITestResult result) {
	  if(!result.isSuccess()) {
		  if(this.count<count) {
			  this.count++;
			  result.setStatus(TestResult.FAILURE);
			  return true;
		  }
		  else {
			  result.setStatus(TestResult.FAILURE);
		  }
	  }
	  else {
		  result.setStatus(ITestResult.SUCCESS);
		  return false;
	  }
	  
	  
	  
 
  
  }
}
