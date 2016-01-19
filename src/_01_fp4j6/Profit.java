package _01_fp4j6;

import _01_fp4j6.FunctionOverTimeUtil.FunctionOf3;

public class Profit implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public Profit(final Sales sales, final FixedCosts fixedCosts, final IncrementalCosts incrementalCosts) {
        FunctionOf3 fo3 = new FunctionOf3() {
            @Override
            public double apply(Double s, Double fc, Double ic) {
                return s - fc - ic;
            }
        };
        this.valueFunction = FunctionOverTimeUtil.of3(sales, fixedCosts, incrementalCosts, fo3);
    }

    @Override
    public String getName() {
        return "profit!!";
    }

    @Override
    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
