package PersonalizedMealPlanGenerator;

class MealGenerator {

	public static <T extends MealPlan> Meal<T> generateMealPlan(String userName, T mealPlan) {

		if (!mealPlan.isValid()) {
			throw new IllegalArgumentException("Invalid meal plan selected");
		}

		System.out.println("Meal plan validated for: " + mealPlan.getMealType());
		return new Meal<>(userName, mealPlan);
	}
}
