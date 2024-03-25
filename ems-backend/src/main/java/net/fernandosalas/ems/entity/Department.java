package net.fernandosalas.ems.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name")
    private String department;

    @Column(name = "department_description")
    private String departmentDescription;

    public void setDepartmentDescription(String departmentDescription) {
    }

    public void setDepartmentName(String departmentName) {
    }

    public Object getId() {
    }

    public Object getDepartmentName() {
    }

    public Object getDepartmentDescription() {
    }
}
