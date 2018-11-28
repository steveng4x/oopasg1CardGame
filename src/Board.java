import java.util.ArrayList;
import java.util.Random;

public class Board extends Turn{
	
	private static boolean win;
	private int turn;
	private String playername;
	private static ArrayList<Integer>appendList = new ArrayList<Integer>();
	
	//Constructor
	public Board() {
		this.playername = "Ash";
		this.turn = 0;
	}
	
	public Board(String playername) {
		this.playername = playername;
		this.turn = 0;
	}
	
	//Setters//Getters
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}
		
	public void increaseTurn() {
		turn++;
	}
	
	public static void setWin(boolean win) {
		Board.win = win;
	}
	
	public static boolean getWin() {
		return win;
	}
	
	//otherMethod
	public static void checkWin(ArrayList<Pokemon> oppPoke) {
		if (oppPoke.size() <= 3) {
			Board.win = true;
		}else {
			Board.win = false;
		}
	}
	
	//mainMethod
	public static void startGame(String player1name,String player2name, ArrayList<Pokemon> player1, ArrayList<Pokemon> player2) {
		
		ArrayList<Pokemon>stage1 = new ArrayList<Pokemon>();
		
		Pokemon pokemon011 = new Pokemon("Charmander"	,50	, 1, 24 , 0, "red"	 	 , "Attacking", "Flamethrower"		 , "Active", 3 );
		Pokemon pokemon012 = new Pokemon("Charmeleon"	,50 , 1, 48 , 0, "red"	 	 , "Attacking", "Fire Wheel"		 , "Active", 6 );
		Pokemon pokemon013 = new Pokemon("Charizard"	,50 , 1, 96 , 0, "red"	 	 , "Attacking", "Fire Blast"		 , "Active", 12);
		Pokemon pokemon021 = new Pokemon("Torchic"		,74	, 1, 35 , 0, "red"	 	 , "Attacking", "Ember"				 , "Active", 2 );
		Pokemon pokemon022 = new Pokemon("Combusken"	,74 , 1, 70 , 0, "red"	 	 , "Attacking", "Flame Charge"		 , "Active", 4 );
		Pokemon pokemon023 = new Pokemon("Blaziken"		,74 , 1, 140, 0, "red"	 	 , "Attacking", "Blaze Kick"		 , "Active", 8 );
		Pokemon pokemon031 = new Pokemon("Kyogre"		,50	, 1, 40 , 0, "blue"	 	 , "Attacking", "Judgement Storm"	 , "Active", 4 );
		Pokemon pokemon032 = new Pokemon("Primal Kyogre",50 , 1, 80 , 0, "blue"	 	 , "Attacking", "Wind Walker Remorse", "Active", 8 );
		Pokemon pokemon041 = new Pokemon("Pichu"		,56	, 1, 37 , 0, "yellow"	 , "Attacking", "Sparks"			 , "Active", 4 );
		Pokemon pokemon042 = new Pokemon("Pikachu"		,56 , 1, 74 , 0, "yellow"	 , "Attacking", "Lighthing Ball"	 , "Active", 8 );
		Pokemon pokemon043 = new Pokemon("Raichu"		,56 , 1, 148, 0, "yellow"	 , "Attacking", "Ray Bolt"			 , "Active", 16);
		
		Pokemon pokemon051 = new Pokemon("Squirtle"		,50	, 1, 21 , 0, "blue"	 	 , "Defending", "Defense Curl"		 , "Active", 3 );
		Pokemon pokemon052 = new Pokemon("Wartortle"	,50 , 1, 42 , 0, "blue"	 	 , "Defending", "Iron Defense"		 , "Active", 6 );
		Pokemon pokemon053 = new Pokemon("Blastoise"	,50 , 1, 42 , 0, "blue"	 	 , "Defending", "Block"				 , "Active", 12);
		Pokemon pokemon061 = new Pokemon("Shieldon"		,70	, 1, 46 , 0, "yellow"	 , "Defending", "Iron head"			 , "Active", 2 );
		Pokemon pokemon062 = new Pokemon("Bastiodon"	,70 , 1, 92 , 0, "yellow"	 , "Defending", "Iron Body"			 , "Active", 4 );
		Pokemon pokemon071 = new Pokemon("Eleckid"		,70	, 1, 20 , 0, "yellow"	 , "Defending", "Electric Barrier"	 , "Active", 3 );
		Pokemon pokemon072 = new Pokemon("Electabuzz"	,70 , 1, 40 , 0, "yellow"	 , "Defending", "Static Barier"		 , "Active", 6 );
		Pokemon pokemon073 = new Pokemon("Electivire"	,70 , 1, 80 , 0, "yellow"	 , "Defending", "Raijin Barrier"	 , "Active", 12);
		Pokemon pokemon081 = new Pokemon("Slowpoke"		,65	, 1, 38 , 0, "blue"	 	 , "Defending", "Nap"				 , "Active", 2 );
		Pokemon pokemon082 = new Pokemon("Slowbro"		,65 , 1, 76 , 0, "blue"	 	 , "Defending", "Sleep"				 , "Active", 4 );
		Pokemon pokemon083 = new Pokemon("Slowking"		,65 , 1, 152, 0, "blue"		 , "Defending", "Hibernate"			 , "Active", 8 );
		
		Pokemon pokemon091 = new Pokemon("Igglybuff"	,50	, 1, 42 , 0, "colourless", "Fairy"	  , "Lullaby"			 , "Active");
		Pokemon pokemon092 = new Pokemon("Jigglypuff"	,50 , 1, 84 , 0, "colourless", "Fairy"	  , "Confusion Sense"	 , "Active");
		Pokemon pokemon093 = new Pokemon("Wigglypuff"	,50 , 1, 168, 0, "colourless", "Fairy"	  , "Mind Blast"		 , "Active");
		Pokemon pokemon101 = new Pokemon("Ralts"		,50	, 1, 40 , 0, "colourless", "Fairy"	  , "Telepathy"			 , "Active");
		Pokemon pokemon102 = new Pokemon("Kirlia"		,50 , 1, 80 , 0, "colourless", "Fairy"	  , "Confusion"			 , "Active");
		Pokemon pokemon103 = new Pokemon("Gardevoir"	,50 , 1, 160, 0, "colourless", "Fairy"	  , "Entice"			 , "Active");	
		Pokemon pokemon111 = new Pokemon("Kricketot"	,54	, 1, 42 , 0, "red"		 , "Fairy"	  , "Sing"				 , "Active");
		Pokemon pokemon112 = new Pokemon("Kricketune"	,54 , 1, 84 , 0, "red"		 , "Fairy"	  , "Musical Performance", "Active");
		Pokemon pokemon121 = new Pokemon("Vulpix"		,55	, 1, 40 , 0, "red"		 , "Fairy"	  , "Fire Spin"			 , "Active");
		Pokemon pokemon122 = new Pokemon("Ninetales"	,55 , 1, 80 , 0, "red"		 , "Fairy"	  , "Fire Trap"			 , "Active");
		
		stage1.add(pokemon011);		stage1.add(pokemon012);		stage1.add(pokemon013);
		stage1.add(pokemon021);		stage1.add(pokemon022);		stage1.add(pokemon023);
		stage1.add(pokemon031);		stage1.add(pokemon032);
		stage1.add(pokemon041);		stage1.add(pokemon042);		stage1.add(pokemon043);
		stage1.add(pokemon051);		stage1.add(pokemon052);		stage1.add(pokemon053);
		stage1.add(pokemon061);		stage1.add(pokemon062);
		stage1.add(pokemon071);		stage1.add(pokemon072);		stage1.add(pokemon073);
		stage1.add(pokemon081);		stage1.add(pokemon082);		stage1.add(pokemon083);
		stage1.add(pokemon091);		stage1.add(pokemon092);		stage1.add(pokemon093);
		stage1.add(pokemon101);		stage1.add(pokemon102);		stage1.add(pokemon103);
		stage1.add(pokemon111);		stage1.add(pokemon112);	
		stage1.add(pokemon121);		stage1.add(pokemon122);	
	
		System.out.println("Each Player Draw 6 Pokemon...");
		System.out.println(player1name + " Draw:-");
		startDraw(player1, stage1);
		System.out.println(player2name + " Draw:-");
		startDraw(player2, stage1);
		
		Board.win = false;
	}
	
	public static void startDraw(ArrayList<Pokemon> player, ArrayList<Pokemon> poke) {
		Random rand = new Random();
		boolean startCond = false;

		while(startCond == false) {
			for (int i = 1; i <= 6;){
				int n = rand.nextInt(32);
				if (!appendList.contains(n) ) {
					player.add(poke.get(n));
					appendList.add(n);
					i++;
				}
			}startCond = checkStart(player);
		}
		for (Pokemon a : player) {
			System.out.printf("[Name: %s, Element: %s, Type: %s, Moves: %s]\n",
					a.getName(), a.getElement(), a.getType(), a.getMoves());
		}
	}
	
	public static boolean checkStart(ArrayList<Pokemon> pokeList) {
		int atkCount = 0;
		int defCount = 0;
		for (Pokemon a : pokeList) {
			if (a.getType().equals("Attacking")) {
				atkCount++;
			}else if (a.getType().equals("Defending")) {
				defCount++;
			}
		}
		if (atkCount >= 2 && defCount >= 1) {
			return true;
		}else {
			pokeList.clear();
			return false;
		}
	}
	}
	

	

