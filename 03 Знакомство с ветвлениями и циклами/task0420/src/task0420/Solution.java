//Complete
package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[3];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 1; i < numArray.length; i++) {
            for (int j = 0; j < numArray.length-i; j++) {
                if (numArray[j] < numArray[j+1]) {
                    numArray[j+1] += numArray[j];
                    numArray[j] = numArray[j+1] - numArray[j];
                    numArray[j+1] -= numArray [j];
                }
            }
        }
        for (int i : numArray) {
            System.out.print(i + " ");
        }
    }
}
