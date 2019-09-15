package company.Class;

public class Triangle {

    protected final double sideA;
    protected final double sideB;
    protected final double sideC;
    protected double alpha;
    protected double betta;
    protected double gamma;
    protected double perimeter;
    protected double area;


    public Triangle(final double sideA, final double sideB, final double sideC) {
        this.sideA = sideA > 0 ? sideA : 0;
        this.sideB = sideB > 0 ? sideB : 0;
        this.sideC = sideC > 0 ? sideC : 0;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            calculation();
        }
    }

    private void calculation() {
        alpha = (Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)) * 180) / Math.PI;
        betta = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)) * 180) / Math.PI;
        gamma = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)) * 180) / Math.PI;
        perimeter = sideA + sideB + sideC;
        area = Math.sqrt((perimeter / 2) * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
    }

    @Override
    public String toString() {
        String result;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            result = "Triangle exists!!! Sides:  a = " + sideA + " cm ; b = " + sideB + " cm ; c = " + sideC + " cm. Corner: alpha = " + String.format("%6.2f", alpha) + " degrees; betta = " + String.format("%6.2f", betta) + " degrees; gamma = " + String.format("%6.2f", gamma) + " degrees. Perimeter: P = " + String.format("%6.2f", perimeter) + " cm. Area: S = " + String.format("%6.2f", area) + " cm^2.";
        } else {
            result = "Triangle doesn't exist !!!";
        }
        return result;
    }
}