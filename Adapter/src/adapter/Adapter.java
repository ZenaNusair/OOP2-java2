package adapter;

public class Adapter {

   
    public static void main(String[] args) {
        
        B c = new B();
        B b = new B();
        b.setC(c);
        b.process();
    }
    
}
