import java.util.Scanner;

public class Unikey_Bi_Loi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String input = sc.nextLine();

            String[] words = input.split(" ");

            StringBuilder result = new StringBuilder();

            for (String word : words) {
                StringBuilder validPart = new StringBuilder();
                StringBuilder invalidPart = new StringBuilder();

                for (char ch : word.toCharArray()) {
                    if (ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '!' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')') {
                        invalidPart.append(ch);
                    } else {
                        validPart.append(ch);
                    }
                }

                result.append(validPart).append(invalidPart).append(" ");
            }

            System.out.println(result.toString().trim());
        }

        sc.close(); // Đóng Scanner sau khi sử dụng xong
    }
}
