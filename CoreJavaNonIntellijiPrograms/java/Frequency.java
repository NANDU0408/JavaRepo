 class Frequency {
    public static void main(String[] args) {
        int[] a = {2, 3, 2, 6, 3, 5};
        int input = 6; 

        int frequency = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == input) {
                frequency++;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Output: " + frequency);
    }
}