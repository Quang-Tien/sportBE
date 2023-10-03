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
@Table(name = "sport")
public class SportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sportid")
    private Integer sportId;

    @Column(name = "sportname")
    private String sportName;

    @OneToMany(mappedBy = "sport")
    private List<FieldTypeEntity> fieldTypes;

    @OneToMany(mappedBy = "sport")
    private List<FieldEntity> fields;
}
