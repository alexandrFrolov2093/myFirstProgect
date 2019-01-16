package modul1.lesson7.homeWork;

public class StringUtils {

    public static String reverse(String text) {
        char[] textToChar = text.toCharArray();
        char[] reversString = new char[textToChar.length];
        for (int i = 0, index = textToChar.length - 1; i < textToChar.length; i++, index--) {
            reversString[i] = textToChar[index];
        }
        return String.valueOf(reversString);
    }

    public static int countGlass(String text) {
        char[] glasn = {'а', 'А', 'е', 'Е', 'ё', 'Ё', 'и', 'И', 'о', 'О', 'у', 'У', 'ы', 'Ы', 'э', 'Э',
                'ю', 'Ю', 'я', 'Я', 'e', 'E', 'u', 'U', 'i', 'I', 'o', 'O', 'a', 'A', 'y', 'Y'};
        int kolvo = 0;
        char[] textToChat = text.toCharArray();
        for (int i = 0; i < textToChat.length; i++) {
            for (int k = 0; k < glasn.length; k++) {
                if (textToChat[i] == glasn[k]) {
                    kolvo++;
                    break;
                }
            }
        }
        return kolvo;
    }

    public static int countSoglasnie(String text) {
        char[] soglasnie = {'q', 'Q', 'w', 'W', 'r', 'R', 't', 'T', 'p', 'P', 's', 'S', 'd', 'D', 'f', 'F', 'g', 'G',
                'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L', 'z', 'Z', 'x', 'X', 'c', 'C', 'v', 'V', 'b', 'B', 'n', 'N', 'm',
                'M', 'й', 'Й', 'ц', 'Ц', 'к', 'К', 'н', 'Н', 'г', 'Г', 'ш', 'Ш', 'щ', 'Щ', 'з', 'З', 'х', 'Х', 'ф', 'Ф',
                'в', 'В', 'п', 'П', 'р', 'Р', 'л', 'Л', 'д', 'Д', 'ж', 'Ж', 'ч', 'Ч', 'с', 'С', 'м', 'М', 'т', 'Т', 'б', 'Б'};
        int kolvo = 0;
        char[] textToChat = text.toCharArray();
        for (int i = 0; i < textToChat.length; i++) {
            for (int k = 0; k < soglasnie.length; k++) {
                if (textToChat[i] == soglasnie[k]) {
                    kolvo++;
                    break;
                }
            }
        }
        return kolvo;
    }
}
