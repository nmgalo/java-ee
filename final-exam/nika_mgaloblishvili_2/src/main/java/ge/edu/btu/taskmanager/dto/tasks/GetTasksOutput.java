package ge.edu.btu.taskmanager.dto.tasks;

import lombok.Data;

import java.util.List;

@Data
public class GetTasksOutput {
    private List<TaskDTO> tasks;
}
