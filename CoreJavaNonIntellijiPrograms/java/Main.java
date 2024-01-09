public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        String movieName = "movieName"; 
        int quantity = 2; 

        int result = bookMyShow.bookTicket(movieName, quantity);
        /*if (result<0) {
            System.out.println("Booking Failed");
        }
		else{
			System.out.println("Booking Successful");
		}*/
		system.out.println("result:"+result);
    }
}