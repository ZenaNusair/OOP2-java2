package observer;
import java.util.ArrayList;
public class A {
    ArrayList<AListener> listeners=new ArrayList();
    
    public void m1(){
        fireMethod1Called();
        System.out.println("M1");
    }
    public void addListener(AListener listener){
        listeners.add(listener);
    }
    public void fireMethod1Called(){
        for(AListener listener : listeners){
            listener.m1IsCalled();
        }
    }
}
