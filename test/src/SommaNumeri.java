import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SommaNumeri {

    @Test
    public void parseOneNumber(){
        Calculator calculator = new Calculator();
        int result = calculator.parse("1");

        assertThat(result, is(1));
    }

    @Test
    public void parseTwoNumbers(){
        Calculator calculator = new Calculator();
        int result = calculator.parse("1,2");

        assertThat(result, is(3));
    }
    @Test
    public void parseManyNumbers()
    {
        Calculator calculator = new Calculator();
        int result = calculator.parse("1,2,3,4");
        assertThat(result, is(10));
    }
    @Test
    public void parseEmptyString() {
        Calculator calculator = new Calculator();
        int result = calculator.parse("");
        assertThat(result, is(0));
    }
    @Test
    public void parseNotANumberWithNumber()
    {
        Calculator calculator = new Calculator();
        int result = calculator.parse("A1,ABC,4");
        assertThat(result, is(4));
    }
    @Test
    public void parseNotANumber() {
        Calculator calculator = new Calculator();
        int result = calculator.parse("A,ABC");
        assertThat(result, is(0));
    }

    @Test
    public void parseAlphanumeric(){
        Calculator calculator = new Calculator();
        int result = calculator.parse("a,AbC");
        assertThat(result, is(124));
    }

}
