package company.Class;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(final double sideA, final double sideB, final double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        String result;
        if (super.sideA < super.sideB + super.sideC && super.sideB < super.sideA + super.sideC && super.sideC < super.sideA + super.sideB && (super.sideA == super.sideB || super.sideB == super.sideC || super.sideA == super.sideC)) {
            result = "Isosceles triangle exists !!! Sides:  a = " + super.sideA + " cm ; b = " + super.sideB + " cm ; c = " + super.sideC + " cm. Corner: alpha = " + String.format("%6.2f", super.alpha) + " degrees; betta = " + String.format("%6.2f", super.betta) + " degrees; gamma = " + String.format("%6.2f", super.gamma) + " degrees. Perimeter: P = " + String.format("%6.2f", super.perimeter) + " cm. Area: S = " + String.format("%6.2f", super.area) + " cm^2.";
        } else {
            result = "Isosceles triangle doesn't exist !!!";
        }
        return result;
    }
}
