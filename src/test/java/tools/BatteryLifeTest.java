package tools;
import org.testng.annotations.Test;

import java.sql.SQLOutput;


public class BatteryLifeTest {

    @Test
    public void capacityTest() {
        System.out.println("BatteryLifeTest::capacityTest @" + Thread.currentThread().getName());}

    @Test
    public void capacityDowngradeTest(){
        System.out.println("BatteryLifeTest::capacityDowngradeTest @" + Thread.currentThread().getName());}

    @Test
    public void lifeTest50percentPower() {
        System.out.println("BatteryLifeTest::lifeTest50percentPower @" + Thread.currentThread().getName());}

    @Test
    public void lifeTest100percentPower() {
        System.out.println("BatteryLifeTest::lifeTest100percentPower @" + Thread.currentThread().getName());}

    @Test
    public void voltageTest() {
        System.out.println("BatteryLifeTest::voltageTest @" + Thread.currentThread().getName());}
}