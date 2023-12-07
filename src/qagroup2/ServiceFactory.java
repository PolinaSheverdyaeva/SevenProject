package qagroup2;

public class ServiceFactory {

    private static EmployeeService employeeService;

    public static synchronized EmployeeService getEmployeeService() {
        if (employeeService == null)
            employeeService = new EmployeeServiceImpl();
        return employeeService;
    }
}
