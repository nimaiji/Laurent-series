import Expressions.ComplexExpr;
import Expressions.Operator;

/**
 * Created by nima on 6/21/2019 AD.
 */
public class Main {

    public static void main(String[] args) {
        ComplexExpr complexExpr = new ComplexExpr();
        Operator op = new Operator();
        op = op.isOperator("+");
        System.out.println(op.toString());

    }

}
