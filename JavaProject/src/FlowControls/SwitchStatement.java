package FlowControls;

public class SwitchStatement {
	
	public static void BasicSwitch() {
		

		int day = 1;
        String dayType;
        String dayString;
 
        switch (day) {
        case 1:
            dayString = "Monday";
            System.out.println("The day is "+dayString);
            break; // to end the execution from the switch
        case 2:
            dayString = "Tuesday";
            System.out.println("The day is "+dayString);
            break;
        case 3:
            dayString = "Wednesday";
            System.out.println("The day is "+dayString);
            break;
        case 4:
            dayString = "Thursday";
            System.out.println("The day is "+dayString);
            break;
        case 5:
            dayString = "Friday";
            System.out.println("The day is "+dayString);
            break;
        case 6:
            dayString = "Saturday";
            System.out.println("The day is "+dayString);
            break;
        case 7:
            dayString = "Sunday";
            System.out.println("The day is "+dayString);
            break;
        default:
            dayString = "Invalid day";
        }
 
        switch (day) {
        // multiple cases without break statements
 
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;
 
        default:
            dayType = "Invalid daytype";
        }
 
        System.out.println(dayString + " is a " + dayType);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BasicSwitch();
		
		
	}

}
