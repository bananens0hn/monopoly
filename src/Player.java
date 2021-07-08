public class Player {
	private int position;
	public String figure;
	public int playerNum;
	public String playerName;
	public int playerBalance;
	
	public Player(int num, String name, String fig, int balance) {
		figure = fig;
		playerNum = num;
		playerName = name;
		playerBalance = balance;
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
	}
	
	public void decreasePlayerBalance(int dec) {
		setPlayerBalance(getPlayerBalance() - dec);
	}
	
	
	//Position
	public void setPosition(int num) {
		
		if(num>39) {
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
}
