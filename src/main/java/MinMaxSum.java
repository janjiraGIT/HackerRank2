import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSum implements Solution {
    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = null;
        try {
            arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        result(arr);

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> result(List<Integer> arr) {
        int min = 0;
        int max = 0;
        List<Integer> sortedList = new ArrayList<>();

        if (!arr.isEmpty()) {

            sortedList = arr.stream().sorted().collect(toList());// Need to sort min to max value
            min = findMin(sortedList);
            max = findMax(sortedList);

            //sortedList.forEach(System.out::println);
        } else {
            System.out.println("The list is empty");
        }
        System.out.print(min + " " + max);

        List<Integer> listMinMax = new ArrayList<>();
        listMinMax.add(min);
        listMinMax.add(max);
        return listMinMax;
    }

    public int findMin(List<Integer> sortedList) {
        int sum = 0;
        // Sum the sorted value from index 0 - 3
        for (int i = 0; i < sortedList.size()-1; i++) {
                    sum += sortedList.get(i);
        }
        return sum;
    }
    public int findMax(List<Integer> sortedList) {
        int sum = 0;
        // Sum the sorted value from index 1 - 4
        for (int i = 1; i < sortedList.size(); i++) {
            sum += sortedList.get(i);
        }
        return sum;
    }
}

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Example
 * arr=[1,3,5,7,9]
 *
 * The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=20 . The function prints
 * Function Description
 *
 * Complete the miniMaxSum function in the editor below.
 *
 * miniMaxSum has the following parameter(s):
 *
 * arr: an array of 5 integers
 * Print
 *
 * Print two space-separated integers on one line: the minimum sum and the maximum sum of 4  of 5 elements.
 * Input Format
 *
 * A single line of five space-separated integers.
 * Output Format
 *
 * Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)
 * Sample Input
 * 1 2 3 4 5
 * Sample Output
 * 10 14
 *
 */


