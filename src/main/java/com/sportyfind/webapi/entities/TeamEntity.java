package com.sportyfind.webapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "team")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "size")
    private int size;

    @Column(name = "description")
    private String description;

    @Column(name = "skilllevel")
    private int skilllevel;

    @Column(name = "rankingpoint")
    private int rankingpoint;

    @Column(name = "logo")
    private String logo;

    @Column(name = "rankingorder")
    private int rankingorder;

    @ManyToMany(mappedBy = "teams", fetch = FetchType.EAGER)
    private List<UserEntity> users;
}
