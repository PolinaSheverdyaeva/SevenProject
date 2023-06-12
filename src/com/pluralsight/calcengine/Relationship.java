package com.pluralsight.calcengine;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Relationship {



    static void checkRelationship(Instant otherInstant){
        Instant nowInstant = Instant.now();
        if(otherInstant.compareTo(nowInstant) > 0 ){
            System.out.println("Instant is in the future");
        } else if(otherInstant.compareTo(nowInstant) < 0){
            System.out.println("Instant is now");
        }

    }




}
