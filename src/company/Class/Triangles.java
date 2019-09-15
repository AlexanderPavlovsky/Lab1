package company.Class;

public class Triangles {

    private Triangle[] triangles;

    public Triangles(final int quantityTriangles) {
        triangles = new Triangle[quantityTriangles];
    }

    public void setTriangle(final Triangle triangle, final int index) {
        this.triangles[index] = triangle;
    }

    public double getAverageArea() {
        double area = 0;
        for (final Triangle triangle : triangles) {
            area += triangle.area;
        }
        return area / triangles.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < triangles.length; i++) {
            result.append(i + 1).append(") ").append(triangles[i].toString()).append("\n");
        }
        return result.toString();
    }
}
