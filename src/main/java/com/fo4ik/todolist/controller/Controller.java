package com.fo4ik.todolist.controller;

import com.fo4ik.todolist.model.Item;
import com.fo4ik.todolist.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/todo")
public class Controller {

    @Autowired
    private Repo repo;

    @GetMapping
    public List<Item> findAll() {
        return repo.findAll();
    }

    @PostMapping
    public Item save(@Validated @NonNull @RequestBody Item item) {
        return repo.save(item);
    }

    @PutMapping
    public Item update(@Validated @NonNull @RequestBody Item item) {
        return repo.save(item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
