package lab1;

import support.cse131.ArgsProcessor;

public class Nutrition {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        String name = ap.nextString("Name of food");
        double carbs = ap.nextDouble("The number of carbohydrates");
        double calOne = carbs * 4.0;
        double fat = ap.nextDouble("The number of grams of fat in this food");
        double calTwo = (fat * 9.0) * 10.0;
        double calTwoRound = Math.round(calTwo)/10.0;
        double protein = ap.nextDouble("The number of grams of protein in this food");
        double calThree = protein * 4.0;
        double statedCals = ap.nextDouble("The number of calories stated on this food's label");
        double calActual = (calOne+calTwoRound+calThree);
        double calLeft = (calActual-statedCals)*10.0;
        double calLeftPoint = Math.round(calLeft)/10.0;
        double fiber = calLeftPoint/4.0;
        double carbPerc = (calOne/statedCals)*1000;
        double carbPercRound = Math.round(carbPerc)/10.0;
        double fatPerc = (calTwoRound/statedCals)*1000;
        double fatPercRound = Math.round(fatPerc)/10.0;
        double proPerc = (calThree/statedCals)*1000;
        double proPercRound = Math.round(proPerc)/10.0;
        boolean lowCarbDiet = (carbPercRound<25);
        boolean lowFatDiet = (fatPercRound<15);
        boolean coinHeads = Math.random()>.5;

        System.out.println("Snickers has ");
        System.out.println(carbs + " grams of carbohydrates " + "= " + calOne + " Calories");
        System.out.println(fat + " grams of fat " + "= " + calTwoRound + " Calories");
        System.out.println(protein + " grams of protein " + "= " + calThree + " Calories");

        System.out.println("This food is said to have " + statedCals + " (available) calories ");
        System.out.println("With " + calLeftPoint + " unavailable calories, this food has " + fiber + " grams of fiber");

        System.out.println("Approximately");
        System.out.println(carbPercRound + "%" + " of your food is carbohydrates");
        System.out.println(fatPercRound + "%" + " of your food is fat");
        System.out.println(proPercRound + "%" + " of your food is protein");

        System.out.println("This food is acceptable for a low-carb diet? " + lowCarbDiet);
        System.out.println("This food is acceptable for a low-fat diet? " + lowFatDiet);
        System.out.println("By coin flip, you should eat this food? " + coinHeads);




    }
}
