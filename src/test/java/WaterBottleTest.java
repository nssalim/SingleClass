import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }
    @Test
    public void hasStartVolOf100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canEmptyVolTo0(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void canFillVolTo100(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void canDrinkReduceVolBy10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }
}
