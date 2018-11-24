import java.util.ArrayList;
import java.util.List;
public class TestGame {
	public static void main(String[] args) {
		
		List<Pokemon>cardNumber = new ArrayList<Pokemon>();
		
		Pokemon pokemon011 = new Attacking("Charmander"		,50	, 1, 24 , 0, "red"	 	 , "Attacking", "Flamethrower"		 , "Active", 3 );	cardNumber.add(pokemon011);
		Pokemon pokemon012 = new Attacking("Charmeleon"		,100, 2, 48 , 0, "red"	 	 , "Attacking", "Fire Wheel"		 , "Active", 6 );	cardNumber.add(pokemon012);
		Pokemon pokemon013 = new Attacking("Charizard"		,200, 3, 96 , 0, "red"	 	 , "Attacking", "Fire Blast"		 , "Active", 12);	cardNumber.add(pokemon013);
		Pokemon pokemon021 = new Attacking("Torchic"		,74	, 1, 35 , 0, "red"	 	 , "Attacking", "Ember"				 , "Active", 2 );	cardNumber.add(pokemon021);
		Pokemon pokemon022 = new Attacking("Combusken"		,148, 2, 70 , 0, "red"	 	 , "Attacking", "Flame Charge"		 , "Active", 4 );	cardNumber.add(pokemon022);
		Pokemon pokemon023 = new Attacking("Blaziken"		,296, 3, 140, 0, "red"	 	 , "Attacking", "Blaze Kick"		 , "Active", 8 );	cardNumber.add(pokemon023);
		Pokemon pokemon031 = new Attacking("Kyogre"			,50	, 1, 40 , 0, "blue"	 	 , "Attacking", "Judgement Storm"	 , "Active", 4 );	cardNumber.add(pokemon031);
		Pokemon pokemon032 = new Attacking("Primal Kyogre"	,100, 2, 80 , 0, "blue"	 	 , "Attacking", "Wind Walker Remorse", "Active", 8 );	cardNumber.add(pokemon032);
		Pokemon pokemon041 = new Attacking("Pichu"			,56	, 1, 37 , 0, "yellow"	 , "Attacking", "Sparks"			 , "Active", 4 );	cardNumber.add(pokemon041);
		Pokemon pokemon042 = new Attacking("Pikachu"		,112, 2, 74 , 0, "yellow"	 , "Attacking", "Lighthing Ball"	 , "Active", 8 );	cardNumber.add(pokemon042);
		Pokemon pokemon043 = new Attacking("Raichu"			,224, 3, 148, 0, "yellow"	 , "Attacking", "Ray Bolt"			 , "Active", 16);	cardNumber.add(pokemon043);
		
		Pokemon pokemon051 = new Defending("Squirtle"	,30	, 1, 21 , 0, "blue"	 	 , "Defending", "Defense Curl"		 , "Active", 3 );	cardNumber.add(pokemon051);
		Pokemon pokemon052 = new Defending("Wartortle"	,120, 2, 42 , 0, "blue"	 	 , "Defending", "Iron Defense"		 , "Active", 6 );	cardNumber.add(pokemon052);
		Pokemon pokemon053 = new Defending("Blastoise"	,240, 3, 42 , 0, "blue"	 	 , "Defending", "Block"				 , "Active", 12);	cardNumber.add(pokemon053);
		Pokemon pokemon061 = new Defending("Shieldon"	,70	, 1, 46 , 0, "yellow"	 , "Defending", "Iron head"			 , "Active", 2 );	cardNumber.add(pokemon061);
		Pokemon pokemon062 = new Defending("Bastiodon"	,140, 2, 92 , 0, "yellow"	 , "Defending", "Iron Body"			 , "Active", 4 );	cardNumber.add(pokemon062);
		Pokemon pokemon071 = new Defending("Eleckid"	,70	, 1, 20 , 0, "yellow"	 , "Defending", "Electric Barrier"	 , "Active", 3 );	cardNumber.add(pokemon071);
		Pokemon pokemon072 = new Defending("Electabuzz"	,140, 2, 40 , 0, "yellow"	 , "Defending", "Static Barier"		 , "Active", 6 );	cardNumber.add(pokemon072);
		Pokemon pokemon073 = new Defending("Electivire"	,280, 3, 80 , 0, "yellow"	 , "Defending", "Raijin Barrier"	 , "Active", 12);	cardNumber.add(pokemon073);
		Pokemon pokemon081 = new Defending("Slowpoke"	,65	, 1, 38 , 0, "blue"	 	 , "Defending", "Nap"				 , "Active", 2 );	cardNumber.add(pokemon081);
		Pokemon pokemon082 = new Defending("Slowbro"	,130, 2, 76 , 0, "blue"	 	 , "Defending", "Sleep"				 , "Active", 4 );	cardNumber.add(pokemon082);
		Pokemon pokemon083 = new Defending("Slowking"	,260, 3, 152, 0, "blue"		 , "Defending", "Hibernate"			 , "Active", 8 );	cardNumber.add(pokemon083);
		
		Pokemon pokemon091 = new Pokemon("Igglybuff"	,50	, 1, 42 , 0, "colourless", "Fairy"	  , "Lullaby"			 , "Active");	cardNumber.add(pokemon091);
		Pokemon pokemon092 = new Pokemon("Jigglypuff"	,100, 2, 84 , 0, "colourless", "Fairy"	  , "Confusion Sense"	 , "Active");	cardNumber.add(pokemon092);
		Pokemon pokemon093 = new Pokemon("Wigglypuff"	,150, 3, 168, 0, "colourless", "Fairy"	  , "Mind Blast"		 , "Active");	cardNumber.add(pokemon093);
		Pokemon pokemon101 = new Pokemon("Ralts"		,50	, 1, 40 , 0, "colourless", "Fairy"	  , "Telepathy"			 , "Active");	cardNumber.add(pokemon101);
		Pokemon pokemon102 = new Pokemon("Kirlia"		,100, 2, 80 , 0, "colourless", "Fairy"	  , "Confusion"			 , "Active");	cardNumber.add(pokemon101);
		Pokemon pokemon103 = new Pokemon("Gardevoir"	,200, 3, 160, 0, "colourless", "Fairy"	  , "Entice"			 , "Active");	cardNumber.add(pokemon103);
		Pokemon pokemon111 = new Pokemon("Kricketot"	,54	, 1, 42 , 0, "red"		 , "Fairy"	  , "Sing"				 , "Active");	cardNumber.add(pokemon111);
		Pokemon pokemon112 = new Pokemon("Kricketune"	,108, 2, 84 , 0, "red"		 , "Fairy"	  , "Musical Performance", "Active");	cardNumber.add(pokemon112);
		Pokemon pokemon121 = new Pokemon("Vulpix"		,55	, 1, 40 , 0, "red"		 , "Fairy"	  , "Fire Spin"			 , "Active");	cardNumber.add(pokemon121);
		Pokemon pokemon122 = new Pokemon("Ninetales"	,110, 2, 80 , 0, "red"		 , "Fairy"	  , "Fire Trap"			 , "Active");	cardNumber.add(pokemon122);
		
		System.out.println("===================================");
		int i = 0;
		for( Pokemon a: cardNumber) {
			i += 1;
			System.out.printf("%d. %s\n", i, a);
		}System.out.println("===================================");
		
	
	}
}
