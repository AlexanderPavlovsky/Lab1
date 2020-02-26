package company;

import company.classes.IsoscelesTriangle;
import company.classes.IsoscelesTriangles;
import company.classes.Triangle;
import company.classes.Triangles;

import java.util.Scanner;

import static company.classes.FunUtils.*;

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
    public static void main(String[] args) 
    {
        int quantityTriangles, quantityIsoscelesTriangles;
        final Scanner str = new Scanner(System.in);
        System.out.print("Enter quantity of triangles: ");
        quantityTriangles = isPositive(str);
        if (quantityTriangles != 0) {
            triangles = new Triangles(quantityTriangles);
            System.out.println("Enter the sides of all the triangles:");
            createTriangle(triangles, str, quantityTriangles);
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
            createTriangle(isoscelesTriangles, str, quantityIsoscelesTriangles);
            System.out.println(isoscelesTriangles.toString());
            System.out.println("Minimal area of all the isosceles triangles: " + floatFromat(isoscelesTriangles.getMinArea()) + " cm^2");
        } else {
            System.out.println("Zero isosceless triangles");
        }
    }

    private static <T> void createTriangle(T triangle, final Scanner str, final int quantity) {
        double sideA, sideB, sideC;
        for (int i = 0; i < quantity; i++) {
            if (triangle.getClass().getName().equals("company.classes.Triangles")) {
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
            if (triangle.getClass().getName().equals("company.classes.Triangles")) {
                triangles.setTriangle(new Triangle(sideA, sideB, sideC), i);
            } else {
                isoscelesTriangles.setIsoscelesTriangle(new IsoscelesTriangle(sideA, sideB, sideC), i);
            }

        }
    }
}
