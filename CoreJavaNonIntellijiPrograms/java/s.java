  public int provideTotal(String movieName, int quantity) {
		ArrayList<String, Integer> movieDetails = new ArrayList<>();
        movieDetails.add("Leo", 250);
        movieDetails.add("Ghost", 120);
        movieDetails.add("Kantara", 300);
        movieDetails.add("SSE", 100);

        Integer price = movieDetails.addAll(movieName);

        if (price == null) {
            System.out.println("Movie not found");
            return -1; // Movie not found
        }

        return price * quantity;
    }
}