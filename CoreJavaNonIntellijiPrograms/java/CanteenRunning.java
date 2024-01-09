public class CanteenRunning {
    public static void main(String[] args) {
        System.out.println("Starting main");
        Utensils[] utensils = new Utensils[40];
        String[] u = {"Plates", "Bowls", "Spoons", "Forks", "Knives", "Drinking glasses", "Coffee mugs",
            "Serving trays", "Soup ladles", "Tumblers", "Cutting boards", "Steak knives",
            "Salad forks", "Dessert spoons", "Steak knives", "Butter knives", "Soup bowls",
            "Salt and pepper shakers", "Teaspoons", "Serving spoons", "Meat cleavers", "Ladle spoons",
            "Gravy boats", "Serving platters", "Salad tongs", "Wine glasses", "Coffee spoons",
            "Soup pots", "Kitchen shears", "Ice cream scoops", "Sushi chopsticks", "Pizza cutters",
            "Can openers", "Colanders", "Whisks", "Ladles", "Steak platters", "Soup tureens",
            "Sauté pans", "Bread knives"
        };
        
        int[] n = {87, 56, 23, 45, 12, 98, 72, 34, 67, 41, 89, 60, 29, 51, 76, 88, 64, 7, 53, 90, 38, 16, 62, 83, 48, 21, 35, 71, 50, 42, 79, 10, 55, 6, 30, 96, 18, 69, 80, 27};

        for (int i = 0; i < u.length; i++) {
            utensils[i] = new Utensils(u[i], n[i], "YES");
        }

        Canteen canteen = new Canteen("VEG", utensils);
        canteen.displayInfo();

        System.out.println("Items in the utensils array:");
        for (Utensils utensil : utensils) {
            System.out.println(utensil);
        }

        System.out.println("Ending main");
    }
}
