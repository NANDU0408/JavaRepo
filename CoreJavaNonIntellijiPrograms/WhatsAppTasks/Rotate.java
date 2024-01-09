 class Rotate {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int positionsToRotate = 2;

        int[] rotatedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            int newPosition = (i + positionsToRotate) % originalArray.length;
            rotatedArray[newPosition] = originalArray[i];
        }

        System.out.println("Original array:");
        for (int i = 0; i < originalArray.length; i++) {
		System.out.print(originalArray[i] + " ");
		}

		System.out.println("\nArray after rotating to the right by " + positionsToRotate + " positions:");
		for (int i = 0; i < rotatedArray.length; i++) {
		System.out.print(rotatedArray[i] + " ");
		}
    }
}