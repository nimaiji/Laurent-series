package Expressions;

/**
 * Created by nima on 6/21/2019 AD.
 */
public class ComplexExpr implements Expr {

    private int realPart;
    private int imaginaryPart;
    private Operator op;

    public ComplexExpr() {
    }

    public ComplexExpr(String expr) {
        parseStringToExpr(expr);
    }

    public ComplexExpr(int realPart, int imaginaryPart, Operator operator) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
        this.op = operator;
    }

    @Override
    public void parseStringToExpr(String expr) {
        char[] charArray = expr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            try {
                if (charArray[i + 1] == 'i')
                    this.imaginaryPart = Character.getNumericValue(charArray[i]);
            } catch (Exception e) {

            }
        }
    }

    @Override
    public int eval() {
        Double realPartD = new Double(realPart);
        Double imaginaryPartD = new Double(imaginaryPart);

        return 0;
    }

    public int getRealPart() {
        return realPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
