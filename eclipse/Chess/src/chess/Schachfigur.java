package chess;

import chess.Team;

public class Schachfigur {
	int xpos;
	int ypos;
	Team team;
	public Schachfigur(int posX, int posY, Team team) {
		xpos=posX;
		ypos=posY;
		this.team=team;
	}
public String[]GetAvailableMoves(String type){
	switch (type) {
	case "pawn":
		
		break;
	case "knight":
		break;
	case "bishop":
	break;
	case "rook":
		break;
	case "queen":
		break;
	case "king":
		break;
	default:
		break;
	}
	return null;
}
}
