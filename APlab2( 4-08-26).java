/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {

        Child ch = new Child();
        ch.show();

        Child c1 = new Child();
        c1.setNAME("A");

        Child c2 = new Child();
        c2.setNAME("B");

        Child c3 = new Child();
        c3.setNAME("C");

        Child c4 = new Child();
        c4.setNAME("D");

        Child c5 = new Child();
        c5.setNAME("E");

        Mother m = new Mother();

        m.children[0] = c1;
        m.children[1] = c2;
        m.children[2] = c3;
        m.children[3] = c4;
        m.children[4] = c5;

        m.show();
    }
}

