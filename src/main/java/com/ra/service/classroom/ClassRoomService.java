package com.ra.service.classroom;

import com.ra.model.entity.Classroom;

import java.util.List;

public interface ClassRoomService {
    List<Classroom> getAll();

    Classroom save(Classroom classroom);

    void delete(Long id);

    Classroom findById(Long id);
}
