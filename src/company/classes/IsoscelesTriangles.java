package company.classes;

/**
 * Class isosceles triangles
 */
public class IsoscelesTriangles {
    /**
     * Array isosceles triangles
     */
    private IsoscelesTriangle[] isoscelesTriangles;

    /**
     * Construct of IsoscelesTriangles class
     *
     * @param quantityIsoscelesTriangles quantity isosceles triangle
     */
    public IsoscelesTriangles(final int quantityIsoscelesTriangles) {
        isoscelesTriangles = new IsoscelesTriangle[quantityIsoscelesTriangles];
    }

    /**
     * Set array of isosceles triangle
     *
     * @param isoscelesTriangle Object isosceles triangle
     * @param index             number of isosceles triangle
     */
    public void setIsoscelesTriangle(final IsoscelesTriangle isoscelesTriangle, final int index) {
        this.isoscelesTriangles[index] = isoscelesTriangle;
    }

    /**
     * Calculation min area of isosceles triangles
     *
     * @return get min area
     */
    public double getMinArea() {
        double minArea = isoscelesTriangles[0].area;
        for (int i = 1; i < isoscelesTriangles.length; i++) {
            if (isoscelesTriangles[i].area != 0) {
                if (minArea != 0) {
                    if (minArea > isoscelesTriangles[i].area) {
                        minArea = isoscelesTriangles[i].area;
                    }
                } else {
                    minArea = isoscelesTriangles[i].area;
                }
            }
        }
        return minArea;
    }

    /**
     * Get info about isosceles triangles
     */
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < isoscelesTriangles.length; i++) {
            result.append(i + 1).append(") ").append(isoscelesTriangles[i].toString()).append("\n");
        }
        return result.toString();
    }
}
