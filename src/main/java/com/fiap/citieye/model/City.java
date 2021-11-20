package com.fiap.citieye.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@EqualsAndHashCode
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@SequenceGenerator(name = "city", sequenceName = "SQ_CITY", allocationSize = 1)
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cities")
    private Long id;
    private String name;
}
