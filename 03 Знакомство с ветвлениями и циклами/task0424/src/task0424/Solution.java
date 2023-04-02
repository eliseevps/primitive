//Complete

package task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна использовать команды System.out.println() или System.out.print().
3. Программа должна выводить на экран порядковый номер числа, отличного от остальных.
4. Если все числа разные, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[3];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }
        if (numArray[0] == numArray[1] && numArray[0] != numArray[2]) {
            System.out.println(numArray.length);
        } else if (numArray[0] == numArray[2] && numArray[0] != numArray[1]){
            System.out.println(numArray.length-1);
        } else if (numArray[1] == numArray[2] && numArray[1] != numArray[0]){
            System.out.println(numArray.length-2);
        }
    }
}
