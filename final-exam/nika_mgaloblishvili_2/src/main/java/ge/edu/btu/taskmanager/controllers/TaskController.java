package ge.edu.btu.taskmanager.controllers;

import ge.edu.btu.taskmanager.dto.tasks.*;
import ge.edu.btu.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/get-tasks")
    public GetTasksOutput getTasks(@RequestBody GetTasksInput getTasksInput) {
        return taskService.getTasks(getTasksInput);
    }

    @PostMapping("/add-task")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @DeleteMapping("/delete-task")
    public DeleteTaskOutput deleteTask(@RequestBody DeleteTaskInput deleteTaskInput) {
        return taskService.deleteTask(deleteTaskInput);
    }
}
