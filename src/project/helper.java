package project;

import java.util.ArrayList;
import java.util.Scanner;

public class helper {


	public static void createticket(Scanner in,ArrayList<pojo> arraylist) {
	 System.out.println("Enter new Id:");
	   	 int Id=in.nextInt();
   	 System.out.println("Enter new Assignee_Name:");
   	     String Assignee_name=in.next();
   	 System.out.println("Enter new Reporter_Name:");
   	     String Reporter=in.next();
   	 System.out.println("Enter new Heading:");
   	     String Heading=in.next();
   	 System.out.println("Enter new Status:");
   	     String Status=in.next();
   	     System.err.println("***Ticket create Sucessfully***");
   	 pojo p1=new pojo(Id,Assignee_name,Reporter,Heading,Status);
   	 arraylist.add(p1);
    }
	
	public static void viewticket(Scanner in,ArrayList<pojo> arraylist) {
		System.out.println("Choose any option from below;\r\n"
				+"1. Sigle_Ticket\r\n"
				+"2. All_Ticket_id\r\n"
				+"3. All_Ticket_Assignee Name \r\n"
				+"4. All_Ticket_Reporter Name\r\n"
				+"5. All_Ticket_Heading \r\n"
				+"6. All_Ticket_Status \r\n");
		int option=in.nextInt();
		switch(option) {
		case 1:
			module.sigle_ticket(in,arraylist);
		    break;
		case 2:
			module.all_sorted_id(in,arraylist);
		    break;
		case 3:
			module.all_name(in,arraylist);
		    break;
		case 4:
			module.all_Reporter(in,arraylist);
		    break;
		case 5:
			module.all_Heading(in,arraylist);
		    break;
		case 6:
			module.all_Status(in,arraylist);
		    break;
		}
   	 
    }
	
	public static void updateticket(Scanner in,ArrayList<pojo> arraylist) {
		System.out.println("Choose any option from below;\r\n"
				+"1. Chage_Assignee Name\r\n"
				+"2. Chage_Reporter Name\r\n"
				+"3. Change_Heading\r\n"
				+"4. Change_Status\r\n");
		int option=in.nextInt();
		switch(option) {
		    
		case 1:
			module. chage_Assignee_name(in,arraylist);
		    break;
		case 2:
			module.change_Reporter(in,arraylist);
		    break;
		case 3:
			module.change_Heading(in,arraylist);
		    break;
		case 4:
			module.change_Status(in,arraylist);
		    break;
		}
    }
	
	public static void deleteticket(Scanner in,ArrayList<pojo> arraylist) {
		System.out.println("Choose any option from below;\r\n"
				+"1. Delete_Single_Ticket\r\n"
				+"2. Delete_All_Ticket\r\n");
				
		int option=in.nextInt();
		switch(option) {
		
		case 1:
			module. delete_single_ticket(in,arraylist);
		    break;
		case 2:
			module.delete_all_ticket(in,arraylist);
		    break;
		
		}
    }
	
	
	
	public static void logout(Scanner in,ArrayList<pojo> arraylist) {
		System.err.println("***Thank You for your visit***");
   	 
   	 
    }
}


