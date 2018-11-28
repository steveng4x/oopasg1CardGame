import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board extends Turn{
	private long turn;
	private String player1name;
	private String player2name;
	
	//otherMethod
	public void startDraw(ArrayList<Pokemon> player, ArrayList<Pokemon> poke) {
		Random rand = new Random();

		for (int i = 1; i < 6; i++){
			int n = rand.nextInt(12);
		}
	}
	public long getTurn() {
		return turn;
	}

	public void setTurn(long turn) {
		this.turn = turn;
	}

	public String getPlayer1name() {
		return player1name;
	}

	public void setPlayer1name(String player1name) {
		this.player1name = player1name;
	}

	public String getPlayer2name() {
		return player2name;
	}

	public void setPlayer2name(String player2name) {
		this.player2name = player2name;
	}
		
	public void countTurn() {
		turn++;
	}
	
	//pokeData
	public static void startGame(ArrayList<Pokemon> player1, ArrayList<Pokemon> player2) {
		
		ArrayList<Pokemon>stage1 = new ArrayList<Pokemon>();
		ArrayList<Pokemon>stage2 = new ArrayList<Pokemon>();
		ArrayList<Pokemon>stage3 = new ArrayList<Pokemon>();
		
		Pokemon pokemon011 = new Pokemon("Charmander"	,50	, 1, 24 , 0, "red"	 	 , "Attacking", "Flamethrower"		 , "Active", 3 );
		Pokemon pokemon012 = new Pokemon("Charmeleon"	,100, 2, 48 , 0, "red"	 	 , "Attacking", "Fire Wheel"		 , "Active", 6 );
		Pokemon pokemon013 = new Pokemon("Charizard"	,200, 3, 96 , 0, "red"	 	 , "Attacking", "Fire Blast"		 , "Active", 12);
		Pokemon pokemon021 = new Pokemon("Torchic"		,74	, 1, 35 , 0, "red"	 	 , "Attacking", "Ember"				 , "Active", 2 );
		Pokemon pokemon022 = new Pokemon("Combusken"	,148, 2, 70 , 0, "red"	 	 , "Attacking", "Flame Charge"		 , "Active", 4 );
		Pokemon pokemon023 = new Pokemon("Blaziken"		,296, 3, 140, 0, "red"	 	 , "Attacking", "Blaze Kick"		 , "Active", 8 );
		Pokemon pokemon031 = new Pokemon("Kyogre"		,50	, 1, 40 , 0, "blue"	 	 , "Attacking", "Judgement Storm"	 , "Active", 4 );
		Pokemon pokemon032 = new Pokemon("Primal Kyogre",100, 2, 80 , 0, "blue"	 	 , "Attacking", "Wind Walker Remorse", "Active", 8 );
		Pokemon pokemon041 = new Pokemon("Pichu"		,56	, 1, 37 , 0, "yellow"	 , "Attacking", "Sparks"			 , "Active", 4 );
		Pokemon pokemon042 = new Pokemon("Pikachu"		,112, 2, 74 , 0, "yellow"	 , "Attacking", "Lighthing Ball"	 , "Active", 8 );
		Pokemon pokemon043 = new Pokemon("Raichu"		,224, 3, 148, 0, "yellow"	 , "Attacking", "Ray Bolt"			 , "Active", 16);
		
		Pokemon pokemon051 = new Pokemon("Squirtle"		,30	, 1, 21 , 0, "blue"	 	 , "Defending", "Defense Curl"		 , "Active", 3 );
		Pokemon pokemon052 = new Pokemon("Wartortle"	,120, 2, 42 , 0, "blue"	 	 , "Defending", "Iron Defense"		 , "Active", 6 );
		Pokemon pokemon053 = new Pokemon("Blastoise"	,240, 3, 42 , 0, "blue"	 	 , "Defending", "Block"				 , "Active", 12);
		Pokemon pokemon061 = new Pokemon("Shieldon"		,70	, 1, 46 , 0, "yellow"	 , "Defending", "Iron head"			 , "Active", 2 );
		Pokemon pokemon062 = new Pokemon("Bastiodon"	,140, 2, 92 , 0, "yellow"	 , "Defending", "Iron Body"			 , "Active", 4 );
		Pokemon pokemon071 = new Pokemon("Eleckid"		,70	, 1, 20 , 0, "yellow"	 , "Defending", "Electric Barrier"	 , "Active", 3 );
		Pokemon pokemon072 = new Pokemon("Electabuzz"	,140, 2, 40 , 0, "yellow"	 , "Defending", "Static Barier"		 , "Active", 6 );
		Pokemon pokemon073 = new Pokemon("Electivire"	,280, 3, 80 , 0, "yellow"	 , "Defending", "Raijin Barrier"	 , "Active", 12);
		Pokemon pokemon081 = new Pokemon("Slowpoke"		,65	, 1, 38 , 0, "blue"	 	 , "Defending", "Nap"				 , "Active", 2 );
		Pokemon pokemon082 = new Pokemon("Slowbro"		,130, 2, 76 , 0, "blue"	 	 , "Defending", "Sleep"				 , "Active", 4 );
		Pokemon pokemon083 = new Pokemon("Slowking"		,260, 3, 152, 0, "blue"		 , "Defending", "Hibernate"			 , "Active", 8 );
		
		Pokemon pokemon091 = new Pokemon("Igglybuff"	,50	, 1, 42 , 0, "colourless", "Fairy"	  , "Lullaby"			 , "Active");
		Pokemon pokemon092 = new Pokemon("Jigglypuff"	,100, 2, 84 , 0, "colourless", "Fairy"	  , "Confusion Sense"	 , "Active");
		Pokemon pokemon093 = new Pokemon("Wigglypuff"	,150, 3, 168, 0, "colourless", "Fairy"	  , "Mind Blast"		 , "Active");
		Pokemon pokemon101 = new Pokemon("Ralts"		,50	, 1, 40 , 0, "colourless", "Fairy"	  , "Telepathy"			 , "Active");
		Pokemon pokemon102 = new Pokemon("Kirlia"		,100, 2, 80 , 0, "colourless", "Fairy"	  , "Confusion"			 , "Active");
		Pokemon pokemon103 = new Pokemon("Gardevoir"	,200, 3, 160, 0, "colourless", "Fairy"	  , "Entice"			 , "Active");	
		Pokemon pokemon111 = new Pokemon("Kricketot"	,54	, 1, 42 , 0, "red"		 , "Fairy"	  , "Sing"				 , "Active");
		Pokemon pokemon112 = new Pokemon("Kricketune"	,108, 2, 84 , 0, "red"		 , "Fairy"	  , "Musical Performance", "Active");
		Pokemon pokemon121 = new Pokemon("Vulpix"		,55	, 1, 40 , 0, "red"		 , "Fairy"	  , "Fire Spin"			 , "Active");
		Pokemon pokemon122 = new Pokemon("Ninetales"	,110, 2, 80 , 0, "red"		 , "Fairy"	  , "Fire Trap"			 , "Active");
		
		stage1.add(pokemon011);		stage2.add(pokemon012);		stage3.add(pokemon013);
		stage1.add(pokemon021);		stage2.add(pokemon022);		stage3.add(pokemon023);
		stage1.add(pokemon031);		stage2.add(pokemon032);		stage3.add(null);
		stage1.add(pokemon041);		stage2.add(pokemon042);		stage3.add(pokemon043);
		stage1.add(pokemon051);		stage2.add(pokemon052);		stage3.add(pokemon053);
		stage1.add(pokemon061);		stage2.add(pokemon062);		stage3.add(null);
		stage1.add(pokemon071);		stage2.add(pokemon072);		stage3.add(pokemon073);
		stage1.add(pokemon081);		stage2.add(pokemon082);		stage3.add(pokemon083);
		stage1.add(pokemon091);		stage2.add(pokemon092);		stage3.add(pokemon093);
		stage1.add(pokemon101);		stage2.add(pokemon102);		stage3.add(pokemon103);
		stage1.add(pokemon111);		stage2.add(pokemon112);		stage3.add(null);
		stage1.add(pokemon121);		stage2.add(pokemon122);		stage3.add(null);
		
		System.out.println("Each Player Draw 6 Pokemon...");

		
	}
	}
	

	

