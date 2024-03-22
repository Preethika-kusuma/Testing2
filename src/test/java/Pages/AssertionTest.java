package Pages;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class AssertionTest {
  @Test
  
	  public void simpleTestCase(){
	        int a = 1;
	        int b = 2;
	        SoftAssert Assert=new SoftAssert();
	        Assert.assertEquals(a,b);
	    }
  }

