package try_pal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromeTest {

    @Test
    void ispal() {
        palindrome obj1 = new palindrome();
        assertEquals(false,obj1.ispal("ohhh"));
        assertEquals(true, obj1.ispal("huh"));
    }
}