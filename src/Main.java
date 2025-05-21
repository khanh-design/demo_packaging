import java.security.NoSuchAlgorithmException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("Sum 2 number: " + Calculator.sum(2, 3));
        System.out.println("Sub 2 number: " + Calculator.sub(2, 3));
        System.out.println("Mul 2 number: " + Calculator.mul(2, 3));
        System.out.println("Div 2 number: " + Calculator.divide(2, 3));
    }
}