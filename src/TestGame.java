import java.util.ArrayList;
import java.util.List;
public class TestGame {
	public static void main(String[] args) {
		
		List<Integer>cardNumber = new ArrayList<>();
		
		Pokemon pokemon011 = new Attacking("Charmander"		,50	, 1, 24 , 0, "red"	 	 , "Attacking", "Flamethrower"		 , "Active", 3 );	
		Pokemon pokemon012 = new Attacking("Charmeleon"		,100, 2, 48 , 0, "red"	 	 , "Attacking", "Fire Wheel"		 , "Active", 6 );
		Pokemon pokemon013 = new Attacking("Charizard"		,200, 3, 96 , 0, "red"	 	 , "Attacking", "Fire Blast"		 , "Active", 12);
		Pokemon pokemon021 = new Attacking("Torchic"		,74	, 1, 35 , 0, "red"	 	 , "Attacking", "Ember"				 , "Active", 2 );
		Pokemon pokemon022 = new Attacking("Combusken"		,148, 2, 70 , 0, "red"	 	 , "Attacking", "Flame Charge"		 , "Active", 4 );
		Pokemon pokemon023 = new Attacking("Blaziken"		,296, 3, 140, 0, "red"	 	 , "Attacking", "Blaze Kick"		 , "Active", 8 );
		Pokemon pokemon031 = new Attacking("Kyogre"			,50	, 1, 40 , 0, "blue"	 	 , "Attacking", "Judgement Storm"	 , "Active", 4 );
		Pokemon pokemon032 = new Attacking("Primal Kyogre"	,100, 2, 80 , 0, "blue"	 	 , "Attacking", "Wind Walker Remorse", "Active", 8 );		
		Pokemon pokemon041 = new Attacking("Pichu"			,56	, 1, 37 , 0, "yellow"	 , "Attacking", "Sparks"			 , "Active", 4 );		
		Pokemon pokemon042 = new Attacking("Pikachu"		,112, 2, 74 , 0, "yellow"	 , "Attacking", "Lighthing Ball"	 , "Active", 8 );		
		Pokemon pokemon043 = new Attacking("Raichu"			,224, 3, 148, 0, "yellow"	 , "Attacking", "Ray Bolt"			 , "Active", 16);
		
		Pokemon pokemon051 = new Pokemon("Squirtle"		,30	, 1, 21 , 0, "blue"	 	 , "Defending", "Defense Curl"		 , "Active");
		Pokemon pokemon052 = new Pokemon("Wartortle"	,120, 2, 42 , 0, "blue"	 	 , "Defending", "Iron Defense"		 , "Active");
		Pokemon pokemon053 = new Pokemon("Blastoise"	,240, 3, 42 , 0, "blue"	 	 , "Defending", "Block"				 , "Active");
		Pokemon pokemon061 = new Pokemon("Shieldon"		,70	, 1, 46 , 0, "yellow"	 , "Defending", "Iron head"			 , "Active");				
		Pokemon pokemon062 = new Pokemon("Bastiodon"	,140, 2, 92 , 0, "yellow"	 , "Defending", "Iron Body"			 , "Active");				
		Pokemon pokemon071 = new Pokemon("Eleckid"		,70	, 1, 20 , 0, "yellow"	 , "Defending", "Electric Barrier"	 , "Active");		
		Pokemon pokemon072 = new Pokemon("Electabuzz"	,140, 2, 40 , 0, "yellow"	 , "Defending", "Static Barier"		 , "Active");
		Pokemon pokemon073 = new Pokemon("Electivire"	,280, 3, 80 , 0, "yellow"	 , "Defending", "Raijin Barrier"	 , "Active");
		Pokemon pokemon081 = new Pokemon("Slowpoke"		,65	, 1, 38 , 0, "blue"	 	 , "Defending", "Nap"				 , "Active");
		Pokemon pokemon082 = new Pokemon("Slowbro"		,130, 2, 76 , 0, "blue"	 	 , "Defending", "Sleep"				 , "Active");
		Pokemon pokemon083 = new Pokemon("Slowking"		,260, 3, 152, 0, "blue"		 , "Defending", "Hibernate"			 , "Active");
		
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
		
		
		
	
	}
}
