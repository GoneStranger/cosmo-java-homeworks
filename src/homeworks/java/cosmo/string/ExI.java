package homeworks.java.cosmo.string;

import java.util.Arrays;

/**
 * Дан массив строк с номерами телефонов {“9806567890”, “89990980644”, “+79005556134”}.
 * Необходимо все номера телефонов отформатировать на вариант с +7-***-***-**-**.
 * 89990980644 -> +7-999-098-06-44
 * <p>
 * Подсказка: используйте методы .format() и .substring() класса String
 */
public class ExI {
    public static void main(String[] args) {
        String[] input = {"9806567890", "89990980644", "+79005556134" };

        StringBuilder[] output = new StringBuilder[3];
        for(int k =0;k<3;k++) {
            output[k] = new StringBuilder(input[k]);
            //System.out.println(output[0].toString());
        }
        output[0].insert(0,  "+7");
        output[1].replace(0, 1, "+7");
        for (int i = 0 ; i<3; i++){
            output[i].insert(2, "-");
            output[i].insert(6, "-");
            output[i].insert(10, "-");
            output[i].insert(13, "-");
        }

        
        System.out.println(output[0].toString());
        System.out.println(output[1].toString());    
        System.out.println(output[2].toString());
    
    }
}