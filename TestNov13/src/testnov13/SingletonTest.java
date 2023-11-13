
package testnov13;


public class SingletonTest {
    private static SingletonTest instance;
    
    private SingletonTest(){
        System.out.println("New obj");
    }
    
    public static SingletonTest getInstance(){
        if(instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }
    
    public void hello(){
        System.out.println("Hello singleton");
    }
}
