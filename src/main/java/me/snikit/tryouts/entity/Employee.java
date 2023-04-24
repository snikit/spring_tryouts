package me.snikit.tryouts.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dept;
    private Double salary;

    @OneToMany(mappedBy = "manager")
    @ToString.Exclude
    private Set<Employee> subordinates = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    public Employee(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(salary, employee.salary) && Objects.equals(subordinates, employee.subordinates) && Objects.equals(manager, employee.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, salary, subordinates, manager);
    }
}
