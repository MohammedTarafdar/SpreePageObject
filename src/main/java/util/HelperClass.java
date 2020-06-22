package util;

public class HelperClass  {

    public void goSleep(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
