import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Leith", 55);
        person = new Person();
    }

    @Test
    public void hasCapacity() {
        assertEquals(55, bus.checkCapacity());
    }

    @Test
    public void hasPassengers() {
        assertEquals(0, bus.checkPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.checkPassengers());
    }

    @Test
    public void cannotAddPassenger() {
        bus = new Bus ("Dalkeith", 1);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.checkPassengers());
    }

    @Test
    public void killPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.killPassenger();
        assertEquals(2, bus.checkPassengers());
    }
}
