package trumpCard;

import java.util.ArrayList;
public class Card {
    private ArrayList<Category> categories;
    private ArrayList<Integer> scores;

    public Card(ArrayList<Category> categories, ArrayList<Integer> scores) {
        this.categories = categories;
        this.scores = scores;
    }

    public int trumps(Card other, Category category) {
        int index = categories.indexOf(category);
        if (index == -1) {
            throw new IllegalArgumentException("Category not found in the card.");
        }

        int scoreOne = scores.get(index);
        int scoreTwo = other.scores.get(index);

        if (category.isvalue()) {
            if (scoreOne > scoreTwo) {
                return 1;
            } else if (scoreOne < scoreTwo) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (scoreOne < scoreTwo) {
                return 1;
            } else if (scoreOne > scoreTwo) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}