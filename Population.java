public class Population {
    public static void main(String[] args) {
        System.out.println(getInitialStartTimeForMoose1(1000));
        System.out.println(getInitialStartTimeForMoose2(1000, 12));
        System.out.println(getMoosePopulationWithWolves(180,10, 50));
        System.out.println(getStartingMoosePopulationWithWolves(500,25,5, 50));
    }
    public static int getInitialStartTimeForMoose1(double currentMoosePop) {

        double mooseBirthRate = 1.0/2.0;
        double mooseDeathRate = 1.0/6.0;
        
        double newMoose = currentMoosePop * mooseBirthRate;
        double deadMoose = currentMoosePop* mooseDeathRate;
        
        currentMoosePop -= newMoose;
        currentMoosePop += deadMoose;
        
        if((int)currentMoosePop > 1) return 1 + getInitialStartTimeForMoose1((int)currentMoosePop);
        return 0;
    }
    public static int getInitialStartTimeForMoose2(double currentMoosePop, double startingMoosePopulation) {
        double mooseBirthRate = 1.0/2.0;
        double mooseDeathRate = 1.0/6.0;
        
        double newMoose = currentMoosePop * mooseBirthRate;
        double deadMoose = currentMoosePop* mooseDeathRate;
        
        currentMoosePop -= newMoose;
        currentMoosePop += deadMoose;
        
        if((int)currentMoosePop >= startingMoosePopulation) return 1 + getInitialStartTimeForMoose2((int)currentMoosePop, startingMoosePopulation);
        return 0;
    }
    public static double getMoosePopulationWithWolves(double currentMoosePop, double currentWolfPopulation, int years) {

        double wolfBirthRate = 1.0/4.0;
        double wolfDeathRate = 1.0/10.0;

        double mooseBirthRate = 1.0/2.0;
        double mooseDeathRate = 1.0/6.0;
        return 0;

    }
    public static double getStartingMoosePopulationWithWolves(double currentMoosePop, double currentWolfPopulation, double initialWolfPopulation, int yearsLeft) {
        double wolfBirthRate = 1.0/4.0;
        double wolfDeathRate = 1.0/10.0;

        double mooseBirthRate = 1.0/2.0;
        double mooseDeathRate = 1.0/6.0;

        return 0;

    }
}
