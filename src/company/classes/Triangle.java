package company.classes;

import static company.classes.FunUtils.floatFromat;

/**
 * Class triangle
 */
public class Triangle {
    /**
     * The first side of triangle
     */
    protected double sideA;
    /**
     * The second side of triangle
     */
    protected double sideB;
    /**
     * The third side of triangle
     */
    protected double sideC;
    /**
     * The first corner of triangle
     */
    protected double alpha;
    /**
     * The second corner of triangle
     */
    protected double betta;
    /**
     * The third corner of triangle
     */
    protected double gamma;
    /**
     * The perimeter of triangle
     */
    protected double perimeter;
    /**
     * The area of triangle
     */
    protected double area;

    /**
     * Construct of Triangle class
     * @param sideA The first side of triangle
     * @param sideB The second side of triangle
     * @param sideC The third side of triangle
     */
    public Triangle(final double sideA, final double sideB, final double sideC) {
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            calculation();
        }
    }

    /**
     * Calculation of unknown values
     */
    private void calculation() {
        alpha = (Math.acos((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC)) * 180) / Math.PI;
        betta = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideC, 2) - Math.pow(sideB, 2)) / (2 * sideA * sideC)) * 180) / Math.PI;
        gamma = (Math.acos((Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideA * sideB)) * 180) / Math.PI;
        perimeter = sideA + sideB + sideC;
        area = Math.sqrt((perimeter / 2) * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - sideC));
    }


    /**
     * Get info about triangle
     */
    @Override
    public String toString() {
        String result;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            result = "Triangle exists!!! Sides:  a = " + sideA + " cm ; b = " + sideB + " cm ; c = " + sideC + " cm. Corner: alpha = " + floatFromat(alpha) + " degrees; betta = " + floatFromat(betta) + " degrees; gamma = " + floatFromat(gamma) + " degrees. Perimeter: P = " + floatFromat(perimeter) + " cm. Area: S = " + floatFromat(area) + " cm^2.";
        } else {
            result = "Triangle doesn't exist !!!";
        }
        return result;
    }
}