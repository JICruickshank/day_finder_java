import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {

    private Date date1;
    private Date date2;
    private Date date3;
    private Date date4;
    private Date date5;
    private Day day;

    @Before
    public void setUp() throws Exception {
        date1 = new Date(25, 12, 2018);
        date2 = new Date(1, 5, 2018);
        date3 = new Date(1, 5, 1997);
        date4 = new Date(12, 5, 1979);
        date5 = new Date(12, 7, 2020);
    }

    @Test
    public void testGivesCorrectDay() {
//        assertEquals(0, date5.getDay(), 0.01);
        assertEquals(Day.TUESDAY, date1.getDay());
    }

    @Test
    public void testAnotherDate() {
//        assertEquals(2, date2.getDay(), 0.01);
        assertEquals(Day.TUESDAY, date2.getDay());
    }

    @Test
    public void testAndAnotherDate() {
//        assertEquals(4, date3.getDay(), 0.01);
        assertEquals(Day.THURSDAY, date3.getDay());
    }

    @Test
    public void testAndAnotherOne() {
//        assertEquals(6, date4.getDay(), 0.01);
        assertEquals(Day.SATURDAY, date4.getDay());
    }

    @Test
    public void testFutureDate() {
//        assertEquals(2, date1.getDay(), 0.01);
        assertEquals(Day.TUESDAY, date1.getDay());
    }
}
