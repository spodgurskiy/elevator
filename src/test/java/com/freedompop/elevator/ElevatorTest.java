package com.freedompop.elevator;


import org.junit.Test;

public class ElevatorTest {

    @Test
    public void testHall() {
        // GIVEN an elevator in a 6 floor building
        // WHEN a user halls for a car from the third floor
        // THEN an elevator arrives
        // AND the elevator opens the door
    }

    @Test
    public void testDelivery() {
        // GIVEN an use is inside of an elevator on a 5th floor
        // WHEN a user push the LOBBY button
        // THEN an elevator closes the door if it's open
        // AND the elevator moves to the desired floor
        // AND the elevator opens the door
    }
}
