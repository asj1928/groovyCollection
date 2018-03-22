class Q22 {
     static void main(String[] args) {
        List<Employee1> list=[]
        list<<new Employee1(name: "Aemployee1",age: 40,departmentName: "computers",employeeNumber: 100,salary: 10000)
        list<<new Employee1(name: "Bemployee2",age: 23,departmentName: "accounts",employeeNumber: 101,salary: 1000)
        list<<new Employee1(name: "Cemployee3",age: 26,departmentName: "marketing",employeeNumber: 120,salary: 10000)
        list<<new Employee1(name: "Demployee4",age: 25,departmentName: "support",employeeNumber: 102,salary: 5000)
        list<<new Employee1(name: "Eemployee5",age: 55,departmentName: "computers",employeeNumber: 200,salary: 6000)
        list<<new Employee1(name: "Femployee6",age: 27,departmentName: "accounts",employeeNumber: 130,salary: 12000)
        list<<new Employee1(name: "Aemployee7",age: 17,departmentName: "support",employeeNumber: 103,salary: 10300)
        list<<new Employee1(name: "Bemployee8",age: 18,departmentName: "marketing",employeeNumber: 104,salary: 60000)
        list<<new Employee1(name: "Cemployee9",age: 25,departmentName: "accounts",employeeNumber: 105,salary: 12000)
        list<<new Employee1(name: "Demployee10",age: 20,departmentName: "computers",employeeNumber: 150,salary: 10020)
        list<<new Employee1(name: "Eemployee11",age: 19,departmentName: "marketing",employeeNumber: 160,salary: 100)
        list<<new Employee1(name: "Femployee12",age: 45,departmentName: "accounts",employeeNumber: 106,salary: 18000)





         println("------------------------------------------------------------------")

         def map=list.groupBy({it.departmentName})
        println(map)
        println("------------------------------------------------------------------")

        map.each {


           List p   = it.value
            println("department = ${it.key} with ${p.size()} employees")
        }

        println("------------------------------------------------------------------")

        def range=18..35
       def a= list.findAll{
            it.age in range
        }
       a.each { println "${it.name } age= ${it.age} "}
        println("------------------------------------------------------------------")
         println("ag above 25 and grouped by initial letter of name")

        def b=list.findAll{ it.age>25}
         b=b.groupBy({it.name.charAt(0)})
         println(b)
         def slab1=0..5000
         def slab2=5001..10000
         def slab3=10000..100000
         List slab=[]
         slab<<slab1<<slab2<<slab3
         
        // println(ex)

    }
}
class Employee1{
    String name
    Integer age
    String departmentName
    Integer  employeeNumber
    Integer  salary


    @Override
    public String toString() {
        return "name: $name | age: $age"
    }
}
