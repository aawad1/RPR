package ba.unsa.etf.rpr;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test(expected = RuntimeException.class)
    public void zagradeTest() {
        ExpressionEvaluator zagrade = new ExpressionEvaluator();
        double rez = zagrade.evaluate("( 2 + 5 ) + 2");
        assertEquals(rez, 7.0, 0.005);
    }
    @Test
    public void hamoTest1() {
        ExpressionEvaluator hamo1 = new ExpressionEvaluator();
        double rez = hamo1.evaluate("( 1 + ( 2 + 3 ) * ( 4 * 5 ) ) )");
        assertEquals(101, rez, 0.005);
    }

    @Test(expected = NullPointerException.class)
    public void hamoTest2(){
        ExpressionEvaluator zagrade = new ExpressionEvaluator();
        double rez = zagrade.evaluate(null);
        assertEquals(rez, 0, 0.005);
    }

    @Test(expected = EmptyStackException.class)
    public void jedanSpace(){
        ExpressionEvaluator space = new ExpressionEvaluator();
        Double rez = space.evaluate(" ");
        assertEquals(null, rez);
    }

    @Test(expected = RuntimeException.class)
    public void viseElemenata(){
        ExpressionEvaluator space = new ExpressionEvaluator();
        Double rez = space.evaluate("( 2 * 2 * 2 )");
        assertEquals(null, rez);
    }
}
