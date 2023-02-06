import java.text.DecimalFormat;

public class Polygon {
    /**
     * @file Polygon.java
     * @date 2/2/23
     * @author Aiden Michael Leon Guerrero San Nicolas
     */

    private double sides;
    private double sideLength;
    private String shapeType;
    private double area;
    private double perimeter;



    public Polygon()
    {
        sides = 3.0;
        sideLength = 1.0;
        shapeType = "Triangle";
        perimeter = sides * sideLength;

    }

    public Polygon(double s, double sL, String sT)
    {
        this.sides = s;
        this.sideLength = sL;
        this.shapeType = sT;
    }

    public double getNumSides()
    {
        return sides;
    }

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
     * @param newSideLength Allowing the User to change the side Length HIIII
     */

    public void setSideLength(double newSideLength)
    {
        sides = newSideLength;
    }


    //FOR THE AREA YOU HAVE TO MAKE AN IF STATEMENT
    //IF THE NUMBER OF SIDES ARE 3 THEN (if statement) DIVIDE (sideLength * sideLength) by two
    //for



    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##"); //displays a number with two deecimal places
        return "Your shape is a " + shapeType + " and it has " + df.format(sides) + " sides. \n" + " It has a side length of " + df.format(sideLength) + ".\n" +
                " It has a perimeter of " + getPerimeter()  + " units.\n";
    }











}
