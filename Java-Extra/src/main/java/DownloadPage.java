import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class DownloadPage {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        URL url = new URL("http://www.bluevalleyk12.org/education/school/school.php?sectionid=277");

        // Get the input stream through URL Connection
        URLConnection con = url.openConnection();
        InputStream is =  con.getInputStream();

        

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}