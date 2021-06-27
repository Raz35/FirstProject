package FirstProject;

import java.io.Serializable;

public class USD extends Coin implements Serializable {
    private final double value =3.52;

        @Override
        public double getValue() { return value; }

        public double calculate(double arg) {
        return getValue()*arg;
    }
}
