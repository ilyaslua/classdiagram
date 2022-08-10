package com.example.classdiagram.models;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain = true)
public class SongDTO {
    private Long id;
    private String title;
//    private List<Artist> artists;
//
//    public void fromSong(Song song){
//        this.id=song.getId();
//        this.title=song.getTitle();
//        artists = new ArrayList<>();
//
//        for(SongArtist sa:song.getSongArtistList()){
//            Artist artist = new Artist()
//                    .setId(sa.getArtist().getId())
//                    .setName(sa.getArtist().getName());
//
//            artists.add(artist);
//        }
//    }

//    @Data
//    private class Artist{
//        private Long id;
//        private String name;
//    }
}
