package com.java.acct;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	int xyz = 2;
	public static void main(String[] args) {
		ForEachExample obj = new ForEachExample();
		List<String> gameList = new ArrayList<String>();
		gameList.add("Cricket");
		gameList.add("Football");
		
		List<Integer> playerNumber = new ArrayList<Integer>();
		playerNumber.add(28);
		playerNumber.add(16);
		
		gameList.forEach(game->System.out.println("I play "+game));
		playerNumber.forEach(player->System.out.println(player/obj.xyz));
		//ForEach method will not modify the original collection
		System.out.println(playerNumber);

	}

}
