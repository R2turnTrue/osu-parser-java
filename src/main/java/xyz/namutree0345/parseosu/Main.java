package xyz.namutree0345.parseosu;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        String temp;
        File file = new File("C:\\Users\\NT Windows\\Downloads\\1147128 meganeko - Computer Blues\\meganeko - Computer Blues (Axer) [Technokinesis].osu");
        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder readedRaw = new StringBuilder();

        while( (temp = br.readLine()) != null ) {
            readedRaw.append(temp).append("\n");
        }

        String[] a = readedRaw.toString().split("]")[6].replace("[Colours", "").split("\n");

        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                if(a[i].split(",").length >= 8) {
                    OsuNote osuNote = new OsuNote(a[i].split(",")[0],
                            a[i].split(",")[1],
                            a[i].split(",")[2],
                            a[i].split(",")[3],
                            a[i].split(",")[4],
                            a[i].split(",")[5],
                            a[i].split(",")[6],
                            a[i].split(",")[7]);
                }
            }
        }
    }
}
