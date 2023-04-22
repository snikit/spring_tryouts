package me.snikit.tryouts.mapper.impl;

import me.snikit.tryouts.dto.EmployeeDTO;
import me.snikit.tryouts.entity.Employee;
import me.snikit.tryouts.mapper.EmployeeMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public Employee asEntity(EmployeeDTO dto) {
        return new Employee(dto.getId(), dto.getName(), dto.getDept(), dto.getSalary());
    }

    @Override
    public EmployeeDTO asDTO(Employee entity) {
        return new EmployeeDTO(entity.getId(), entity.getName(), entity.getDept(), entity.getSalary());
    }

    @Override
    public List<Employee> asEntityList(List<EmployeeDTO> dtoList) {
        return dtoList.stream().map(this::asEntity).collect(Collectors.toList());
    }

    @Override
    public List<EmployeeDTO> asDTOList(List<Employee> entityList) {
        return entityList.stream().map(this::asDTO).collect(Collectors.toList());
    }
}
