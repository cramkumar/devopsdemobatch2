package oata;

import org.junit.Test;

import static org.junit.Assert.fail;

public class HelloWorldTest {
    
    @Test
    public static void main(String[] args) {
        System.out.println("Hello WorldTest");
    }

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}
