package weno.program;

import java.util.*;

public class 베스트앨범 {


    public static class Album{

        private String genres;
        private int plays;

        public Album(String genres, int plays) {
            this.genres = genres;
            this.plays = plays;
        }

        public String getGenres() {
            return genres;
        }

        public void setGenres(String genres) {
            this.genres = genres;
        }

        public int getPlays() {
            return plays;
        }

        public void setPlays(int plays) {
            this.plays = plays;
        }

        @Override
        public String toString() {
            return "Album{" +
                    "genres='" + genres + '\'' +
                    ", plays=" + plays +
                    '}';
        }
    }



    public static int[] solution(String[] genres, int[] plays){
        int[] answer = {};

        List<Album> bestAlbum = new ArrayList<>();
        Map<String, Integer> playsSumMap = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            bestAlbum.add(new Album(genres[i], plays[i]));

            if (!playsSumMap.containsKey(genres[i])){
                playsSumMap.put(genres[i], plays[i]);
            }else{
                playsSumMap.put(genres[i], playsSumMap.get(genres[i]) + plays[i] );
            }
        }

        System.out.println(playsSumMap);

        Comparator<Album> albumComparator = new Comparator<Album>() {
            @Override
            public int compare(Album o1, Album o2) {
                return o2.getPlays() - o1.getPlays();
            }
        };

        Collections.sort(bestAlbum, albumComparator);
        System.out.println(bestAlbum);


        return answer;
    }


    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 250};

        solution(genres, plays);

    }





}
