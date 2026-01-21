package PersonalizedMealPlanGenerator;

class VegetarianMeal implements MealPlan {

	public String getMealType() {
		return "Vegetarian";
	}

	public int getCalories() {
		return 1800;
	}

	public boolean isValid() {
		return true; // no meat
	}
}
