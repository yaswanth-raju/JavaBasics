package BasicApi;

import java.util.Optional;

class A {
    A get() {
        System.out.println("Inside class A");
        return this;
    }
}

class B extends A {
    @Override
    B get() {
        System.out.println("Inside class B");
        return this;
    }
}

public class CovariantExample {
    public static void main(String[] args) {
        A a = new A();
        a.get();
        A b = new B();  //The covariant return type specifies that the return type may vary in the same direction as the subclass.
        b.get();
    }
}