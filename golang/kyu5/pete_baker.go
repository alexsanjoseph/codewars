package kata

import "math"

func Cakes(recipe, available map[string]int) int {
	maxCakes := math.MaxInt32
	for ingredient, ingAmount := range recipe {
		recipeAmount := available[ingredient]
		maxCakesForIngredient := recipeAmount / ingAmount
		if maxCakesForIngredient < maxCakes {
			maxCakes = maxCakesForIngredient
		}
	}
	return maxCakes
}
