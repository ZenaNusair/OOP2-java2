package factorytestnov15;

public class FactoryTest {

    public A create(int num) {
        if (num == 1) {
            return new B();
        } else if (num == 2) {
            return new C();

        }
        return null;
    }
}
