import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Steps.MethodsForCalculator.*;

public class CalculatorTest extends Baze {

    @Test
    public void Test1() {
        clickInput(getDriver());
        getActions().sendKeys("7+7",Keys.ENTER).perform();
        Assert.assertEquals(getResult(getDriver()), "14");
    }

    @Test
    public void Test2() {
        number8(getDriver());
        multiplication(getDriver());
        number5(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "40");
    }

    @Test
    public void Test3() {
        number4(getDriver());
        number5(getDriver());
        minus(getDriver());
        number2(getDriver());
        dot(getDriver());
        number3(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "42.7");
    }

    @Test
    public void Test4(){
        number5(getDriver());
        factorial(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "120");
    }

    @Test
    public void Test5(){
        squareRoot(getDriver());
        number2(getDriver());
        number5(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "5");
    }

    @Test
    public void Test6(){
        number5(getDriver());
        number6(getDriver());
        minus(getDriver());
        number2(getDriver());
        dot(getDriver());
        number8(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "53.2");
    }

    @Test
    public  void Test7(){
        number8(getDriver());
        number1(getDriver());
        divided(getDriver());
        number9(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "9");
    }

    @Test
    public  void Test8(){
        number0(getDriver());
        plus(getDriver());
        number2(getDriver());
        minus(getDriver());
        number6(getDriver());
        multiplication(getDriver());
        number8(getDriver());
        divided(getDriver());
        number4(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "-10");
    }

    @Test
    public  void Test9(){
        squareRoot(getDriver());
        number4(getDriver());
        number6(getDriver());
        minus(getDriver());
        number1(getDriver());
        number0(getDriver());
        factorial(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "Error");
    }

    @Test
    public  void Test10(){
        number0(getDriver());
        dot(getDriver());
        number1(getDriver());
        plus(getDriver());
        number2(getDriver());
        minus(getDriver());
        number3(getDriver());
        multiplication(getDriver());
        number4(getDriver());
        divided(getDriver());
        number5(getDriver());
        factorial(getDriver());
        plus(getDriver());
        number6(getDriver());
        minus(getDriver());
        number7(getDriver());
        multiplication(getDriver());
        number8(getDriver());
        divided(getDriver());
        squareRoot(getDriver());
        number9(getDriver());
        arithmeticEquals(getDriver());

        Assert.assertEquals(getResult(getDriver()), "-10.6666666667");
    }
}
