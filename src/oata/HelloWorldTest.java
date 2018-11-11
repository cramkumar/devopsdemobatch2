import static org.junit.Assert.assertEquals;
import org.junit.Test;

package oata;

public class HelloWorldTest {
   @Test
    public static void main(String[] args) {
     Calculator calculator = new Calculator();
      int sum = calculator.evaluate("1+2+3");
      assertEquals(6, sum);
       System.out.println("Hello World");
    }
}
