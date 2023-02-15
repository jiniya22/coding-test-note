package string;

import util.CommonUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 모음, 자음 세기
 */
public class CountVowelsAndConsonantsExample {

    private static final Set<Character> VOWELS = new HashSet(List.of('a', 'e', 'i', 'o', 'u'));
    private static final String s = " Hello jiniworld!! ";

    public static void main(String[] args) {

        System.out.println("입력값: " + s);

        long startTimeV1 = System.nanoTime();

        Pair pairV1 = countVowelsAndConsonants(s);
        CommonUtils.displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Vowels: " + pairV1.getVowel() + ", Consonants: " + pairV1.getConsonants());

    }

    static Pair<Integer, Integer> countVowelsAndConsonants(String str) {
        if (str == null || str.isBlank()) {
            return Pair.of(-1, -1);
        }

        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (VOWELS.contains(ch)) {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        return Pair.of(vowels, consonants);
    }

}

class Pair<V, C> {
    private final V vowel;
    private final C consonants;

    private Pair(V vowel, C consonants) {
        this.vowel = vowel;
        this.consonants = consonants;
    }

    public static <V, C> Pair<V, C> of(V vowel, C consonants) {
        return new Pair<>(vowel, consonants);
    }

    public V getVowel() {
        return vowel;
    }

    public C getConsonants() {
        return consonants;
    }

    @Override
    public int hashCode() {
        return vowel.hashCode() ^ consonants.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pair<?, ?> p) {
            return this.vowel.equals(p.getVowel()) && this.vowel.equals(p.getConsonants());
        }
        return false;
    }
}