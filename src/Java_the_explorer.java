import java.util.Scanner;
public class Java_the_explorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        CharJava Java = new CharJava("Java","Good", 11, 110);
		
		CharJava Perl = new CharJava("Perl","Bad", 10, 100);
		
		System.out.println(Java.getName() + " has " + Java.getDamage() + " Damage "  + " and " + Java.getHealth() +" HP ");
		System.out.println(Java.getName() + " is good ");
		
		System.out.println(Perl.getName() + " has " + Perl.getDamage() + " Damage "  + " and " + Perl.getHealth() +" HP ");
		System.out.println(Perl.getName() + " is bad ");
		
		Map Codeland = new Map("Codeland", 5, 5, 1, 1);
		
	
		
		System.out.println(Codeland.getDes() + " map is " + Codeland.getX() + " * " + Codeland.getY() + "." + " To win reach 5,5" );
		
		System.out.println("The player starts at " + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
		
        String N;
        String S;
        String E;
        String W;
        
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Direction");
   	    String Direction = sc.nextLine();
   	   // Codeland.getCurrentx();
    	if (Codeland.getCurrentx() >= 2) { 
	   	    
    		switch(Direction) {
	    	
	    	case "N":
	    		Codeland.setCurrentx(Codeland.getCurrentx() - 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
	    	case "S":
	    		Codeland.setCurrentx(Codeland.getCurrentx() + 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
	    		
	    		
	    	case "E":
	    		Codeland.setCurrenty(Codeland.getCurrenty() + 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
	    	case "W":
	    		Codeland.setCurrenty(Codeland.getCurrenty() - 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
    	}}
    	else if (Codeland.getCurrentx() >= 1)	{
	    	
    		switch(Direction) {
    	    case "N":
	    		Codeland.setCurrentx(Codeland.getCurrentx() - 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
	    	case "S":
	    		Codeland.setCurrentx(Codeland.getCurrentx() + 1);
	    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
	    		break;
    		
		
	    		switch(Direction) {
		    	
		    	case "N":
		    		Codeland.setCurrentx(Codeland.getCurrentx() - 1);
		    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
		    		break;
		    	case "S":
		    		Codeland.setCurrentx(Codeland.getCurrentx() + 1);
		    		System.out.println("New co-ordinates:" + Codeland.getCurrentx()+","+ Codeland.getCurrenty());
		    		break;

		
		
		
		
		
		
	}

}}
