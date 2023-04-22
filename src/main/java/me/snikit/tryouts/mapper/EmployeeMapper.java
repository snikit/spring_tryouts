package me.snikit.tryouts.mapper;

import me.snikit.tryouts.dto.EmployeeDTO;
import me.snikit.tryouts.entity.Employee;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;

//@Mapper(componentModel = "spring")
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeDTO> {
//    @Override
//    @Mapping(target = "id", ignore = true)
//    Employee asEntity(EmployeeDTO dto);
}