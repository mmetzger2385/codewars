import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsogramTests {
    @Test
    public void FixedTests() {
        assertTrue(Isogram.isIsogram("Dermatoglyphics"));
        assertTrue(Isogram.isIsogram("isogram"));
        assertFalse(Isogram.isIsogram("moose"));
        assertFalse(Isogram.isIsogram("isIsogram"));
        assertFalse(Isogram.isIsogram("aba"));
        assertFalse(Isogram.isIsogram("moOse"));
        assertTrue(Isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(Isogram.isIsogram(""));
    }
}
