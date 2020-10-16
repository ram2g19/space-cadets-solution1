import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// For the record this is not a good solution, I hate myself for coding this
// I had 15 minutes
public class Main {
	public static void main(String[] args) {
        try {
        	String email = "lac@ecs.soton.ac.uk";
            URL google = new URL("https://www.ecs.soton.ac.uk/people/r");
            BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));
            String inputLine; 
 			
            while ((inputLine = in.readLine()) != null) {
                // Process each line.
                if (inputLine.contains(email)) {
                	String name = inputLine.substring(61,90);
                	System.out.println(name.substring(0, name.indexOf("<")).replace(",", " "));
        		}

            }
            in.close(); 
 
        } catch (MalformedURLException me) {
            System.out.println(me); 
 
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }//end main
}