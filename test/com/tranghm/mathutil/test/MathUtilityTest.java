package com.tranghm.mathutil.test;

import com.tranghm.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//
@RunWith(value = Parameterized.class)
public class MathUtilityTest {

	//return 2D array include pair of ExpectedInputs
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][]{ 
            {0, 1}, 
            {1, 1}, 
            {2, 2}, 
            {3, 6}, 
            {4, 24}, 
            {5, 120}
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
    
}
       
