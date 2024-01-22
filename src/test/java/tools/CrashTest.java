package tools;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CrashTest {
    @Test(groups = {"group-one"})
    public void hammerTest() {
        System.out.println("CrashTest::hammerTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-two"})
    public void tenMetersTest() {
        System.out.println("CrashTest::tenMetersTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-two"})
    public void twentyMetersTest() {
        System.out.println("CrashTest::twentyMetersTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-one"})
    public void poolOneMeterTest() {
        System.out.println("CrashTest::oneMeterTest @" + Thread.currentThread().getName());}

    @Test(groups = {"group-three"})
    public void fiveMetersTest() {
        System.out.println("CrashTest::fiveMetersTest @" + Thread.currentThread().getName());}

    @BeforeTest
    public void beforeTest() {
        System.out.println("CrashTest::beforeTest @" + Thread.currentThread().getName());}

    @AfterMethod
    public void afterMethod() {
        System.out.println("CrashTest::afterMethod @" + Thread.currentThread().getName());}
}
