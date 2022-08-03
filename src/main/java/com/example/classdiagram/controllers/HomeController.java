package com.example.classdiagram.controllers;

import com.example.classdiagram.models.Artist;
import com.example.classdiagram.models.Song;
import com.example.classdiagram.models.SongArtist;
import com.example.classdiagram.models.SongDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        Song romanPicisan = new Song()
                .setTitle("Roman picisan");

        List<Artist> artistList = new ArrayList<>();
        for(SongArtist sa:romanPicisan.getSongArtistList()){
            artistList.add(sa.getArtist());
        }


        //

        SongDTO songDTO = new SongDTO().setSong(romanPicisan)
                .setArtistList(artistList);

        return "";

    }

}
