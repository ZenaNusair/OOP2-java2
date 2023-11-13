
package testnov13;

/**
 *
 * @author User
 */
public class TestNov13 {

    
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            SingletonTest test= SingletonTest.getInstance();
            test.hello();
        }
    }
    
}
