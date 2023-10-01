package task.studentvsaspirant;

import java.util.Scanner;

public class StudentMain {
    public class Main{
        public void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите количество студентов: ");
            int nos = scanner.nextInt();

            Student[] students = new Student[nos];

            for(int i=0; i<nos; i++){
                System.out.println("Введите данные студента номер " + (i+1));
                System.out.println("Введите имя: ");
                String firstName = scanner.next();
                System.out.println("Введите фамилию: ");
                String lastName = scanner.next();
                System.out.println("Введите группу: ");
                String group = scanner.next();
                System.out.println("Введите среднюю оценку: ");
                double averageMark = scanner.nextDouble();

                System.out.println("Этот студент является аспирантом? (да/нет): ");
                String isAspirant = scanner.next();

                if(isAspirant.equalsIgnoreCase("да")){
                    System.out.println("Введите название научной работы: ");
                    String work = scanner.next();
                    students[i] = new Student.Aspirant(firstName, lastName, group, averageMark, work);
                }
                else{
                    students[i] = new Student(firstName, lastName, group, averageMark);
                }
            }
            System.out.println("\nСтипендии:");

            for(Student student : students){
                System.out.println("Стипендия для " + student.getFirstName() + " " + student.getLastName() + " " + student.getScholarship() + " грн");
            }
        }
    }
}
