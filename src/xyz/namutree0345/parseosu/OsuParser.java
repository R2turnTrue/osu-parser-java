package xyz.namutree0345.parseosu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class OsuParser {

    public static ArrayList<OsuNote> parseNotesFromFile(File file) throws IOException {
        String temp;
        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder readedRaw = new StringBuilder();

        while( (temp = br.readLine()) != null ) {
            readedRaw.append(temp).append("\n");
        }

        System.out.println(Arrays.toString(readedRaw.toString().split("]")[6].replace("[Colours", "").split("\n")));
        String[] a = readedRaw.toString().split("]")[6].replace("[Colours", "").split("\n");

        ArrayList<OsuNote> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                result.add(new OsuNote(a[i].split(",")[0],
                        a[i].split(",")[1],
                        a[i].split(",")[2],
                        a[i].split(",")[3],
                        a[i].split(",")[4],
                        a[i].split(",")[5],
                        a[i].split(",")[6],
                        a[i].split(",")[7]));
            }
        }

        return result;
    }

}
