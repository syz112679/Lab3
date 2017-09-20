import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public class lab3 {

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s=urlToString("http://erdani.com/tdpl/hamlet.txt");
        int count=0;

        for(int i=0; i<s.length()-1;i++) {
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                count++;
            }
        }
        System.out.println("word number = " + count);

    }

}
