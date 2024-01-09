public class LikeSystem {
    public static String whoLikesIt(String[] names) {
        int count = names.length;
        
        if (count == 0) {
            return "no one likes this";
        } else if (count == 1) {
            return names[0] + " likes this";
        } else if (count == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (count == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            int others = count - 2;
            return names[0] + ", " + names[1] + " and " + others + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt(new String[]{})); 
        System.out.println(whoLikesIt(new String[]{"Peter"})); 
        System.out.println(whoLikesIt(new String[]{"Jacob", "Alex"})); 
        System.out.println(whoLikesIt(new String[]{"Max", "John", "Mark"})); 
        System.out.println(whoLikesIt(new String[]{"Alex", "Jacob", "Mark", "Max"}));
    }
}
