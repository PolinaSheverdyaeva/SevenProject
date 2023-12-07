package qagroup;

public class Derived extends AbstractBase {
    public void doSpecialWork() {
        System.out.println("I have done special work");

        doCommonWork();
    }

}
