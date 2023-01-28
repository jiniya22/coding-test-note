package hackerrank1w.day3;

import java.util.Arrays;
import java.util.List;

public class GridChallengeExample {
    public static void main(String[] args) {
        System.out.println(gridChallenge(List.of("ebacd", "fghij", "olmkn", "trpqs", "xywuv")));
    }
    static String gridChallenge(List<String> grid) {
        String sortedStr = sort(grid.get(0));
        String prevStr = sortedStr;
        for (int i = 1; i < grid.size(); i++) {
            sortedStr = sort(grid.get(i));
            for (int j = 0; j < sortedStr.length(); j++) {
                if(prevStr.charAt(j) > sortedStr.charAt(j)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }


//    static String gridChallenge(List<String> grid) {
//        int gridSize = grid.size();
//        char[][] matrix = new char[gridSize][gridSize];
//        for (int i = 0; i < gridSize; i++) {
//            char[] temp = grid.get(i).toCharArray();
//            Arrays.sort(temp);
//            matrix[i] = temp;
//        }
//
//        for (int i = 0; i < gridSize; i++) {
//
//        }
//
//        return null;
//    }

//    static List<Character> quickSort(List<Character> arr) {
//        if (arr == null || arr.size() < 2) return arr;
//        List<Character> left = new ArrayList<>(), right = new ArrayList<>();
//        char pivot = arr.get(0);
//        for (int i = 1; i < arr.size(); i++) {
//            char ele = arr.get(i);
//            if (ele < pivot) {
//                left.add(ele);
//            } else {
//                right.add(ele);
//            }
//        }
//        List<Character> result = new ArrayList<>(quickSort(left));
//        result.add(pivot);
//        result.addAll(quickSort(right));
//        return result;
//    }
}
