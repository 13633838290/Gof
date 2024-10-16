package com.muzi.Creational.prototype.shallowCopy;

import lombok.Data;

@Data
public class Song {

    String title;

    String artist;

    Song(String title,String artist){
        this.title=title;
        this.artist=artist;
    }
}
