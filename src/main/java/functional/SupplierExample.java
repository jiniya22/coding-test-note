package functional;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Member> guestSupplier = () -> new Member("guest", 33);
        Member guest1 = guestSupplier.get();
        Member guest2 = guestSupplier.get();

        System.out.printf("name: %s, age: %d\n", guest1.getName(), guest1.getAge());
        System.out.println(guest1);
        System.out.println(guest2);
    }
}