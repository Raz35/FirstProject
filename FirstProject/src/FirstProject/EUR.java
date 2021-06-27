package FirstProject;

import java.io.Serializable;

public class EUR extends Coin implements Serializable {
    private final double value = 4.23;
            @Override
            public double getValue () {
                return value;
            }

            public double calculate(double arg) {
            return getValue() * arg;
        }

}
