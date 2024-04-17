package com.muzi.Creational.prototype.shallowCopy;

import lombok.Data;

import java.util.List;
@Data
public class Playlist {


    private  Long id;

    private  String name;

    private List<Song> songs;

    public  Playlist(){

    }

    public void add(Song song){
        songs.add(song);

    }

    public  Playlist(Playlist sourcePlaylist){
        this.id = sourcePlaylist.getId();
        this.name =sourcePlaylist.getName();
        this.songs=sourcePlaylist.getSongs();
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.setId(1L);
        playlist.setName("杰伦");
        playlist.add(new Song("稻香","周杰伦"));

        Playlist playlist2 = new Playlist(playlist);



    }


}
