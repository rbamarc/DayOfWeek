
package netbeans.dayofweek;

/**
 *
 * @author halfrikan
 */
public class DayOfWeek {

    public static void main(String[] args) {
        
        int day =4;
        String dayName = "";
        
        //convert to switch statement, once the correct condition is met
        //the program will not continue
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
                
            /*
                the big difference between an IF statement and a SWITCH statement
                is that if statements can only evaluate as booleans. Switch 
                Statements can evaluate any data type because its checking
                to see if they match any of the other cases
                */
        }
              
        System.out.println("The day is " + dayName);
    }
}
