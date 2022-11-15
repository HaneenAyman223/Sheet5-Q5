

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.net.MalformedURLException , IOException {

        URL u1 = new URL("http://www.isittuesday.co.uk/");
        Scanner s1 = new Scanner(u1.openStream());
        int count=0;

        while (s1.hasNext())
        {
            String x = s1.nextLine();
            count++;
        }
        System.out.println("Number of words : " + count);
    }
}
