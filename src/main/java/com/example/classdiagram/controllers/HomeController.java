package com.example.classdiagram.controllers;

import com.example.classdiagram.models.Artist;
import com.example.classdiagram.models.Song;
import com.example.classdiagram.models.SongDTO;
import com.example.classdiagram.services.SongInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    SongInterface songInterface;


    @GetMapping("/")
    public SongDTO home(){
        Artist hanin = new Artist().setId(1l).setName("Hanin");
        Artist dewa19 = new Artist().setId(2l).setName("Dewa 19");

        List<Artist> artistList = new ArrayList<>();
        artistList.add(hanin);
        artistList.add(dewa19);

        Song romanPicisan = new Song();
                romanPicisan.setId(1l);
                romanPicisan.setTitle("Roman picisan");

        SongDTO songDTO = new SongDTO();
//        songDTO.fromSong(romanPicisan);

        return songDTO;

    }

    @RequestMapping(path = "/requestpart/song", method = RequestMethod.POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public ResponseEntity<Object> saveSong(@RequestPart SongDTO songDTO, @RequestPart MultipartFile document) {
        return ResponseEntity.ok().build();
    }

}
