package mypack;

import org.testng.annotations.Test;

public class Abc {
  @Test(priority=2)
  public void f() {
	  System.out.println("Welcome to java");
  }

  @Test(priority=3)
  public void f1() {
	  System.out.println("Welcome to testng");
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("Welcome to java world");
  }

}
