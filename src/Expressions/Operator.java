package Expressions;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Created by nima on 6/21/2019 AD.
 */
public class Operator {

    private String name;
    private String symbol;
    private int[] operands;

    public static Operator ADD = new Operator("add", "+", -1);
    public static Operator SUB = new Operator("sub", "-", -1);

    public static Operator[] operators = {ADD, SUB};

    public Operator() {
    }

    public Operator(String name, String symbol, int... ops) {
        this.name = name;
        this.symbol = symbol;
        this.operands = ops;
    }

    public Operator isOperator(String string) {
        for (Operator op : operators)
            if (op.getName().equals(string) || op.getSymbol().equals(string))
                return op;
        return null;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operator operator = (Operator) o;

        if (name != null ? !name.equals(operator.name) : operator.name != null) return false;
        if (symbol != null ? !symbol.equals(operator.symbol) : operator.symbol != null) return false;
        return Arrays.equals(operands, operator.operands);

    }

    @Override
    public String toString() {
        return symbol;
    }


}
