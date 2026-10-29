import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniParkingSystemTest {

    @Test
    public void testThatOneSlotIsEmptyAtStart() {
        MiniParkingSystem lot = new MiniParkingSystem(20);
        assertEquals(20, lot.availableSpaces());
    }

    @Test
    public void testThatTwoFirstCarGoesToSlotOne() {
        MiniParkingSystem lot = new MiniParkingSystem(20);
        assertEquals(1, lot.enter());
    }

    @Test
    public void testThatThreeCarFillsLeftToRight() {
        MiniParkingSystem lot = new MiniParkingSystem(20);
        assertEquals(3, lot.enter());
    }



}

