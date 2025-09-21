package test;

public class Main {
    public static void main(String[] args) {
        modules mod1 = factory.createModule("module1");
        modules mod2 = factory.createModule("module2");

        mod1.showdetails();
        mod2.showdetails();
    }
}
