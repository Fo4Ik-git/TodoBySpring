package com.fo4ik.todolist.repo;

import com.fo4ik.todolist.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Item, Long> {

}
