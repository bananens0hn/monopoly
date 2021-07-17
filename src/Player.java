public class Player {
	private int position;
	public String figure;
	public int playerNum;
	public String playerName;
	public int playerBalance;
	public static final int SCHIFF=0;
	public static final int HUT=1;
	public static final int FLUGZEUG=2;
	public static final int AUTO=3;
	
	public Player(int num, String fig, int balance, String name) {
		playerNum = num;
		playerBalance = balance;
		playerName = name;
		figure = fig;
	}
	
	//Money
	public int getPlayerBalance(){
		return playerBalance;
	}
	
	public void setPlayerBalance(int balance) {
		playerBalance = balance;
	}
	
	public void increasePlayerBalance(int add) {
		setPlayerBalance(getPlayerBalance() + add);
		System.out.println(playerName + ": " + getPlayerBalance()+ "Geld");
	}
	
	public void decreasePlayerBalance(int dec) {
		setPlayerBalance(getPlayerBalance() - dec);
		if (playerBalance < 0) {
			System.out.println(playerName + "Hat verloren");
		}
		System.out.println(playerName + ": " + getPlayerBalance()+ "Geld");
	}
	
	
	//Position
	public void setPosition(int num) {
		
		if(num>39) {			//board is only 40 tiles big
			position=num-40;
			playerBalance += 200;
		}else {
			position = num;
		}
		
	}
	
	public int getPosition() {
		return position;
	}
	
	public void goForward(int num) {
		setPosition(getPosition() + num);
	}
	
	public void goBack(int num) {
		setPosition(getPosition() - num);	
	}
	
	public String getName() {
		return playerName;
	}
	
	
	
}
