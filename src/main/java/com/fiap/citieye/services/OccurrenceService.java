package com.fiap.citieye.services;

import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.dto.OccurrenceDto;

import java.util.List;

public interface OccurrenceService {

    OccurrenceDto saveOccurrence(final Occurrence occurrence);
    Occurrence getOccurrence(final Long occurrenceId);
    List<Occurrence> getAllOccurrence();
    List<Occurrence> getAllOccurrenceByCity(final Long city);
    List<Occurrence> getAllOccurrenceByUserId(final Long userId);
    void deleteOccurrence(final Long occurrenceId);

}
