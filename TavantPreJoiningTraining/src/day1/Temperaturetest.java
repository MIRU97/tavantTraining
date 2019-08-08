package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Temperaturetest {

	@Test
	void test() 
	{
		Temperature t = new  Temperature();

		double output =t.ConvToFaren(16);

		assertEquals(60.8,output);

		double output2 = t.ConvToCelsi(60.8);

		assertEquals(16.0,output2);
	}

}