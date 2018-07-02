import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void mult() {
        Maths a = new Maths(2,2);
        assertEquals(4,a.mult(2,2));
    }

    @Test
    void suma() {
        Maths b = new Maths(5,5);
        assertEquals(10,b.suma(5,5));
    }

}