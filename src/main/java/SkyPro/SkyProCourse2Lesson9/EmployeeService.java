package SkyPro.SkyProCourse2Lesson9;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.MAX_VALUE;

@Service
public class EmployeeService {
    List<Employee> arr = new ArrayList<>();

    public String getMaxDepartmentSalary(int department) {
        Employee maxSalary = new Employee("Nothing", department, 0);
        for (Employee employee : arr) {
            if (employee.getSalaryInfo() > maxSalary.getSalaryInfo()) {
                maxSalary = employee;
            }
        }
        return maxSalary.toString();
    }

    public String getMinDepartmentSalary(int department) {
        Employee minSalary = new Employee("Nothing", department, MAX_VALUE);
        for (Employee employee : arr) {
            if (employee.getSalaryInfo() < minSalary.getSalaryInfo()) {
                minSalary = employee;
            }
        }
        return minSalary.toString();
    }


    public String getAllDepartmentEmployee(int department) {
        String message ="Сотрудники отдела " + department + ": <br>";
        for (Employee employee : arr) {
            if (employee.getDepartment() == department) {
                message += employee.toString() + "; <br>";
            }
        }
        return message;
    }

    public String getAllEmployeers() {
        String message = "";
        for ( int i = 1; i < 6; i++) {
            message += "Сотрудники отдела " + i + ": <br>";
            for ( Employee employee : arr) {
                if (employee.getDepartment() == i) {
                    message += employee.toString();
                }
            }
        }
        return message;
    }
}
// Ща попытаемся обновить со стримами
