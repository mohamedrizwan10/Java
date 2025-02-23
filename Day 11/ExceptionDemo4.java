public class ExceptionDemo4 {
    public static void main(String[] args) {
        LowerAttendenceException l =new LowerAttendenceException("check my attendence");
        try{
            l.checkAttendence(50);
        }catch(LowerAttendenceException le){
            System.out.println("ready to pay fine");

        }

        
    }
    
}
class LowerAttendenceException  extends RuntimeException{
    public LowerAttendenceException(String msg){
        System.out.println(msg);
    }
    public void checkAttendence(int percentage){
        if(percentage>60){
            System.out.println("allow muffa");
        }else{
            //exception possible area
            throw new LowerAttendenceException("muffa attendence is low");
        }


    }

    
}