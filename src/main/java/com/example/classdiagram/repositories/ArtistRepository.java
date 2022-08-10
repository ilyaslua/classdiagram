package com.example.classdiagram.repositories;

import com.example.classdiagram.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}