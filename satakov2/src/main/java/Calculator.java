import java.util.Scanner;

public class Calculator {

    private int a, b, res;
    private String str;

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.consoleCalc();
        myCalc.Calc();
    }

    public void consoleCalc() {
        Scanner in = new Scanner (System.in);
        String str = in.nextLine();
        String[] strList = str.split(" ");
        this.str = strList[1];
        this.a = Integer.parseInt(strList[0]);
        this.b = Integer.parseInt(strList[2]);
    }
    public void Calc() {
        switch (str) {
            case "+": res = a+b; break;
            case "-": res = a-b; break;
            case "*": res = a*b; break;
            case "/":
                try {
                    res = a/b;
                }catch(ArithmeticException e) {
                    System.out.println("На 0 делить нельзя");
                }
                break;
        }
        System.out.println(res);
    }
}
