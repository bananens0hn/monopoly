package chess;

public class Team {
public static Team black=new Team("black");
public static Team white=new Team("white");
private String name;
public Team(String name) {
	this.name=name;
}
public static Team getTeam(String name) throws IllegalArgumentException{
	switch (name) {
	case "white":
		return new Team("white");
		
	case "black":
		return new Team("black");
	default:
		throw new IllegalArgumentException();
		
	}
}
public String getName() {
	return name;
}
}
