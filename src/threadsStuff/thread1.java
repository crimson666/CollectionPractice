package threadsStuff;

public class thread1 extends Thread{
    MathUtilFile MU;
    public thread1(MathUtilFile MU){
        this.MU = MU;
    }
    @Override
    public void run() {
        try{
            System.out.println("thread 1 is running");
            MU.getMultiplesOfN(2);
        }catch (Exception e){
            System.out.println("Something went wrong :" + e);
        }
    }
}
