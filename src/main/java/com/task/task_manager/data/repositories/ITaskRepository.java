package com.task.task_manager.data.repositories;

import com.task.task_manager.data.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<Task, Long> {
}
