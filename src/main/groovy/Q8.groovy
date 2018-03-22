class Q8 {
    static void main(String[] args) {
        List<Employee> list=[]
        list.add(new Employee("emp1",22, 20000.00 as Double))
        list.add(new Employee("emp2",25, 26000.00 as Double))
        list.add(new Employee("emp3",23, 2600.0 as Double))
        list.add(new Employee("emp4",24, 2000.0 as Double))
        list.add(new Employee("emp5",26, 6000.0 as Double))
        list.add(new Employee("emp6",27, 2650.0 as Double))
        list.add(new Employee("emp7",28, 6600.0 as Double))
        list.add(new Employee("emp8",29, 7000.0 as Double))
        list.add(new Employee("emp9",31, 8000.0 as Double))
        list.add(new Employee("emp10",21, 1000.0 as Double))


        List<Employee> p=[]
        p<<list.findAll {it.salary>5000.00}
        p.each {
            println(p.name)
        }
        p=[]
        p<<list.min {it.age}
        println("min age "+p.name +" : "+p.age)
        p=[]
        p<<list.max{it.salary}
        println("max salary "+p.name+" : "+p.salary)

        list.each {
            println(it.name)
        }


    }





}

class Employee{
    String name
    Integer age
    Double salary

    Employee(String name, Integer age, Double salary) {
        this.name = name
        this.age = age
        this.salary = salary
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
