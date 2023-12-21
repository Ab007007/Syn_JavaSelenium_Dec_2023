package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
  
	
  @Test(dataProvider = "dp")
  public void f(String s1, String s2,String s3) {
	  
	  System.out.println(s1 + " - " + s2 + " - " + s3);
  }

  @DataProvider
  public Object[][] formfillData() {
    return new Object[][] {
      new Object[] { "user-fn1", "user-ln1","user-jt1" },
      new Object[] { "user-fn2", "user-ln2","user-jt2" },
      new Object[] { "user-fn3", "user-ln3","user-jt3" },
      new Object[] { "user-fn4", "user-ln4","user-jt4" },
      new Object[] { "user-fn5", "user-ln5","user-jt5" },
      new Object[] { "user-fn6", "user-ln6","user-jt6" },
      new Object[] { "user-fn7", "user-ln7","user-jt7" },
      new Object[] { "user-fn8", "user-ln8","user-jt8" }
    };
  }
}
