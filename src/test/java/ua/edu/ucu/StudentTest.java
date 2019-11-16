package ua.edu.ucu;

import org.junit.Test;

import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Andrii_Rodionov
 */
public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student("Name", "Surname", 4.0, 2);
    }

    @Test
    public void testToString() {
        String expectedValue = "Student{name=" + student.getName() + ", surname=" + student.getSurname();
        expectedValue += ", " + "GPA=" + student.getGPA() + ", year=" + student.getYear() + '}';
        
        assertEquals(expectedValue, student.toString());
    }

}