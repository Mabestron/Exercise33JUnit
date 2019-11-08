package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exercise33empleado.model.Employee;

class exercise33empleadotest {

	@Test
	void testCalculateBrute1() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	void testCalculateBrute2() 
	{
		Employee myEmployee = new Employee();
		double actualValue=myEmployee.calculateBrute("salesEmployee", 0, 0);
		double expectedValue=1000;
		assertEquals(actualValue,expectedValue);
	}
	
	@Test
	void testCalculateBrute3() 
	{
		Employee myEmployee = new Employee();
		double actualValue=myEmployee.calculateBrute("salesManager", 1000, 0);
		double expectedValue=1600;
		assertEquals(actualValue,expectedValue);
	}
	
	

}
