package com.fiap.citieye.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.City;
import com.fiap.citieye.model.User;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@EqualsAndHashCode
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OccurrenceDto {
    private Long id;
    private String description;
    private User user;
    private City city;
    private Category category;
    private String address;
    private String local;
    private String title;
}
