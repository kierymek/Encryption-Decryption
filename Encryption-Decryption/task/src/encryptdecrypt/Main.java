package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String method = scanner.nextLine();
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
                if (method.equals("enc")) {
                    chars[i] += n;
                } else {
                    chars[i] -= n;
                }
        }
        str = new String(chars);
        System.out.println(str);
    }
}
