class SheepCounter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Boolean[] arrayOfSheeps = { true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, false, false, true, true };

        int sheepCount = countSheeps(arrayOfSheeps);
        System.out.println("Number of sheep present: " + sheepCount);
    }
}
