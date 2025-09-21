package test;

public class factory {

    public static modules createModule(String type) {
        if (type.equals("module1")) {
            return new module1();
        } else if (type.equals("module2")) {
            return new module2();
        }
        return null;
    }
}
