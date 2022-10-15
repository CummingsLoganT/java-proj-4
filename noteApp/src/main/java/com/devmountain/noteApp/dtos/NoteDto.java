package com.devmountain.noteApp.dtos;

import com.devmountain.noteApp.entities.Note;

import java.io.Serializable;

public class NoteDto implements Serializable {
    private Long id;
    private String body;
    private UserDto userDto;

    public NoteDto(Note note) {
        if (note.getId() != null) this.id = note.getId();
        if (note.getBody() != null) this.body = note.getBody();
    }

    public String getBody() {
        return body;
    }
}
