package qagroup2;

import java.util.List;

public interface EmployeeService {
    //CRUD=Create,Retrieve,Update,Delete
    void createEmployee(Employee e) throws AppServiceException;

    List<Employee> findEmployeeByName(String name);

    void updateEmployee(Employee e);

    void deleteEmployee(long id);
}
