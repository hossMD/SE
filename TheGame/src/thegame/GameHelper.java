package thegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by MaRV on 2/2/2015.
 */
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine=null;
        System.out.println(prompt +"    ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 00) return null;
        }catch (IOException e) {
            System.out.println("IOExeption:" + e);
        }
            return inputLine;
        }
    }

