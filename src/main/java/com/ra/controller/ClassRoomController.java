package com.ra.controller;

import com.ra.model.entity.Classroom;
import com.ra.service.classroom.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class ClassRoomController {
    @Autowired
    private ClassRoomService classRoomService;

    @GetMapping("")
    public ResponseEntity<List<Classroom>> getAll(){
        return new ResponseEntity<>(classRoomService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Classroom> insertClassRoom(@RequestBody Classroom classroom){
        return new ResponseEntity<>(classRoomService.save(classroom),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Classroom> update(@RequestBody Classroom classroom){
        return new ResponseEntity<>(classRoomService.save(classroom),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Classroom> findById(@PathVariable Long id){
        return new ResponseEntity<>(classRoomService.findById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        classRoomService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
