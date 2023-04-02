//Complete

package task0205;

/* 
Прибавка к зарплате
В методе public static void hackSalary(int salary) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <salary+100> долларов в месяц."
Где <salary+100> - это зарплата увеличенная на 100.

Подсказки:
Используй конструкцию "текст " + (salary+число) + " текст".
Удели внимание пробелам в тексте.

Пример вывода на экран для salary = 700:
Твоя зарплата составляет: 800 долларов в месяц.


Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод hackSalary не должен возвращать результат.
4. Метод main должен вызвать метод hackSalary только один раз.
5. Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.*/

public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        System.out.println("Твоя зарплата составляет: " + (salary + 100) + " долларов в месяц.");
    }
}
