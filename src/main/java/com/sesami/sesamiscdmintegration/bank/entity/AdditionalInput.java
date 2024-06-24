package com.sesami.sesamiscdmintegration.bank.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class AdditionalInput {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @JsonProperty("UIPrompt")
    private String UIPrompt;
    private boolean numeric;

    @ElementCollection
    private List<String> predefinedValues;

//    new
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "bank_id")
//    @JsonBackReference
//    private Bank bank;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "author_id")
//    private Author author;

    //old
    @ManyToOne
    @JoinColumn(name = "bank_id")
    @JsonBackReference
    private Bank bank;
}