package com.example.classdiagram.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "artist_profile")
public class ArtistProfile extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bod;
    private String nationality;
    private boolean isBand;

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Artist.class)
    @JoinColumn(name = "artist_id")
    private Artist artist;

}
