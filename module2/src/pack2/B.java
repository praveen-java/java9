package pack2;

import pack1.A;

public class B {
    public void m2(){
        System.out.println("Method of moduleB");
        A a = new A();
        a.m1();
    }
}
