package PersonalizedMealPlanGenerator;

public class MealPlanApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Personalized Meal Plan Generator");
		System.out.println("-----------------------------------------------");
		Meal<VegetarianMeal> vegMeal = MealGenerator.generateMealPlan("Aarav", new VegetarianMeal());

		Meal<VeganMeal> veganMeal = MealGenerator.generateMealPlan("Diya", new VeganMeal());

		Meal<KetoMeal> ketoMeal = MealGenerator.generateMealPlan("Rahul", new KetoMeal());

		Meal<HighProteinMeal> proteinMeal = MealGenerator.generateMealPlan("Neha", new HighProteinMeal());

		System.out.println("\n Personalized Meal Plans:");
		System.out.println(vegMeal.getDetails());
		System.out.println(veganMeal.getDetails());
		System.out.println(ketoMeal.getDetails());
		System.out.println(proteinMeal.getDetails());
	}
}
