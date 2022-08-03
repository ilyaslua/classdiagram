package com.example.classdiagram.services;

import com.example.classdiagram.models.Song;
import com.example.classdiagram.models.SongArtist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongInterfaceImpl implements SongInterface{
    @Override
    public List<SongArtist> getSongArtistBySong(Song song) {
        //
        return null;
    }
}
