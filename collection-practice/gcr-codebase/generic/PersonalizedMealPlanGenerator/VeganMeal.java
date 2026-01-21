package PersonalizedMealPlanGenerator;

class VeganMeal implements MealPlan {

	public String getMealType() {
		return "Vegan";
	}

	public int getCalories() {
		return 1600;
	}

	public boolean isValid() {
		return true; // no animal products
	}
}
