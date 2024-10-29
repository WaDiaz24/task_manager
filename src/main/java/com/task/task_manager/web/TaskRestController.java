package com.task.task_manager.web;

import com.task.task_manager.data.entities.Task;
import com.task.task_manager.service.ITaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/api/task")
public class TaskRestController {

    private final ITaskService taskService;

    @GetMapping("/list")
    public ResponseEntity<List<Task>> listTasks(){
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping("/save")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(taskService.saveTask(task));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        if (taskService.deleteTask(id)){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
