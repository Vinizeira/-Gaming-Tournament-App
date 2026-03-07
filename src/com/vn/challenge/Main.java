package com.vn.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 - Instances / objects
        Music m1 = new Music("Wonderwall", 258, "Oasis", "(What's the Story) Morning Glory?", "Britpop");
        Music m2 = new Music("Boulevard of Broken Dreams", 261, "Green Day", "American Idiot", "Punk Rock");
        Podcast p1 = new Podcast("The Alibi", 3120, "Sarah Koenig", "Investigative journalism podcast exploring the 1999 murder case of Hae Min Lee", 1);
        Podcast p2 = new Podcast("How to Improve Your Focus", 7200, "Andrew Huberman", "Neuroscientist explains science-based tools to improve focus and concentration", 2);

        // Collection
        List<Playable> audios = new ArrayList<>();
        audios.add(m1);
        audios.add(m2);
        audios.add(p1);
        audios.add(p2);

        // Methods(Encapsulation) and loops
        // m1 - Wonderwall
        for (int i = 0; i < 4; i++) {m1.play();}
        for (int i = 0; i < 3; i++) {m1.like();}
        // m2 - Boulevard
        for (int i = 0; i < 5; i++) {m2.play();}
        for (int i = 0; i < 2; i++) {m2.like();}
        // p1 - Serial
        for (int i = 0; i < 3; i++) {p1.play();}
        for (int i = 0; i < 3; i++) {p1.like();}
        // p2 - Huberman
        for (int i = 0; i < 4; i++) {p2.play();}
        for (int i = 0; i < 1; i++) {p2.like();}

        // Filter and prints on screen
        List<Playable> favorites = new ArrayList<>();
        System.out.println("=== All Audios ===");
        for (Playable audio : audios) { // for each audio in audios
            if (audio.getRating() >= 3.0) {
                favorites.add(audio);
            }
            System.out.println(audio);
            System.out.println("Rating: " + audio.getRating() + " ⭐");
            System.out.println("-------------------");
        }
        System.out.println("\n=== Favorites (rating >= 3.0) ===");
        for (Playable audio : favorites) {
            System.out.println(audio);
            System.out.println("Rating: " + audio.getRating() + " ⭐");
            System.out.println("-------------------");
        }
    }
}
