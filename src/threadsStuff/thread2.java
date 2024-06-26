package threadsStuff;

public class thread2 implements Runnable{
    MathUtilFile MU;
    public thread2(MathUtilFile MU){
        this.MU = MU;
    }
    @Override
    public void run() {
        try{
            System.out.println("thread 2 is running");
            MU.getMultiplesOfN(3);
        }catch (Exception e){
            System.out.println("Something went wrong :" + e);
        }
    }
}
