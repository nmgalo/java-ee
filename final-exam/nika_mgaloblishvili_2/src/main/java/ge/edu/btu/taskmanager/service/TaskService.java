package ge.edu.btu.taskmanager.service;

import ge.edu.btu.taskmanager.dto.tasks.*;

public interface TaskService {

    GetTasksOutput getTasks(GetTasksInput getTasksInput);

    AddTaskOutput addTask(AddTaskInput addTaskInput);

    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);

}
