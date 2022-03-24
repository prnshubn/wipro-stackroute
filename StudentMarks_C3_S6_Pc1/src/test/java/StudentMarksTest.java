import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
public class StudentMarksTest {

    private StudentMarks studentMarks;

    @BeforeEach
    public void setUp() {

        studentMarks = new StudentMarks();
    }

    @AfterEach
    public void tearDown() {
        studentMarks = null;
    }


    @Test
    public void givenObjectWhenAccessNonStaticMethodWithThreeParamsThenReturnInteger() {

        studentMarks = new StudentMarks();

        assertEquals(300, studentMarks.calculateMarks(100, 100, 100));
    }

    @Test
    public void givenObjectWhenAccessNonStaticMethodWithFourParamsThenReturnInteger() {


        studentMarks = new StudentMarks();

        assertEquals(398, studentMarks.calculateMarks(100, 100, 100, 98));
    }


    @Test
    public void givenObjectWhenAccessNonStaticMethodWithFourDoubleParamsThenReturnDouble() {

        studentMarks = new StudentMarks();
        assertNotEquals(300, studentMarks.calculateMarks(98.58, 98.56, 99.97, 98.08));

        assertEquals(395.19, studentMarks.calculateMarks(98.58, 98.56, 99.97, 98.08));
    }

    @Test
    public void givenObjectWhenAccessNonStaticMethodWithFloatParamsThenReturnFloat() {

        studentMarks = new StudentMarks();

        assertEquals(395.19000244140625, studentMarks.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f));


        assertNotEquals(300, studentMarks.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f));
    }

    @Test
    public void givenClassWhenAccessOverloadedStaticMethodWithFloatParamsThenReturnFloat() {

        assertNotEquals(300, StudentMarks.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f, 99.7f));

        assertEquals(494.8900146484375, StudentMarks.calculateMarks(98.58f, 98.56f, 99.97f, 98.08f, 99.7f));
    }

}
