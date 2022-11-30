/*
1. Выбросить случайное целое число в диапазоне от - 1000 до 1000 и сохранить в i.
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> oddArray = new ArrayList<Integer>();
        List<Integer> evenArray = new ArrayList<Integer>();

        int i = (int) (Math.random() * 2000 - 1000);
        System.out.println("i:" + i);
        String n = Integer.toBinaryString(i);

        int lastIndex;
        {
            String ch = "1";
            lastIndex = n.lastIndexOf(ch);
            System.out.println("lastIndex:" + lastIndex);
        }

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % i == 0) {
                oddArray.add(j);
            }
        }
        System.out.println("oddArray" + oddArray);

        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % i != 0) {
                evenArray.add(j);
            }
        }

        System.out.println("evenArray" + evenArray);
    }
}
