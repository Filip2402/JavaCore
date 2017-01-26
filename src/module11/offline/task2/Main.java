package module11.offline.task2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by PC on 20.01.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = null;

        try {
            url = new URL( "https://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\PC\\Desktop\\Java\\JavaCore\\src\\module11\\offline\\task2\\url.txt")));

        String line;

        while ( (line = bufferedReader.readLine()) != null){

            line = line.replaceAll("google", "yandex").replaceAll("Google","Yandex");
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            System.out.println(line);
        }



    }


}
