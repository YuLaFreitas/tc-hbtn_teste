import java.time.LocalDate;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private int bithDate;
    private boolean anotherCompanyOwner = false;
    private boolean Pensioner = false;
    private boolean PublicServer = false;
    float salary;

    public Person(){}

    public Person(String name, String surname, int birthdate, boolean anotherCompanyOwner, boolean pensioner,
                  boolean publicServer) {
        super();

        this.name = name;
        this.surname = surname;
        this.bithDate = birthdate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        Pensioner = pensioner;
        PublicServer = publicServer;
    }

    public String fullname(){
        return String.format("%s %s", this.name, this.surname);
    }

    public float calculateYearlySalary(){
        return getSalary() * 12;
    }

    public boolean isMEI(){
        LocalDate current_date = LocalDate.now();

        return (getSalary() *12 < 130000) &&
                (current_date.getYear() - getBithDate()>18) &&
                isAnotherCompanyOwner() == false &&
                isPensioner() == false &&
                isPublicServer() == false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBithDate() {
        return bithDate;
    }

    public void setBithDate(int bithDate) {
        this.bithDate = bithDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return Pensioner;
    }

    public void setPensioner(boolean pensioner) {
        Pensioner = pensioner;
    }

    public boolean isPublicServer() {
        return PublicServer;
    }

    public void setPublicServer(boolean publicServer) {
        PublicServer = publicServer;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
