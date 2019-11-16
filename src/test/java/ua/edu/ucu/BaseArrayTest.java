package ua.edu.ucu;

import org.junit.Test;

import ua.edu.ucu.smartarr.BaseArray;

import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Andrii_Rodionov
 */
public class BaseArrayTest {

    private BaseArray arr;

    @Before
    public void setUp() {
        arr = new BaseArray(new Object[] {1, 1, 2, 3, 5, 8});
    }

    @Test
    public void testOperationDescription() {
        String expectedValue = "Base Array";
        assertEquals(expectedValue, arr.operationDescription());
    }

}