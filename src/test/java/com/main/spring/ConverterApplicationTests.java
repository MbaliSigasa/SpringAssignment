package com.main.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.main.spring.entity.Conversion;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConverterApplicationTests {

	protected Conversion myConv;
	
	@Test
	public void contextLoads() {
	}
	
	@Test 
	public void TestPoundToKilogram() {
		myConv = new Conversion(); 
		 double results = myConv.PoundtoKiloGram(10);
		assertEquals("10 Pounds is equals to 4.54 Kiligrams", 4.54, results, 0 );
	}

}
