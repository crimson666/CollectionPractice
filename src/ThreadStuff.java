import threadsStuff.MathUtilFile;
import threadsStuff.thread1;
import threadsStuff.thread2;

public class ThreadStuff {
    public static void main(String[] args) {
        MathUtilFile obj = new MathUtilFile();
//        int i=10;
//        for(int n=0;n<=i;n++){
            thread1 t1 = new thread1(obj);
            t1.start();

            Thread t2 = new Thread(new thread2(obj));
            t2.start();
//        }

    }
}
