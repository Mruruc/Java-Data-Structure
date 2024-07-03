package com.mruruc;

import java.util.*;

public class Test {
    static String[][] solution(String[][] dishes) {
        //     Ingredient   Dishes
        TreeMap<String, TreeSet<String>> ingredientMap = new TreeMap<>();

        for (int i = 0; i < dishes.length; i++) {
            String dish = dishes[i][0];

            for (int j = 1; j < dishes[i].length; j++) {
                String ingredient = dishes[i][j];
                ingredientMap.putIfAbsent(ingredient, new TreeSet<>());
                ingredientMap.get(ingredient).add(dish);
            }
        }

        // Filter out ingredients used in less than two dishes
        ingredientMap.entrySet().removeIf(entry -> entry.getValue().size() < 2);

        System.out.println(ingredientMap);

        // Prepare the result array
        String[][] result = new String[ingredientMap.size()][];
        int i = 0;
        for (Map.Entry<String, TreeSet<String>> entry : ingredientMap.entrySet()) {
            result[i] = new String[entry.getValue().size() + 1];
            result[i][0] = entry.getKey();
            int j = 1;
            for (String dish : entry.getValue()) {
                result[i][j] = dish;
                j++;
            }
            i++;
        }
        return result;
    }

    static void printResult(String[][] result) {
        for (String[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        String[][] dishes = {
                {"Salad", "Tomato", "Cucumber", "Salad", "Sauce"},
                {"Pizza", "Tomato", "Sausage", "Sauce", "Dough"},
                {"Quesadilla", "Chicken", "Cheese", "Sauce"},
                {"Sandwich", "Salad", "Bread", "Tomato", "Cheese"}
        };
        printResult(solution(dishes));
    }
}

