package com.patterns.proxy.protection;

public class HotelReal implements Hotel{

    private String name;
    private int points;
    private int reviews;



    public String getName() {
        return name;
    }

    public int getRating(){

        if (points > 0){
           return points/reviews;
        }

        else return 0;
    }

    public void setPoints(int points) {
        if (points > 0){
            this.points += points;
            reviews++;
        }

    }

    public void setName(String name) {
        this.name = name;
    }



}
