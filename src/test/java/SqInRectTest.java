import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SqInRectTest {

    @Test
    public void test1() {
        assertEquals(new ArrayList<>(Arrays.asList(3, 2, 1, 1)), SqInRect.sqInRect(5, 3));
    }

    @Test
    public void test2() {
        assertNull(SqInRect.sqInRect(5, 5));
    }
}