package CCI.arrays_and_strings;

import java.util.Arrays;

public class Urlify {
    private static String urLify(char[] chars, int trueLenght) {
        int spaceCount = 0;
        for (int i = 0; i < trueLenght; i++) {
            if (chars[i] == ' ') spaceCount++;
        }
        System.out.print(spaceCount);
        int index = spaceCount * 2 + trueLenght;
        System.out.print(index);
        for (int i = trueLenght - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index = index - 3;
            } else {
                chars[index - 1] = chars[i];
                index = index - 1;
            }
        }
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        System.out.print(urLify(new char[]{'m', 'r', ' ', 'j', 'o', 'h', 'n', ' ', 's', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ', ' ', ' '}, 13));
    }
}