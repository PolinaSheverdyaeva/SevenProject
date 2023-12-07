package qagroup2;

import org.junit.Assert;

import java.util.List;

//@repository("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void createEmployee(Employee e) throws AppServiceException {

        if (e.getName().equals("John Smith")) {
            throw new AppServiceException("Employee exists");
        }
        System.out.println("Employee created: " + e.getName());

//        Assert.assertEquals(1, 0);
//
//            //employeeDao.createEmployee(e);
//            throw new AppServiceException("Employee exists");

    }

    @Override
    public List<Employee> findEmployeeByName(String name) {
        return null;
    }

    @Override
    public void updateEmployee(Employee e) {

//        throw new OutOfMemoryError("Out of memory");

    }

    @Override
    public void deleteEmployee(long id) {

    }
}
