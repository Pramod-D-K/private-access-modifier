package p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A  st1 = new A();
        st1.setAge(20);
        st1.setName("Aman");
        A st2 = new A();
        st2.setName("Akash");
        st2.setAge(25);

        System.out.println(st1.getAge()+  "  And  " + st1.getName());
        System.out.println(st2.getAge()+  "  And  " + st2.getName());

        B st3 = new B();
        st3.setNum(100);

        st3.setEdu(sc.nextLine());
        st3.setName(sc.nextLine());
        System.out.println(st3.getNum()+"   edu --"+st3.getEdu()+ "   name--"+st3.getName());
    }
}
