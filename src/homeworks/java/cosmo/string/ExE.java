package homeworks.java.cosmo.string;

/**
 * Создайте программу,
 * которая на вход получает строку “Мама мыла Милу мылом!”
 * и переводит все в верхний регистр.
 * <p>
 * Подсказка: используйте метод .toUpperCase() класса String
 */
public class ExE {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";

        String outstr = input.toUpperCase();
        System.out.println(outstr);

    }
}