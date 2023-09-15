import java.util.*;

class Smoothie {

    public static void main(String[] args) {
        System.out.println(Smoothie.ingredients("Classic,-banana"));
        System.out.println(Smoothie.ingredients("Classic,ABCD"));
        System.out.println(Smoothie.ingredients("Freezie,-banana"));

    }

    private static final HashMap<String, String> defaultSmoothies = new HashMap<>();

    static {
        defaultSmoothies.put("Classic", "strawberry,banana,pineapple,mango,peach,honey");
        defaultSmoothies.put("Freezie", "blackberry, blueberry, black currant, grape juice, frozen yogurt");
        defaultSmoothies.put("Greenie", "green apple, lime, avocado, spinach, ice, apple juice");
        defaultSmoothies.put("Just Desserts", "banana, ice cream, chocolate, peanut, cherry");

    }

    public static String ingredients(String order) throws IllegalArgumentException {
        StringBuilder strbdr = new StringBuilder();
        if (order.contains("-")) {
            ingredientListSorter(order, strbdr);
        } else {
            String key = (order.split(","))[0];
            if (!defaultSmoothies.containsKey(key)) {
                throw new IllegalArgumentException("Item Not Present");
            }
            if (defaultSmoothies.get(key) == null) {
                throw new IllegalArgumentException("Item Not Present");
            }

            String value = defaultSmoothies.get(key);
            String[] ingredeients = value.split(",");
            Arrays.sort(ingredeients);
            for (int i = 0; i < ingredeients.length; i++) {
                strbdr.append(ingredeients[i]);
                if (i != ingredeients.length - 1) {
                    strbdr.append(",");
                }
            }
        }
        return strbdr.toString();
    }

    private static void ingredientListSorter(String order, StringBuilder strbdr) throws IllegalArgumentException {
        String[] orderArray = order.split(",-");
        List<String> orderList = Arrays.asList(orderArray);
        String key = orderArray[0];
        if (!defaultSmoothies.containsKey(key)) {
            throw new IllegalArgumentException("Item Not Present");
        }
        if (defaultSmoothies.get(key) == null) {
            throw new IllegalArgumentException("Item Not Present");
        }
        String value = defaultSmoothies.get(key);
        String[] ingredients = value.split(",");
        Arrays.sort(ingredients);
        for (int i = 0; i < ingredients.length; i++) {
            if (!orderList.contains(ingredients[i])) {
                strbdr.append(ingredients[i]);
                if (i != ingredients.length - 1) {
                    strbdr.append(",");
                }
            }
        }
    }
}
