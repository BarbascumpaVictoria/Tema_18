import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mihai", "Management", true, true, true, 29 ));
        employees.add(new Employee("Natalia", "Management", true, false, false, 33 ));
        employees.add(new Employee("Olga", "Management", false, true, true, 28 ));
        employees.add(new Employee("Xenia", "Management", false, false, false, 40 ));
        employees.add(new Employee("Ion", "Management", true, true, true, 32 ));
        employees.add(new Employee("Gabriel", "Software", true, true, true, 33 ));
        employees.add(new Employee("Vasile", "Software", true, false, true, 22 ));
        employees.add(new Employee("Cristina", "Software", false, true, true, 28 ));
        employees.add(new Employee("Marcela", "Software", true, true, true, 31 ));
        employees.add(new Employee("Dorel", "Software", true, true, true, 38 ));

        List<Employee> Sarcina1 = employees.stream()
               .filter(e -> e.getDepartment().equals("Management") && e.getisPayedPerHour() && e.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println(Sarcina1);

        List<String> Sarcina2 = employees.stream()
                .filter(e -> !e.getisPayedPerHour() && e.getAge() > 30)
               .map(Employee::getName)
               .sorted()
                .collect(Collectors.toList());
        System.out.println(Sarcina2);

        Optional<Employee> Sarcina3 = employees.stream()
                .filter(e -> e.getDepartment().equals("Software") && e.canAttendTraining() && e.canConductInterview())
                .findAny();
        System.out.println(Sarcina3);
    }
    }

//     1.	Adăugați clasei Employee, prezentată în cadrul lecției, 2 variabile de instanță - isPayedPerHour și age, de tip boolean și int respectiv.
//            Ajustați constructorul clasei astfel încât să puteți inițializa aceste două variabile de instanță. Creați o listă de angajați.
//            Utilizând stream-uri și expresii lambda afișați la ecran maxim 5 angajați unici care pot conduce interviuri cu vârsta mai mare de 25 de ani,
//            sunt plătiți pe oră și fac parte din departamentul de Management.
//            2.	Creați o listă de angajați de tip Employee (utilizați clasa Employee modificată în sarcina precedentă). Folosind stream-uri și expresii
//            lambda creați o listă care va conține doar numele angajaților în ordine alfabetică care nu sunt plătiți pe oră și au vârsta mai mare de 30 de ani.
//            3.	Creați o listă de angajați de tip Employee (utilizați clasa Employee modificată în sarcina precedentă). Utilizând stream API, găsiți un
//            angajat care poate participa la traininguri, poate conduce interviuri și face parte din departamentul Software.
