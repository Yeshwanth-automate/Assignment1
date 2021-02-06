

public class Employee {
    private  int employeeid;
    private  int salary;
    private  int age;
    private  String name;

    @Override
    public String toString() {
        return "name: " +name+ "  id"+employeeid+ "  salary"+salary+ "  age"+age;
    }

 static int j=1;
    public Employee( int salary, int age, String name) {

        this.employeeid = j++;
        this.salary = salary;
        this.age = age;
        this.name = name;

    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void update(String name, int salary, int age ) {
        this.salary = salary;
        this.age = age;
        this.name = name;

    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public int getEmployeeId(){
        return employeeid;
    }
}


