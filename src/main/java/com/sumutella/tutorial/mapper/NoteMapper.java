package com.sumutella.tutorial.mapper;

import com.sumutella.tutorial.dto.NoteDto;
import com.sumutella.tutorial.model.Note;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 4:14 PM
 * @since 1/2/2020, Thu
 */
@Mapper
public interface NoteMapper {
    Note dtoToEntity(NoteDto noteDto);
    NoteDto entityToDto(Note note);
}

