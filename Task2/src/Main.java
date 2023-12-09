import java.util.Scanner;

public class Main {
    public static final String CONTROL_LETTERS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЭЮЯабвгдеёжзийклмнеопрстуфхцчшщъьэюя";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию, имя, отчество: ");
        String fullName = scanner.nextLine().trim();
        control(fullName);
    }
    public static void control(String input){

        boolean isValid = true;
        int controlInput = 0;

        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ' '){
                controlInput++;
            }
            if (!CONTROL_LETTERS.contains(String.valueOf(input.charAt(i)).trim())){
                isValid = false;
                break;
            }
        }
        if (isValid && controlInput == 2){
            System.out.println("Фамилия " + input.substring(0, input.indexOf(" ")).trim());
            System.out.println("Имя " + input.substring(input.indexOf(" "),
                    input.lastIndexOf(" ")).trim());
            System.out.println("Отчество " + input.substring(input.lastIndexOf(" ")).trim());

        }else {
            System.out.println("Введенная строка не является Ф.И.О");
        }
    }
}