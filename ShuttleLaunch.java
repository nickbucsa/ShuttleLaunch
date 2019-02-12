class ShuttleLaunch {
	
	// 1000 milliseconds = 1 second
	final static int SLEEP_TIME_MILLISECONDS = 1000;
	
	public static void main(String[] args) {
		String x = "Hello!\nWelcome to the Shuttle Launch!\n";
		for (int i = 0; i < x.length(); i++) {
			try {
				System.out.print(x.charAt(i));
				Thread.sleep(SLEEP_TIME_MILLISECONDS/10);
			}
			catch (InterruptedException e) {
				System.out.println("Interrupted Exception! ");
			}
		}
		for (int i = 10; i >= 0; i--) {
			try {
				System.out.println("T - " + i);
				if (i == 2)
					System.out.println("Ignition...");
				if (i == 0)
					System.out.println("We have a liftoff! ");
				Thread.sleep(SLEEP_TIME_MILLISECONDS);
			}
			catch (InterruptedException e) {
				System.out.println("Interrupted Exception! ");
			}
		}
	}
}