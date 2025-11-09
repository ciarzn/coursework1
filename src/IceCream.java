import java.util.Scanner;
public class IceCream {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double vanillaValue = 0.12;
    double chocolateValue = 0.41;
    double strawberryValue = 0.02;
    double cone = 1.00;

    System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
    char flavour = input.nextLine().charAt(0);
    System.out.println("How many scoops would you like?");
    int numberOfScoops = input.nextInt();

    double ValuePerScoop;
    switch (flavour) {
      case 'v':
          ValuePerScoop = vanillaValue;
          break;
      case 'c':
          ValuePerScoop = chocolateValue;
          break;
      case 's':
          ValuePerScoop = strawberryValue;
          break;
      default:
          System.out.println("We don't have that flavour.");
          return;

    }

    if (numberOfScoops < 1) {
      System.out.println("We don't sell cones on their own.");
      return;
    }
    if (numberOfScoops > 3) {
      System.out.println("That's too many scoops to fit in a cone");
      return;
    }
    double total = cone + (ValuePerScoop * numberOfScoops);
    System.out.printf("That will be %.2f please.%n", total);


  }
}
