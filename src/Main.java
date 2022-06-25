import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length;
        double height;
        double area;
        double perimeter;
        double diagonal;
        System.out.println("length of rectangle?");
        if (in.hasNextDouble())
        {
            length = in.nextDouble();
            System.out.println("height of rectangle?");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();

                area = length * height;
                perimeter = 2 * (length + height);
                diagonal = Math.sqrt(length * length + height * height);

                System.out.println("The area of the rectangle is " + area);
                System.out.println("The perimeter of the rectangle is " + perimeter);
                System.out.println("The diagonal of the rectangle is " + diagonal);
            }
            else
            {
                System.out.println("invalid entry");
            }
        }
        else
        {
            System.out.println("invalid entry");
        }
    }
}