package functional;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Member> isAdult = member -> member.getAge() >= 19;

        List<Member> members = List.of(new Member("coco", 22), new Member("jenny", 15),
                new Member("sol", 30), new Member("mike", 17));

        for (Member member : members) {
            System.out.printf("이름: %s, 나이: %d, 성인여부: %b\n", member.getName(), member.getAge(), isAdult.test(member));
        }
    }
}
