package com.fiap.citieye.mapper;

import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.User;
import com.fiap.citieye.model.dto.OccurrenceDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OccurrenceMapper {

    public OccurrenceDto mapRegisterOccurrenceToOccurrenceDto(final Occurrence occurrence){
        User user = User.builder()
                .name(occurrence.getUser().getName())
                .surname(occurrence.getUser().getSurname()).build();
        return OccurrenceDto.builder()
                .description(occurrence.getDescription())
                .user(user)
//                .city(occurrence.getCity())
                .local(occurrence.getLocal())
                .address(occurrence.getAddress())
                .title(occurrence.getTitle())
//                .category(occurrence.getCategory())
                .build();
    }

    public List<OccurrenceDto> mapListRegisterOccurrenceToOccurrenceDto(final List<Occurrence> occurrences){

        List<OccurrenceDto> occurrenceDtoList = new ArrayList<>();
        User user = User.builder().build();
        OccurrenceDto occurrenceBuilder = OccurrenceDto.builder().build();

        for(Occurrence occurrence : occurrences){
            occurrenceBuilder.setId(occurrence.getId());
            occurrenceBuilder.setCity(occurrence.getCity());
            occurrenceBuilder.setDescription(occurrence.getDescription());
            user.setName(occurrence.getUser().getName());
            user.setSurname(occurrence.getUser().getSurname());
            occurrenceBuilder.setUser(user);
            occurrenceDtoList.add(occurrenceBuilder);
        }
        return occurrenceDtoList;
    }

}
