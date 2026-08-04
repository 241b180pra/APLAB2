public class Mother {

    Child[] children = new Child[5];

    void show() {
        System.out.println("hii Mother0");

        for (Child c : children) {
            if (c != null) {
                c.displayName();
            }
        }
    }

    void show(int x) {
        System.out.println("hii Mother1");
    }

    void show(int x, int y) {
        System.out.println("hii Mother");
    }

    void show(float f) {
        System.out.println("hii Mother float");
    }

    void show(String s) {
        System.out.println("hii Mother string");
    }
}