public class Person {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        String movieName = "Leo"; // Change this to the desired movie name
        int quantity = 2; // Change this to the desired quantity

        int result = bookMyShow.bookTicket(movieName, quantity);
        if (result < 0) {
            System.out.println("Booking Failed");
        }
    }
}