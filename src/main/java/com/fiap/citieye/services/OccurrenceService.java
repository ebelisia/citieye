package com.fiap.citieye.services;

import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.dto.OccurrenceDto;

import java.util.List;

public interface OccurrenceService {

    OccurrenceDto saveOccurrence(final Occurrence occurrence, final Long userId);
    Occurrence getOccurrence(final Long occurrenceId);
    List<OccurrenceDto> getAllOccurrence();
    List<OccurrenceDto> getAllOccurrenceByCity(final Long city);
    List<OccurrenceDto> getAllOccurrenceByUserId(final Long userId);
    void deleteOccurrence(final Long occurrenceId);

}
