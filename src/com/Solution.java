package com;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.*;
import java.net.*;

import com.google.gson.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        List<String> res = new ArrayList<>();
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        String[] res;
//        String _substr;
//        try {
//            _substr = in.nextLine();
//        } catch (Exception e) {
//            _substr = null;
//        }

        res = getMovieTitles("epaga");
        for (String s : res) {
            System.out.println(s);
        }
    }

    static List<String> getMovieTitles(String substr) {
        String response;
        int startPage = 1;
        int totalPages = Integer.MAX_VALUE;
        List<String> titles = new ArrayList<>();
        while (startPage <= totalPages) {
            try {
                URL obj = new URL(
                        "https://jsonmock.hackerrank.com/api/articles?author=" + substr + "&page=" + startPage);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                while ((response = in.readLine()) != null) {
                    JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
                    totalPages = convertedObject.get("total_pages").getAsInt();
                    JsonArray data = convertedObject.getAsJsonArray("data");
                    for (int i = 0; i < data.size(); i++) {
                        try {
                            String title = data.get(i).getAsJsonObject().get("title").getAsString();
                            String story_title = data.get(i).getAsJsonObject().get("story_title").getAsString();
                            if (title != null) {
                                titles.add(title);
                            } else if (story_title != null) {
                                titles.add(story_title);
                            }
                        } catch (Exception e) {

                        }
                    }
                }
                in.close();
                startPage++;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }

        }
        Collections.sort(titles);
        return titles;
    }
}
