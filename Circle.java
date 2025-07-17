import java.awt.Color;

/**
 * Represents a circle with a specified radius and color.
 * Provides methods to access the radius, color, and area of the circle.
 * 
 * This class calculates the area internally and exposes it through a getter.
 * 
 * @author nanajjar
 * @version Spring 25
 */
public class Circle {
    /** The radius of the circle */
    private double radius;

    /** The color of the circle */
    private Color color;

    /** The computed area of the circle */
    private double area;

    /**
     * Constructs a default Circle object with a radius of 1.0 and
     * a default color (orange).
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255, 119, 65);
    }

    /**
     * Constructs a Circle with a specified radius and color.
     *
     * @param r    the radius of the circle
     * @param clr  the color of the circle
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the color of the circle.
     *
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the area of the circle.
     * Triggers calculation before returning the result.
     *
     * @return the area of the circle
     */
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * Calculates the area of the circle using the formula: π × radius²
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
