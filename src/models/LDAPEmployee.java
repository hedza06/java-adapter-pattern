package models;

/**
 * Employee from LDAP source
 */
public class LDAPEmployee {

    private Integer cn;
    private String givenName;
    private String surname;
    private String mail;

    public LDAPEmployee(Integer cn, String givenName, String surname, String mail)
    {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public Integer getCn() {
        return cn;
    }

    public void setCn(Integer cn) {
        this.cn = cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString()
    {
        return "LDAPEmployee{" +
                "cn=" + cn +
                ", givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
