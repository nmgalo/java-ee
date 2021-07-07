package ge.edu.btu.taskmanager.service.impl;

import ge.edu.btu.taskmanager.dto.tasks.*;
import ge.edu.btu.taskmanager.model.Task;
import ge.edu.btu.taskmanager.repository.TaskRepository;
import ge.edu.btu.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTasksOutput getTasks(GetTasksInput getTasksInput) {
        List<TaskDTO> tasks = new ArrayList<>();

        for (Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setId(task.getId());
            taskDTO.setTitle(task.getTitle());
            taskDTO.setDescription(task.getDescription());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setEndDate(task.getEndDate());
            tasks.add(taskDTO);
        }

        GetTasksOutput getTasksOutput = new GetTasksOutput();
        getTasksOutput.setTasks(tasks);
        return getTasksOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        task.setDescription(addTaskInput.getDescription());
        task.setStartDate(addTaskInput.getStartDate());
        task.setEndDate(addTaskInput.getEndDate());
        taskRepository.save(task);
        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMessage("Task Added Successfully.");
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        taskRepository.deleteById(deleteTaskInput.getId());
        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMessage("Task Deleted Successfully.");
        return deleteTaskOutput;
    }
}
