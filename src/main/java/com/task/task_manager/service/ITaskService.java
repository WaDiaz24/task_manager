package com.task.task_manager.service;

import com.task.task_manager.data.entities.Task;

import java.util.List;

public interface ITaskService {

    public List<Task> getAllTasks();

    public Task saveTask(Task task);

    public Boolean deleteTask(Long id);
}
