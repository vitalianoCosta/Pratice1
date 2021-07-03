import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    void reverse() {
        StringHelper helper = new StringHelper();
        assertEquals("RORRE", helper.reverse("ERROR"));
        assertEquals("23", helper.reverse("32"));
    }
    @Test
    void encoder() {
        StringHelper helper = new StringHelper();
        assertEquals("1L", helper.encoder("UL"));
    }
}