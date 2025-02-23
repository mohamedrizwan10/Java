public class MainThread1 {
    public static void main(String[] args) {
        
        ChildThread1 ct1= new ChildThread1();
        ct1.start();
        System.out.println(ct1.getState());
        
        System.out.println(ct1.getName());
        
        for(int i=1;i<=5;i++){
            System.out.println("MainThread" +i);
        }
        // ct1.join();


        
    }
    
}
class ChildThread1 extends Thread{
    @Override
    public void run() {
        Thread.yield();
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println("ChildThread" +i);
            }
            catch(InterruptedException ie){
                System.out.println("Intruppted by sleep");

            }
            
           

        }
    }
}
