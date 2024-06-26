package threadsStuff;

public class MathUtilFile {
    //Synchronized is just making the stuff thread safe, here we are Synchronizing the whole methodd
    //synchronized void getMultiplesOfN(int n){
    void getMultiplesOfN(int n){
        //this is a synchronized block to synchronize a specific block of code
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println("Hmm! Some error " + e);
                }
            }
        }
    }
}
