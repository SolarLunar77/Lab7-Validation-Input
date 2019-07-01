import java.util.Scanner;
public class Lab7 {
		
	private static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {		
			String name; // Valid entries: [A-Z][A-Za-z]{1,29}
	        String email; // ([A-Za-z0-9]{5,30})@([A-Za-z0-9]{5,10})\.[A-Za-z0-9]{2,3}
	        String phone; // \d{3}-\d{3}-\d{4}
	        String date; // \d{2}\/\d{2}\/\d{4}
	   
	        String input;
	        boolean valid = false;
	        
	               
	        
	        do {  		   //Name
	            valid = false; //Set to "false" in order to ensure no false positives
	            System.out.println("Please type in your name: ");
	            name = scan.nextLine();
	            valid = validateName(scan, name);
	            
	            System.out.println(valid? "Valid!" : "Invalid :( " );
	        
	        } while (!valid); //Close "Name" loop
	        
	        
	        do { 		    //Emails
	            valid = false;  //Set to "false" in order to ensure no false positives
	            System.out.println("Please type in your email: ");
	            email = scan.nextLine();
	            valid = validateEmail(scan, email);
	            
	            System.out.println(valid? "Valid!" : "Invalid :( " );
	               
	        } while (!valid); 	//Close "Emails" loop
	        
	        
	        do { 		    //Phone Numbers
	            valid = false;  //Set to "false" in order to ensure no false positives
	            System.out.println("Please type in your phone number. Use this format: ###-###-####: ");
	            phone = scan.nextLine();
	            valid = validatePhone(scan, phone);
	            
	            System.out.println(valid? "Valid!" : "Invalid :( " );
	            
	        } while (!valid); //Close "Phone Numbers" loop
	        
	        
	        do { 		    //Dates
	            valid = false;  //Set to "false" in order to ensure no false positives
	            System.out.println("Please enter your birthday. Use this format: mm/dd/yyyy: ");
	            date = scan.nextLine();
	            valid = validateDate(scan, date);
	            
	            System.out.println(valid? "Valid!" : "Invalid :( " );
	            
	        } while (!valid); //Close "Dates" loop
	        
	        
	        System.out.println("Your name is: " + name);
	        System.out.println("Your email is: " + email);
	        System.out.println("Your phone number is: " + phone);
	        System.out.println("The date you entered is: " + date);
	        
	        System.out.println("Thanks for for using our system! Goodbye!");
	        
	        
	        
	        scan.close();
	    }


	public static boolean validateName(Scanner scan, String userName) {
	    if (userName.matches("[A-Z][A-Za-z]{1,29}")) {
	        return true;
	    } else {
	        System.out.println("Please enter a valid name: ");
	        return false;
	    }
	    
	    
	}


	public static boolean validateEmail(Scanner scan, String userEmail) {
	    if (userEmail.matches("([A-Za-z0-9]{5,30})@([A-Za-z0-9]{5,10})\\.[A-Za-z0-9]{2,3}")) {
	        return true;
	    } else {
	        System.out.println("Please enter a valid email: ");
	        return false;
	    }
	    
	}


	public static boolean validatePhone(Scanner scan, String userPhone) {
	    if (userPhone.matches("\\d{3}-\\d{3}-\\d{4}")) {
	        return true;
	    } else {
	        System.out.println("Please enter a valid phone number: ");
	        return false;
	    }
	    
	}


	public static boolean validateDate(Scanner scan, String userDate) {
	    if (userDate.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
	        return true;
	    } else {
	        System.out.println("Please enter a valid date: ");
	        return false;
	    }
	    
	}


	}
