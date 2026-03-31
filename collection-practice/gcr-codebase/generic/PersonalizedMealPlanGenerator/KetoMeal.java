package PersonalizedMealPlanGenerator;

class KetoMeal implements MealPlan {

	public String getMealType() {
		return "Keto";
	}

	public int getCalories() {
		return 2000;
	}

	public boolean isValid() {
		return true; // low carb
	}
}
