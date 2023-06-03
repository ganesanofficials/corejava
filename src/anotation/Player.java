package anotation;

import jdk.jfr.ContentType;

@interface Game{
   String getGame() default "Cricket";
}

@Game(getGame = "kabadi")
public class Player {
    String name;


    public static void main(String[] args) {
        Player p = new Player();
        p.name = "dhj";
    }
}


