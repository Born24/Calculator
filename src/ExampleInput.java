import java.util.Scanner;

class ExampleInput {


    public static void Input() throws Exception {
        boolean l1 = true;
        boolean l2 = true;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String a = words[0];
        Main.x = words[1];
        String b = words[2];

        if (words.length == 3) {
            String[] arab = new String[]{"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] rome = new String[]{"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};


            for (int i = 0; i < arab.length; i++) {
                if (rome[i].equals(a)) {
                    a = arab[i];
                    l1 = false;
                }
                if (rome[i].equals(b)) {
                    b = arab[i];
                    l2 = false;
                }

            }


            try {

                Main.a1 = Integer.parseInt(a.trim());
                Main.b1 = Integer.parseInt(b.trim());
            } catch (Exception e) {
                System.err.println("Веедите числа не больше X");
            }
            Calculator calculator = new Calculator();


            if (l1 != l2) {
                throw new Exception("Только арабские или только римские числа");
            }
            if (Main.a1 >= 11 || Main.b1 >= 11) {
                throw new Exception("Введите числа не больше 10");
            } else if (Main.a1 <= 0 || Main.b1 <= 0) {
                throw new Exception("Введите числа больше нуля");
            } else if (l1) {
                System.out.println(calculator.calculator());
            } else {
                String roman_numeral_output = NumberConvertManager.transform_number_to_roman_numeral(calculator.calculator());
                System.out.println(roman_numeral_output);

            }

        } else {
            throw new RuntimeException("Калькулятор принимает только два числа и один оператор");
        }

    }

}