package task.studentvsaspirant;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getGroup(){
        return group;
    }

    public double getAverageMark(){
        return averageMark;
    }

    public int getScholarship(){
        if(averageMark==5.0){
            return 2000;
        }
        else{
            return 1900;
        }
    }

    class Aspirant extends Student{
        private String work;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String work){
            super(firstName, lastName, group, averageMark);
            this.work = work;
        }

        @Override
        public int getScholarship(){
            if(getAverageMark()==5.0){
                return 2500;
            }
            else{
                return 2200;
            }
        }
    }

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
                    students[i] = new Aspirant(firstName, lastName, group, averageMark, work);
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
