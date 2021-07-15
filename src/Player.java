public class Player {
	private int position;
	public int figure;
	public int playerNum;
	public String playerName;
	public int playerBalance;
	public static final int SCHIFF=0;
	public static final int HUT=1;
	public static final int FLUGZEUG=2;
	public static final int AUTO=3;
	public Player(int num, int fig, int balance) {
		figure = fig;
		playerNum = num;
		playerBalance = balance;
		
		switch(figure) {
		case SCHIFF: playerName="Schiff";
		break;
		case HUT: playerName="Hut";
		break;
		case FLUGZEUG: playerName = "Flugzeug";
		break;
		case AUTO: playerName = "Auto";
		break;
		}
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
