import java.util.Scanner;

public class polygonTester {

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of your Polygon: ");
        String shapeType = input.nextLine();

        if(!(shapeType == Polygon.shapeTypeVerify(shapeType)))
        {
            System.out.println("THIS IS NOT A POLYGON");
            return;
        }
        else
        {
            shapeType = shapeType;
        }



        System.out.println("Enter the number of sides your " + shapeType +  " has: ");
        double sides = input.nextDouble();

        if(sides < 3)
        {
            System.out.println("THIS IS NOT A POLYGON");
            return;

        }

        System.out.println("Enter the length of your polygon's sides: ");
        double sideLength = input.nextDouble();
        
        Polygon poly = new Polygon(sides, sideLength, shapeType);
        System.out.println(poly);

    }
}
