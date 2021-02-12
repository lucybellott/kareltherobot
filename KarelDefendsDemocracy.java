package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		cleanballot();
	    move();
		cleanballot();
		move();
		cleanballot();
		move();
			}
		
	private void cleanballot() {
		
		if (beepersPresent()) {
			move();
			move();
		}
	
		if (noBeepersPresent()) {
			turnLeft();
			move();
	      }
		if (noBeepersPresent()) {
			turnRight();
			turnRight();
			move();
			move();
			}
		if (beepersPresent()) {
			pickBeeper(); 
		    turnRight();
			turnRight();
			move();
			move();
			
			}
		if (noBeepersPresent()) {
			turnRight();
			turnRight();
			move();
			turnRight();
			move();
		}
	  
		while(beepersPresent()) {
			pickBeeper();
			if (noBeepersPresent()) {
				turnRight();
				turnRight();
				move();
				turnRight();
		     }
		      }
		
		       }
		
	            }
	

		
	
	
		

