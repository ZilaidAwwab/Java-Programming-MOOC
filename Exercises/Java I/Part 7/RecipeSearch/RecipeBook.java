import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void printByName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getTime() <= Integer.valueOf(time)) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printByIngredient(String ingredient) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getIngredients().contains(ingredient.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }

    public void printRecipeBook() {
        for (Recipe e : this.recipes) {
            System.out.println(e);
        }
    }
}
