class Calculator {

    int b1;
    int a1;
    static int answer;


    public int calculator() throws Exception {
        a1 = Main.a1;
        b1 = Main.b1;


        switch (Main.x) {
            case "+":
                answer = a1 + b1;
                break;
            case "-":
                answer = a1 - b1;
                break;
            case "*":
                answer = a1 * b1;
                break;
            case "/":
                answer = a1 / b1;
                break;
            default:
                throw new Exception("Не верный формат ввода");

        }
        return answer;
    }

}