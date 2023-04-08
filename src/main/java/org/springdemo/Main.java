package org.springdemo;


import org.springdemo.autowiriing.EmployeeAutowiring;
import org.springdemo.collections.Employee;
import org.springdemo.constructorInjection.Addition;
import org.springdemo.constructorInjection.Person;
import org.springdemo.reference.lifecycle.ColdDrink;
import org.springdemo.reference.lifecycle.Samosa;
import org.springdemo.reference.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 *
 *
 * @author vipin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        Student student3 = (Student) context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        Employee employee1= (Employee) context.getBean("employee1");
        System.out.println(employee1);
        //reference kese use krte hai wo dekhna hai
        ApplicationContext context2 = new ClassPathXmlApplicationContext("referenceConfig.xml");
        A tmp = (A) context2.getBean("aref");
        System.out.println(tmp.getX());
        System.out.println(tmp.getObj().getY());

        System.out.println(tmp);

        //reference kese use krte hai wo dekhna hai
        A tmp2 = (A) context2.getBean("aref2");

//        contructor argument wala bean banana hai
        ApplicationContext context3 = new ClassPathXmlApplicationContext("constructorInjection.xml");
        Person p = (Person) context3.getBean("person");
        System.out.println(p);

        //overloaded constructor example
        //ambiguity problem solver wala question
        Addition a = (Addition) context3.getBean("add");
        a.doSum();


        System.out.println("###########################lifecycle of samosa using xml###################################");
        //lifecycle banane wala ek bean banana hai
        AbstractApplicationContext context4 = new ClassPathXmlApplicationContext("lifecycle.xml");
        Samosa s = (Samosa) context4.getBean("s1");
        System.out.println(s);
        context4.registerShutdownHook();


        System.out.println("###########################lifecycle of colddrink using interfaces###################################");
        ///lifecycle of colddrink using interfaces
        AbstractApplicationContext context5 = new ClassPathXmlApplicationContext("lifecycle.xml");
        ColdDrink c = (ColdDrink) context5.getBean("pepsi");
        System.out.println(c);


        System.out.println("###########################autowiring using xml ki kahani###################################");
        AbstractApplicationContext autowiringcontext = new ClassPathXmlApplicationContext("autowiring.xml");
        EmployeeAutowiring employeeAutowiring = (EmployeeAutowiring) autowiringcontext.getBean("employee");
        System.out.println(employeeAutowiring);







    }
}