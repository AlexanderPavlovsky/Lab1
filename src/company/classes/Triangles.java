package company.classes;

/**
 * Class triangles
 */
public class Triangles {
    /**
     * Array triangles
     */
    private Triangle[] triangles;

    /**
     * Construct of Triangles class
     * @param quantityTriangles quantity triangle
     */
    public Triangles(final int quantityTriangles) {
        triangles = new Triangle[quantityTriangles];
    }

    /**
     * Set array of triangle
     * @param triangle Object triangle
     * @param index number of triangle
     */
    public void setTriangle(final Triangle triangle, final int index) {
        this.triangles[index] = triangle;
    }

    /**
     * Calculation average area of triangles
     * @return get average area
     */
    public double getAverageArea() {
        double area = 0;
        for (final Triangle triangle : triangles) {
            area += triangle.area;
        }
        return area / triangles.length;
    }
    /**
     * Get info about triangles
     */
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < triangles.length; i++) {
            result.append(i + 1).append(") ").append(triangles[i].toString()).append("\n");
        }
        return result.toString();
    }
}
