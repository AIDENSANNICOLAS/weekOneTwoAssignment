import java.text.DecimalFormat;
import java.util.Arrays;

public class Polygon {
    /**
     * @file Polygon.java
     * @date 2/2/23
     * @author Aiden Michael Leon Guerrero San Nicolas
     */

    private int sides;
    private double sideLength;
    private String shapeType;
    private double area;
    private double perimeter;

    public Polygon()
    {
        sides = 3;
        sideLength = 1.0;
        shapeType = "Triangle";
        perimeter = sides * sideLength;

    }

    public Polygon(int s, double sL, String sT)
    {
        sides = s;
        sideLength = sL;
        shapeType = sT;
    }


    /**
     *
     * @getNumSides This returns the number of sides the user inputs.
     */
    public double getNumSides()
    {
        return sides;
    }


    /**
     *
     * @getSideLength This returns the side Length to the user.
     */
    public double getSideLength()
    {
        return sideLength;
    }

    public String getShapeType()
    {
        return shapeType;
    }


    public double getPerimeter()
    {
        perimeter = sides * sideLength;
        return perimeter;

    }

    /**
     *
     * @param newSideLength Allowing the User to change the side Length
     */

    public void setSideLength(int newSideLength)
    {
        sides = newSideLength;
    }



    public double getArea()
    {
        if(sides >= 3 && sideLength>1.0) {
            double area = Math.round((sides * (sideLength * sideLength)) / (4.0 * Math.tan((Math.PI / sides)))*1000);
            area /= 1000.0;
            return area;
        }

        else{}
        {
            return area;
        }

    }

    //FOR THE AREA YOU HAVE TO MAKE AN IF STATEMENT
    //IF THE NUMBER OF SIDES ARE 3 THEN (if statement) DIVIDE (sideLength * sideLength) by two
    //for



    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with two deecimal places
        return "Your shape is a " + shapeType + " and it has " + df.format(sides) + " sides. \n" + " It has a side length of " + df.format(sideLength) + ".\n" +
                " It has a perimeter of " + getPerimeter()  + " units.\n" + " It has an area of " + getArea() + ".";
    }











}
