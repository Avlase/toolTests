package tools;

import org.testng.annotations.Test;

public class CrashTest {
    @Test
    public void hammerTest() {
        System.out.println("CrashTest::hammerTest @" + Thread.currentThread().getName());}

    @Test
    public void tenMetersTest() {
        System.out.println("CrashTest::tenMetersTest @" + Thread.currentThread().getName());}

    @Test
    public void twentyMetersTest() {
        System.out.println("CrashTest::twentyMetersTest @" + Thread.currentThread().getName());}

    @Test
    public void poolOneMeterTest() {
        System.out.println("CrashTest::oneMeterTest @" + Thread.currentThread().getName());}

    @Test
    public void fiveMetersTest() {
        System.out.println("CrashTest::fiveMetersTest @" + Thread.currentThread().getName());}

}
