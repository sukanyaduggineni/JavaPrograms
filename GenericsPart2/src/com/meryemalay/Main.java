package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
	    BaseballPlayer pat = new BaseballPlayer("Pat");
	    SoccerPlayer backham = new SoccerPlayer("Backham");

	    Team adelaideCrows = new Team("Adelaide Crows");
	    adelaideCrows.addPlayer(joe);
	    adelaideCrows.addPlayer(pat);
	    adelaideCrows.addPlayer(backham);
        System.out.println(adelaideCrows.numPlayers());
    }
}
