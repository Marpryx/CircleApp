////////////////////////////////////////////////////////////////
// Circle class was created to calculate the circle's area   //
// and circumference by using the radius of the circle.     //
/////////////////////////////////////////////////////////////


package com.marynapryx;

import java.text.NumberFormat;

/**
 * @author marynaprix
 */

public class Circle {

    double radius;
    double circumference;
    double area;
    static int objectCount;

    public Circle(Double radius, int objectCount) {
        this.radius = radius;
        this.objectCount = objectCount;
    }

    /**
     * Gets circumference
     * @return circumference
     */
    public double getCircumference(){
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    /**
     * Formats circumference
     * @return formatted circumference
     */
    public String getFormattedCircumference(){
        return formatNumber(circumference);
    }

    /**
     * Gets an area
     * @return an area
     */
    public double getArea(){
        area = Math.PI * Math.pow(radius, 2);
        return area;

    }

    /**
     * Gets the formatted area
     */
    public String getFormattedArea(){
        return formatNumber(area);
    }

    /**
     * Formats the number
     * @param num the number to format
     * @return formatted number
     */
    private String formatNumber(double num){
        NumberFormat number = NumberFormat.getInstance(); //Returns a general-purpose number format for the current default
        number.setMaximumFractionDigits(2); //Sets the maximum number of digits allowed in the fraction portion
        return number.format(num);
    }

    /**
     * Gets the object's counter
     * @return object's counter
     */
    public static int getObjectCount(){
        return objectCount;
    }

}
