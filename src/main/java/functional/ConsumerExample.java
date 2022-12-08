package functional;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Member> fiveYearsLater = member -> member.setAge(member.getAge() + 5);

        Member member = new Member("coco", 22);

        fiveYearsLater.accept(member);
        System.out.printf("name: %s, age: %d\n", member.getName(), member.getAge());

        fiveYearsLater.accept(member);
        System.out.printf("name: %s, age: %d\n", member.getName(), member.getAge());
    }
}
