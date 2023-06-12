package qagroup2;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Client {

    //@autowired("employeeService")
//    EmployeeService eservice;

    public static void main(String[] args) {

        //String name = "J"+"o"+"h"+"n";
//        StringBuilder sb = new StringBuilder();
//        sb.append("J");
//        sb.append("o");
//        sb.append("h");
//        sb.append("n");
//        String name = sb.toString();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.FEBRUARY, 1,0,0,0);
        String res = sdf.format(cal.getTime());
        System.out.println(res);

//        final EmployeeService es = ServiceFactory.getEmployeeService();
//        Employee e = new Employee("John Doe", 35, 10000f, "M");
//        try {
//            es.createEmployee(e);
//        } catch(AppServiceException ex) {
//            ex.printStackTrace();
//        }
//
//        try {
//            es.updateEmployee(e);
//        } catch(Throwable ex) {
//            System.out.println("A technical problem happened!");
//            ex.printStackTrace();
//        } finally {
//            try {
//                System.out.println("We have done our cleanup!");
//            } catch(Throwable ex2) {}
//        }
    }

}
