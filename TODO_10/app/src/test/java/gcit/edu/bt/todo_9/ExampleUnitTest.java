package gcit.edu.bt.todo_9;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
@SmallTest
public class ExampleUnitTest {
    private calculator mCal;

    @Before
    public void setUp(){
        mCal = new calculator();
    }
    @Test
    public void addTwoNumber() {
        double result = mCal.add(1d,2d);
        assertThat(result, is(equalTo(3d)));
    }
    @Test
    public void addTwoNumbersNegative(){
        double result = mCal.add(-2d,5d);
        assertThat(result, is(equalTo(3d)));
    }
    @Test
    public void addTwoNumbersFloats() {
        double result = mCal.add(2.222f, 2.222d);
        assertThat(result, is(closeTo(4.444d, 0.02)));
    }
    @Test
    public void subTwoNumber() {
        double result = mCal.sub(1d, 2d);
        assertThat(result, is(equalTo(-1d)));
    }
    @Test
    public void subNegative() {
        double result = mCal.sub(-1d, 2d);
        assertThat(result, is(equalTo(-3d)));
    }
    @Test
    public void subTwoNumberFloats() {
        double result = mCal.sub(1.111f, 2.111d);
        assertThat(result, is(closeTo(-1d,0.01)));
    }
    @Test
    public void mulTwoNumber() {
        double result = mCal.mul(25d,2d);
        assertThat(result, is(equalTo(50d)));
    }
    @Test
    public void mulNumberNegative(){
        double result = mCal.mul(30d,-3d);
        assertThat(result,is(equalTo(-90d)));
    }
    @Test
    public void mulZeroNumber() {
        double result = mCal.mul(0d,2d);
        assertThat(result, is(equalTo(0d)));
    }
    @Test
    public void mulTwoNumberFloats() {
        double result = mCal.mul(1.1f,2.2d);
        assertThat(result, is(closeTo(2.42d, 0.01)));
    }
    @Test
    public void divTwoNumber(){
        double result = mCal.div(30d,3d);
        assertThat(result,is(equalTo(10d)));
    }
    @Test
    public void divNumberWithZero(){
        double result = mCal.div(30d,0d);
        assertThat(result,is(equalTo(Double.POSITIVE_INFINITY)));
    }
    @Test
    public void divTwoNumberNegative(){
        double result = mCal.div(-30d,-3d);
        assertThat(result,is(equalTo(10d)));
    }
    @Test
    public void divTwoNumberFloats(){
        double result = mCal.div(3.33f,3.33d);
        assertThat(result,is(closeTo(1d, 0.001)));
    }
    @Test
    public void divTwoNumberZero(){
        double result = mCal.div(0d,0d);
        assertThat(result,is(equalTo(Double.POSITIVE_INFINITY)));
    }
}