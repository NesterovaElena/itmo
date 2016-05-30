package NewClass;

import java.util.Scanner;

public class MyNewClass {
	
	private static final String ExhubitionName = null;
	public static String description = "This is a simple software for my website.To become familiar with all the functions of this menu, enter -all.";
	public static String descriptionCommand = "-d";

	public static String ExhibitionName = "Welcome ! If you want to to receive information about our exhibitions, you can visit our website http://www.erarta.com" ;
	public static String ExhubitionNameCommand = "-exhibiton";
	public static String sayTahnks = "Thank you for visit!";
	
	public static String buyCommand = "-buy";
	public static String buy = "You can follow any responses to buy tickets on the site http://www.erarta.com/ru/visit/tickets/";
	
	public static String allCommand = "-all";
	public static String all = "All Commands";
	public static String allText = "All commands";
	
	
	
	public static String[][] commands;
	
	public static Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		createAllCommands();
		
		
		if(args.length !=0) {
			
			if(args[0].equals(descriptionCommand)) {
				
				getDescription();
				
			} else if (args[0].equals(ExhubitionNameCommand)) {
				
				ExhibitionName();
				
			} else if(args[0].equals(buyCommand)) {
				
				buy();
				
			} else if(args[0].equals(allCommand)) {
				
				all();
				
			} 
		}
	}


	private static void createAllCommands() {

		commands = new String[4][2];
		
		commands[0][0] = descriptionCommand;
		commands[0][1] = description;
		
		commands[1][0] = ExhubitionNameCommand;
		commands[1][1] = ExhubitionName;
		
		commands[2][0] = buyCommand;
		commands[2][1] = buy;
		
		commands[3][0] = allCommand;
		commands[3][1] = all;
		
	}


	private static void all() {
		
		System.out.println(allText);
		
		for(String[] s : commands) {
			System.out.println(s[0] + ": "+s[1]);
		}
		
//		for(int i=0; i<commands.length;i++) {
//			System.out.println(commands[i][0] + ": "+commands[i][1]);
//		}
//		
	}


	private static void buy() {

		System.out.print(buy);
		
	}


	private static void ExhibitionName() {
		System.out.print(ExhibitionName);
		
		System.out.print(sayTahnks);
		
	}


	private static void getDescription() {
		System.out.print("Description: "+description);
	}

}
