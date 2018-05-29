import adapters.CSVEmployeeAdapter;
import adapters.LDAPEmployeeAdapter;
import models.CSVEmployee;
import models.DBEmployee;
import models.Employee;
import models.LDAPEmployee;

import java.util.ArrayList;
import java.util.List;

public class AdapterPattern {

    public static void main(String[] args)
    {
        List<Employee> employeeList = getAllEmployees();
        System.out.println(employeeList);
    }

    /**
     * Method for getting list of all employees
     *
     * @return List<Employee> objects...
     */
    private static List<Employee> getAllEmployees()
    {
        List<Employee> allEmployees = new ArrayList<>();
        DBEmployee dbEmployee = new DBEmployee(
                1,
                "Heril",
                "Muratovic",
                "heril.muratovic@logate.com");
        allEmployees.add(dbEmployee);

        // creating LDAP employee
        LDAPEmployee ldapEmployee = new LDAPEmployee(
                2,
                "Marko",
                "Markovic",
                "marko.markovic@gmail.com");
        allEmployees.add(new LDAPEmployeeAdapter(ldapEmployee));

        // creating CSV employee
        CSVEmployee csvEmployee = new CSVEmployee(
                3,
                "Janko",
                "Jankovic",
                "janko.jankovic@gmail.com");
        allEmployees.add(new CSVEmployeeAdapter(csvEmployee));


        return allEmployees;
    }

}
