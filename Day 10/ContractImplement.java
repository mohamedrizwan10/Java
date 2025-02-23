public class ContractImplement implements Contract,Contract1 {
    public static void main(String[] args) {
        // ContractImplement ci=new ContractImplement();
        Contract.print();
        
    }    
    public  void calculate(int a,int b){
        System.out.println(a*b);
    }
    public void result(){
        System.out.println("result is today");
    }
}
