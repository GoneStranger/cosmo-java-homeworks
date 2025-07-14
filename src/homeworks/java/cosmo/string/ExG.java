package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String res1 = input.replace("?", "");
        String[] strArray = res1.split(" ");
        
        for(int i=2 ; i>=0; i--){
            System.out.println(strArray[i]);
        }

        strArray[0].replaceFirst("д", "Д");
        strArray[2].replaceFirst("Г", "г");

        String result =""; 
        for(int k=0; k<3; k++)
            result = result + strArray[k] + " ";



            System.out.println(result.trim() + "?");



    }
}