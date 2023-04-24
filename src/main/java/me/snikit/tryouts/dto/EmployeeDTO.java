package me.snikit.tryouts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private String name;
    private String dept;
    private Double salary;
    private Integer managerId;
    private Set<Integer> subordinates;
}
