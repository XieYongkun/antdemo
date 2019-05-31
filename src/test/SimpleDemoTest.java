package test;

import static org.junit.Assert.*;

import org.junit.Test;

import icbc.SimpleDemo;

public class SimpleDemoTest {

	SimpleDemo sc = new SimpleDemo();
	     @Test
	    public void AddTest() {
	         int c = sc.Add(3, 5);    
	         assertEquals(8, c);        
	     }
	     @Test
		    public void MethodTest() {
		         int d = sc.Method(8);
		         assertEquals(9, d);        
		     }
}
