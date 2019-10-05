package company.classes;

import static company.classes.FunUtils.floatFromat;
/**
 * Class isosceles triangle
 */
public class IsoscelesTriangle extends Triangle {
    /**
     * Construct of IsoscelesTriangle class
     * @param sideA The first side triangle
     * @param sideB The second side triangle
     * @param sideC The third side triangle
     */
    public IsoscelesTriangle(final double sideA, final double sideB, final double sideC) {
        super(sideA, sideB, sideC);
    }
    /**
     * Get info about isosceles triangle
     */
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
