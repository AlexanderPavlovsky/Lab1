package company;

import company.Class.IsoscelesTriangle;
import company.Class.IsoscelesTriangles;
import company.Class.Triangle;
import company.Class.Triangles;

import java.util.Scanner;

import static company.Class.FunUtils.*;

/**
 * Class Main
 */
public class Main {
    /**
     * Object Triangles
     */
    private static Triangles triangles;
    /**
     * Object IsoscelesTriangles
     */
    private static IsoscelesTriangles isoscelesTriangles;

    /**
     * Main function
     */
    public static void main(String[] args) {
        int quantityTriangles, quantityIsoscelesTriangles;
        final Scanner str = new Scanner(System.in);
        System.out.print("Enter quantity of triangles: ");
        quantityTriangles = isPositive(str);
        if (quantityTriangles != 0) {
            triangles = new Triangles(quantityTriangles);
            System.out.println("Enter the sides of all the triangles:");
            construct(triangles, str, quantityTriangles);
            System.out.println(triangles.toString());
            System.out.println("Average area of all the triangles: " + floatFromat(triangles.getAverageArea()) + " cm^2");
        } else {
            System.out.println("Zero triangles");
        }
        System.out.print("Enter quantity of isosceles triangles: ");
        quantityIsoscelesTriangles = isPositive(str);
        if (quantityIsoscelesTriangles != 0) {
            isoscelesTriangles = new IsoscelesTriangles(quantityIsoscelesTriangles);
            System.out.println("Enter the sides of all the isosceles triangles:");
            construct(isoscelesTriangles, str, quantityIsoscelesTriangles);
            System.out.println(isoscelesTriangles.toString());
            System.out.println("Minimal area of all the isosceles triangles: " + floatFromat(isoscelesTriangles.getMinArea()) + " cm^2");
        } else {
            System.out.println("Zero isosceles triangles");
        }
    }

    private static <T> void construct(T triangle, final Scanner str, final int quantity) {
        double sideA, sideB, sideC;
        for (int i = 0; i < quantity; i++) {
            if (triangle.getClass().getName().equals("company.Class.Triangles")) {
                System.out.println((i + 1) + ") Triangle:");
            } else {
                System.out.println((i + 1) + ") Isosceles triangle:");
            }
            System.out.print("a = ");
            sideA = isDouble(str);
            System.out.print("b = ");
            sideB = isDouble(str);
            System.out.print("c = ");
            sideC = isDouble(str);
            if (triangle.getClass().getName().equals("company.Class.Triangles")) {
                triangles.setTriangle(new Triangle(sideA, sideB, sideC), i);
            } else {
                isoscelesTriangles.setIsoscelesTriangle(new IsoscelesTriangle(sideA, sideB, sideC), i);
            }

        }
    }
}