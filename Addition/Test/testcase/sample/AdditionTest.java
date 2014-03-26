package testcase.sample;


import Calculation.sample.Addition;
import junit.framework.TestCase;
public class AdditionTest extends TestCase{
	Addition addition;
	public void setUp(){
		addition=new Addition();
	}
	public void testAddition(){
		assertEquals(5, addition.Add2Numbers(2,3));
	}

}
