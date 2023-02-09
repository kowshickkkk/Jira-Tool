package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class module {


	 public static void sigle_ticket(Scanner in,ArrayList<pojo> arraylist) {
		System.out.println("Enter Id_no:");
		int id=in.nextInt();
	    Iterator<pojo> itr=arraylist.iterator();
	    pojo p=null;
	    while(itr.hasNext()) {
	    	p=itr.next();
	    	if(p.getId()==id) {
	    System.err.println("Id="+p.getId()+" "+"Assignee_Name="+p.getAssignee_name()+" "+"Reporter_Name="+p.getReporter()+" "+"Heading="+p.getHeading()+" "+"Status="+p.getStatus());
	    break;
	    	}
	      }
	    }
	
	  public static void all_sorted_id(Scanner in,ArrayList<pojo> arraylist) {
		
			//Collections.sort((List<T>) new idsort());
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			 while(itr.hasNext()) {
			    	p=itr.next();
		  System.err.println("Id="+p.getId());
		  }
		}

		public static void all_name(Scanner in,ArrayList<pojo> arraylist) {
		
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			 while(itr.hasNext()) {
			    	p=itr.next();
		  System.err.println("Assignee_Name="+p.getAssignee_name());
		  }
		}
		
		public static void all_Heading(Scanner in,ArrayList<pojo> arraylist) {
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			 while(itr.hasNext()) {
			    	p=itr.next();
		  System.err.println("Assignee_Heading="+p.getHeading());
		  }
		}
		
        public static void all_Reporter(Scanner in,ArrayList<pojo> arraylist) {
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			 while(itr.hasNext()) {
			    	p=itr.next();
		  System.err.println("Reporter_Name="+p.getReporter());
		  }
		}

		
         public static void all_Status(Scanner in,ArrayList<pojo> arraylist) {
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			 while(itr.hasNext()) {
			    	p=itr.next();
		  System.err.println("Assignee_Status="+p.getStatus());
		  }
		}
		
		public static void chage_Assignee_name(Scanner in,ArrayList<pojo> arraylist) {
			System.out.println("Enter Id_no;");
			int i= in.nextInt();
			
			System.out.println("Enter new Assignee_Name:");
			String sg=in.next();
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			while(itr.hasNext()) {
				p=itr.next();
				if(p.getId()==i) { 
					p.setAssignee_name(sg);
			    
			    System.err.println("New Assignee_Name="+p.getAssignee_name());
			    break;
			    }
				}
			}
		
		public static void change_Reporter(Scanner in,ArrayList<pojo> arraylist) {
			System.out.println("Enter Id_no;");
			int i= in.nextInt();
			
			System.out.println("Enter new Reporter_Name:");
			String sg=in.next();
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			while(itr.hasNext()) {
				p=itr.next();
				if(p.getId()==i) { 
					p.setReporter(sg);
			    
			    System.err.println("New Reporter_Name="+p.getReporter());
			    break;
			    }
				}
			}
			
		
		public static void change_Heading(Scanner in,ArrayList<pojo> arraylist) {
			System.out.println("Enter Id_no;");
			int j=in.nextInt();
			
			System.out.println("Enter new Heading:");
			String sg=in.next();
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			while(itr.hasNext()) {
				p=itr.next();
				if(p.getId()==j) { 
				  p.setHeading(sg);
				System.err.println("New_Heading="+p.getHeading());
			    break;
			   }
			}
			}
		
		public static void change_Status(Scanner in,ArrayList<pojo> arraylist) {
			
			System.out.println("Enter Id_no;");
			int k=in.nextInt();
			
			System.out.println("Enter new Status:");
			String sg=in.next();
			
			Iterator<pojo> itr=arraylist.iterator();
			pojo p=null;
			while(itr.hasNext()) {
				p=itr.next();
				if(p.getId()==k) 
			p.setStatus(sg);
				System.err.println("New_Status="+p.getStatus());
			    break;
			   }
			}
		    
		    
		public static void  delete_single_ticket(Scanner in,ArrayList<pojo> arraylist) {
			System.out.println("Enter the Id_no to Delete:");
			int d=in.nextInt();
			Iterator<pojo> d1=arraylist.iterator();
			pojo p=null;
			while(d1.hasNext()) {
				p=d1.next();
			 if(p.getId()==d){
				 d1.remove();
					System.err.println("Deleted Successfully");
				break;
			 }
		  }	
		}
		
		public static void delete_all_ticket(Scanner in,ArrayList<pojo> arraylist) {
			Iterator<pojo> itr=arraylist.iterator();
			pojo o=null;
			while(itr.hasNext()) {
				o=itr.next();
				//if(itr.hasNext()
			itr.remove();
			System.err.println("All Ticket Deleted Successfully");
		 }
		}	
      }
