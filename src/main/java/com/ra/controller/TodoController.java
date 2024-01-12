package com.ra.controller;

import com.ra.model.entity.Todo;
import com.ra.service.todo.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todos")
@CrossOrigin
public class TodoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping("")
    public ResponseEntity<List<Todo>> getAll(){
        List<Todo> todos= toDoService.getAll();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Todo> save(@RequestBody Todo todo){
        Todo todoNew = toDoService.save(todo);
        return new ResponseEntity<>(todoNew,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getById(@PathVariable Long id){
        Todo todo=toDoService.findById(id);
        return new ResponseEntity<>(todo,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@RequestBody Todo todo){
        Todo todoUpdate=toDoService.save(todo);
        return new ResponseEntity<>(todoUpdate,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        toDoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
