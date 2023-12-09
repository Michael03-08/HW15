public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    static String letter = "абвгдеёжзийклмнеопрстуфхцчшщъьэюя";
    static String capitalLetter = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЭЮЯ";
    public static void main(String[] args) {
        //todo код писать тут

        for (int i = 0; i < letter.length(); i++){
            System.out.println(letter.charAt(i) +" - " + letter.codePointAt(i));
        }
        for (int i = 0; i < capitalLetter.length(); i++){
            System.out.println(capitalLetter.charAt(i) + " - " + capitalLetter.codePointAt(i));
        }
    }

}