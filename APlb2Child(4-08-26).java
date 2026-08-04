public class Child extends Mother {
    String name;
    
    @Override
    void show(){
        System.out.println("Hi child");
    }
    void setNAME(String s) {
        name = s;
    }
    void displayName() {
        System.out.println("Child name : " + name);
    }
}