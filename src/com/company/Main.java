package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate paradise= LocalDate.of(2011, 10, 12);
        Song Paradise= new Song("Paradise", "Coldplay", Song.Genre.ALTERNATIVE, paradise, false, 56);
        System.out.println(Paradise.getName() + " is a " + Paradise.getGenre() + " song created " + Paradise.getCreationDate()+ " by " + Paradise.getArtist() + " and it is "+ Paradise.isExplicit + " that it is explicit");
        System.out.println("It is "+ Paradise.isTopCharts() + " that " + Paradise.getName() + " is top charts");

        Song wishIKnewYou  = new Song("Wish I Knew You", "The Revivalists", 9);
        System.out.println(wishIKnewYou.getName() + " is a song created by " + wishIKnewYou.getArtist());
        System.out.println("It is "+ wishIKnewYou.isTopCharts() + " that " + wishIKnewYou.getName() + " is top charts");

    }
}
