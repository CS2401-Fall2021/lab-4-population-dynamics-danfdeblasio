import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs = line.split(",");
    if (inputs[0].equals("m1")) {
      double pop = Double.parseDouble(inputs[1]);
      System.out.println(Population.getInitialStartTimeForMoose1(pop));
    }
    if (inputs[0].equals("m2")) {
      double endpop = Double.parseDouble(inputs[1]);
      double startpop = Double.parseDouble(inputs[2]);
      System.out.println(Population.getInitialStartTimeForMoose2(endpop,startpop));
    }
    if (inputs[0].equals("m3")) {
      double moose = Double.parseDouble(inputs[1]);
      double wolf = Double.parseDouble(inputs[2]);
      int year = Integer.parseInt(inputs[3]);
      System.out.println(Population.getMoosePopulationWithWolves(moose, wolf, year));
    }
    if (inputs[0].equals("m4")) {
      double moose = Double.parseDouble(inputs[1]);
      double wolf = Double.parseDouble(inputs[2]);
      double initalWolf = Double.parseDouble(inputs[3]);
      int years = Integer.parseInt(inputs[4]);
      System.out.println(Population.getStartingMoosePopulationWithWolves(moose, wolf,initalWolf,years));
    }
  }
}
