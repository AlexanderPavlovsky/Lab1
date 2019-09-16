package company.Class;

import static company.Class.FunUtils.floatFromat;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(final double sideA, final double sideB, final double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        String result;
        if (super.sideA < super.sideB + super.sideC && super.sideB < super.sideA + super.sideC && super.sideC < super.sideA + super.sideB && (super.sideA == super.sideB || super.sideB == super.sideC || super.sideA == super.sideC)) {
            result = "Isosceles triangle exists !!! Sides:  a = " + super.sideA + " cm ; b = " + super.sideB + " cm ; c = " + super.sideC + " cm. Corner: alpha = " + floatFromat(super.alpha) + " degrees; betta = " + floatFromat(super.betta) + " degrees; gamma = " + floatFromat(super.gamma) + " degrees. Perimeter: P = " + floatFromat(super.perimeter) + " cm. Area: S = " + floatFromat(super.area) + " cm^2.";
        } else {
            result = "Isosceles triangle doesn't exist !!!";
        }
        return result;
    }
}
