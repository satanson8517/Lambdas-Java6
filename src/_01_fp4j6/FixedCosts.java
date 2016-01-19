package _01_fp4j6;

public class FixedCosts implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public FixedCosts(final FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "fixed costs";
    }

    @Override
    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
