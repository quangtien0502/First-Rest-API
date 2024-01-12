package com.ra.service.classroom;

import com.ra.model.entity.Classroom;
import com.ra.repository.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImp implements ClassRoomService{
    @Autowired
    private ClassRoomRepository classRoomRepository;
    @Override
    public List<Classroom> getAll() {
        return classRoomRepository.findAll();
    }

    @Override
    public Classroom save(Classroom classroom) {
        return classRoomRepository.save(classroom);
    }

    @Override
    public void delete(Long id) {
        classRoomRepository.deleteById(id);
    }

    @Override
    public Classroom findById(Long id) {
        return classRoomRepository.findById(id).orElse(null);
    }
}
