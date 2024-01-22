package tools;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WaterproofTest {

    @Test
    public void rainTest(){
        System.out.println("WaterproofTest::rainTest @" + Thread.currentThread().getName());}

    @Test
    public void poolTenMetersTest() {
        System.out.println("WaterproofTest::poolTenMetersTest @" + Thread.currentThread().getName());}

    @Test
    public void poolTwentyMetersTest() {
        System.out.println("WaterproofTest::poolTwentyMetersTest @" + Thread.currentThread().getName());}

    @Test
    public void poolOneMeterTest() {
        System.out.println("WaterproofTest::poolOneMeterTest @" + Thread.currentThread().getName());}

    @Test
    public void drippingTest() {
        System.out.println("WaterproofTest::drippingTest( @" + Thread.currentThread().getName());}

    @BeforeTest
    public void beforeTest() {
        System.out.println("WaterproofTest::beforeTest @" + Thread.currentThread().getName());}

    @AfterMethod
    public void afterMethod() {
        System.out.println("WaterproofTest::afterMethod @" + Thread.currentThread().getName());}
}
