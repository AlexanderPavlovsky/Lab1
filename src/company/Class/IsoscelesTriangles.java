package company.Class;

public class IsoscelesTriangles {
    private IsoscelesTriangle[] isoscelesTriangles;

    public IsoscelesTriangles(final int quantityIsoscelesTriangles) {
        isoscelesTriangles = new IsoscelesTriangle[quantityIsoscelesTriangles];
    }

    public void setIsoscelesTriangle(final IsoscelesTriangle isoscelesTriangle, final int index) {
        this.isoscelesTriangles[index] = isoscelesTriangle;
    }

    public double getMinArea() {
        double minArea = isoscelesTriangles[0].area;
        for (int i = 1; i < isoscelesTriangles.length; i++) {
            if (minArea != 0) {
                if (minArea > isoscelesTriangles[i].area) {
                    minArea = isoscelesTriangles[i].area;
                }
            } else {
                minArea = isoscelesTriangles[i].area;
            }
        }
        return minArea;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < isoscelesTriangles.length; i++) {
            result.append(i + 1).append(") ").append(isoscelesTriangles[i].toString()).append("\n");
        }
        return result.toString();
    }
}
