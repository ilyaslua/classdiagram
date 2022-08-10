package com.example.classdiagram.models.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArtistDto implements Serializable {
    private final Long id;
    private final String name;
    private final ArtistProfileDto artistProfile;
}
