package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static String username="Jacksparrow";
	static String password="Black bell";
	static Scanner in=new Scanner(System.in);
	static ArrayList<pojo> arraylist=new ArrayList<pojo>();
	
	public static void main (String args[]) {
		pojo p=new pojo(1,"Jack","sparrow","login issue","to do");
		pojo p1=new pojo(2,"kavin","kumar","server slow","done");
		pojo p2=new pojo(3,"jony","deb","user name wrong ","testing");
		
		arraylist.add(p);
		arraylist.add(p1);
		arraylist.add(p2);
		
		System.err.println("***Welcome To Jira_Ticket***");
		while(true){
			
			System.out.println("Choose any one option below:\r\n"
					+ "1.Create New Ticket\r\n"
					+"2.View Ticket\r\n"
					+"3.Update Ticket\r\n"
					+"4.Delete Ticket\r\n"
					+"5.Logout");
			System.out.println("Enter any one option:");
			int option=in.nextInt();
			switch(option) {
			case 1:
				helper.createticket(in,arraylist);
				break;
			case 2:
				helper.viewticket(in,arraylist);
				break;
			case 3:
				helper.updateticket(in,arraylist);
				break;
			case 4:
				helper.deleteticket(in,arraylist);
				break;
			case 5:
				helper.logout(in,arraylist);
				break;
			}
		}
	}

}
