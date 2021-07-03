import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {

    @Test
    void calculateArea() {
        assertEquals(4, CalculateArea.calculateArea(ShapeType.SQUARE,2.0));
        assertEquals(6, CalculateArea.calculateArea(ShapeType.RECTANGLE,2.0, 3.0));
        assertEquals(Math.PI, CalculateArea.calculateArea(ShapeType.CIRCLE,1.0));
        assertEquals(6, CalculateArea.calculateArea(ShapeType.SQUARE,2));
    }
}