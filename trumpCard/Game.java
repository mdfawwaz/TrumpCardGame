package trumpCard;

import java.util.ArrayList;
public class Game {
    public static void main(String[] args) {

        Category matches = new Category("Matches", true);
        Category notOuts = new Category("Not Outs", true);
        Category runs = new Category("Runs", true);
        Category highScore = new Category("High Score", true);
        Category average = new Category("Average", true);
        Category hundreds = new Category("Hundreds", true);
        Category fifties = new Category("Fifties", true);
        Category accRanking = new Category("ACC Ranking", false);


        ArrayList<Category> sachinCategory = new ArrayList<>();
        ArrayList<Integer> sachinScores = new ArrayList<>();
        
        sachinCategory.add(matches);
        sachinCategory.add(notOuts);
        sachinCategory.add(runs);
        sachinCategory.add(highScore);
        sachinCategory.add(average);
        sachinCategory.add(hundreds);
        sachinCategory.add(fifties);
        sachinCategory.add(accRanking);
        sachinScores.add(463);
        sachinScores.add(41);
        sachinScores.add(18426);
        sachinScores.add(200);
        sachinScores.add(44);
        sachinScores.add(49);
        sachinScores.add(96);
        sachinScores.add(4);
        Card sachinCard = new Card(sachinCategory, sachinScores);


        ArrayList<Category> ameliaCategory = new ArrayList<>();
        ArrayList<Integer> ameliaScores = new ArrayList<>();
        ameliaCategory.add(matches);
        ameliaCategory.add(notOuts);
        ameliaCategory.add(runs);
        ameliaCategory.add(highScore);
        ameliaCategory.add(average);
        ameliaCategory.add(hundreds);
        ameliaCategory.add(fifties);
        ameliaCategory.add(accRanking);
        ameliaScores.add(62);
        ameliaScores.add(13);
        ameliaScores.add(1529);
        ameliaScores.add(232);
        ameliaScores.add(40);
        ameliaScores.add(3);
        ameliaScores.add(6);
        ameliaScores.add(18);
        Card ameliaCard = new Card(ameliaCategory, ameliaScores);


        for (Category category : sachinCategory)
        
        {
            int result = sachinCard.trumps(ameliaCard, category);
            System.out.println("Category: " + category.getName());
            
            if (result == 1) {
            	
                System.out.println("Sachin wins!");
            } else if (result == -1) {
            	
                System.out.println("Amelia wins!");
            } else {
            	
                System.out.println("It's a draw!");
            }
            System.out.println();
        }
    }
}
