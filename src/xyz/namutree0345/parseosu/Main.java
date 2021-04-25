package xyz.namutree0345.parseosu;

import java.io.*;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        String temp;
        File file = new File("/home/namutree0345/바탕화면/osu_extract/layout.osu");
        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder readedRaw = new StringBuilder();

        while( (temp = br.readLine()) != null ) {
            readedRaw.append(temp).append("\n");
        }

        System.out.println(Arrays.toString(readedRaw.toString().split("]")[6].replace("[Colours", "").split("\n")));
        String[] a = readedRaw.toString().split("]")[6].replace("[Colours", "").split("\n");
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                System.out.println(a[i]);
                Logger.getGlobal().info(a[i].split(",")[0]);
                OsuNote osuNote = new OsuNote(a[i].split(",")[0],
                        a[i].split(",")[1],
                        a[i].split(",")[2],
                        a[i].split(",")[3],
                        a[i].split(",")[4],
                        a[i].split(",")[5],
                        a[i].split(",")[6],
                        a[i].split(",")[7]);
                System.out.println(osuNote.time);
            }
        }
    }
}
