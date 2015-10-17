/**
 * Created by vadulasp on 10/11/15.
 */
public class Calculator {


    interface IntegerMath {
         int operation(int a, int b);
    }

    public int mathOperate(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main (String args[]) {
        System.out.println("In main...");

        IntegerMath addition = (a,b) -> a + b;
        IntegerMath subtraction = (a,b) -> a - b;

        Calculator myApp = new Calculator();

        System.out.println("40 + 2 = " + myApp.mathOperate(40, 2, addition));
        System.out.println("40 - 7 = " + myApp.mathOperate(40, 7, subtraction));
        System.out.println("Help");
    }
}
