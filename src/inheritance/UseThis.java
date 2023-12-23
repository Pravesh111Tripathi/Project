package inheritance;

public class UseThis {
    public static void main(String[] args) {
        UseThis useThis = new UseThis();
        UseThis useThis1 = new Class1();
        UseThis useThis2 = new Class2();

        useThis.m1();
        useThis1.m1();
        useThis2.m1();
    }

    public void m1() {
        System.out.println(this.getClass().getName());
    }
}
