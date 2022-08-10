package com.example.classdiagram.models.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArtistProfileDto implements Serializable {
    private final Long id;
    private final String bod;
    private final String nationality;
    private final boolean isBand;
}
