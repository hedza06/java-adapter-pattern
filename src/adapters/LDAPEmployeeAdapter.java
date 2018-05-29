package adapters;

import models.Employee;
import models.LDAPEmployee;

/**
 * LDAP Employee Adapter
 */
public class LDAPEmployeeAdapter implements Employee {

    private LDAPEmployee ldapEmployee;

    public LDAPEmployeeAdapter(LDAPEmployee ldapEmployee) {
        this.ldapEmployee = ldapEmployee;
    }

    @Override
    public Integer getId() {
        return ldapEmployee.getCn();
    }

    @Override
    public String getFirstName() {
        return ldapEmployee.getGivenName();
    }

    @Override
    public String getLastName() {
        return ldapEmployee.getSurname();
    }

    @Override
    public String getEmail() {
        return ldapEmployee.getMail();
    }

    @Override
    public String toString()
    {
        return "LDAPEmployeeAdapter{" +
                "ldapEmployee=" + ldapEmployee +
                '}';
    }
}
