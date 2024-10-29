package com.task.task_manager.service;

import com.task.task_manager.data.entities.Task;
import com.task.task_manager.data.repositories.ITaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskService implements ITaskService {

    private final ITaskRepository iTaskRepository;

    @Override
    public List<Task> getAllTasks() {
        return iTaskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return iTaskRepository.save(task);
    }

    @Override
    public Boolean deleteTask(Long id) {
        if (iTaskRepository.existsById(id)){
            iTaskRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
