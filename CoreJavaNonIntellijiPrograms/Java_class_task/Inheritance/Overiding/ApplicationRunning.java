class ApplicationRunning{
	public static void main(String... nnn){
		System.out.println("Starting main in ApplicationRunning");
		String[] supportedBrowsers=new String[3];
		supportedBrowsers[0]="chrome";
		supportedBrowsers[1]="Edge";
		supportedBrowsers[2]="Firefox";
		
		
		WebApplication webapplication=new WebApplication("FaceBook",ApplicationType.ECOMMERCE);
		webapplication.displayInfo(supportedBrowsers);
		webapplication.freeSelect(true);
		
		String[] downloads=new String[3];
		downloads[0]="Songs";
		downloads[1]="Movie";
		downloads[2]="document";
		
		String[] browsingHostory=new String[2];
		browsingHostory[0]="YouTube";
		browsingHostory[1]="W3School";
		
		ChromeBrowser chromebrowser=new ChromeBrowser("Instagram",ApplicationType.ENTERTAINMENT);
		chromebrowser.setDownloads(downloads);
		chromebrowser.setBrowserHistory(browsingHostory);

		EdgeBrowser edgebrowser=new EdgeBrowser("Hyke",ApplicationType.ENTERTAINMENT);
	
		FireFoxBrowser firefoxbrowser=new FireFoxBrowser("Flipcart",ApplicationType.ECOMMERCE);
		
		String[] favourites=new String[2];
		favourites[0]="AMAZON";
		favourites[1]="MYNTRA";
		
		MediaPlayer mediaplayer=new MediaPlayer("AMAZON PRIME",ApplicationType.ENTERTAINMENT);
		mediaplayer.setFavourites(favourites);
		mediaplayer.displayInfo1(94,"64 and 32 bit",OS.MAC);
		mediaplayer.displayInfo(4,5.6,"VLC","12-07-2023");
		System.out.println("Ending main in ApplicationRunning");
	}
}