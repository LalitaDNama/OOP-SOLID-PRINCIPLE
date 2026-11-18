package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }
    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", professors=" + professors +
                '}';
    }
}