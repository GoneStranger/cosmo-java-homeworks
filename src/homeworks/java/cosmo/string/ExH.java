package homeworks.java.cosmo.string;

/**
 * Нужно привести строку с полным именем к инициалам.
 * Например, "Носов Алексей Олегович" будет иметь вид: "Н.А.О."
 * Носов Алексей Олегович -> Н.А.О.
 * <p>
 * Подсказка: используйте методы .split() и .charAt() класса String
 */
public class ExH {
    public static void main(String[] args) {
        String fullName = "Носов Алексей Олегович";

        String[] strArray = fullName.split(" ");
        char[] charArray = new char[strArray.length];


        for(int i = 0 ;i<3; i++) {
            charArray[i] = strArray[i].charAt(0);
        }
        StringBuilder result = new StringBuilder("");
        for(int k=0;k<3; k++)
            result.append(charArray[k]).append('.');

System.out.println("\n ================== \n");
        System.out.println(result.toString());

        
    }
}
