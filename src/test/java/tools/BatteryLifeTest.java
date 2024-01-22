package tools;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BatteryLifeTest {

    @Test(groups = {"group-one", "group-two"})
    public void capacityTest() {
        System.out.println("BatteryLifeTest::capacityTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-one"})
    public void capacityDowngradeTest(){
        System.out.println("BatteryLifeTest::capacityDowngradeTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-four"})
    public void lifeTest50percentPower() {
        System.out.println("BatteryLifeTest::lifeTest50percentPower @" + Thread.currentThread().getName());}

    @Test(groups = {"group-three"})
    public void lifeTest100percentPower() {
        System.out.println("BatteryLifeTest::lifeTest100percentPower @" + Thread.currentThread().getName());}

    @Test(groups = {"group-two"})
    public void voltageTest() {
        System.out.println("BatteryLifeTest::voltageTest @" + Thread.currentThread().getName());}

    @BeforeTest
    public void beforeTest() {
        System.out.println("BatteryLifeTest::beforeTest @" + Thread.currentThread().getName());}

    @AfterMethod
    public void afterMethod() {
        System.out.println("BatteryLifeTest::afterMethod @" + Thread.currentThread().getName());}

}
