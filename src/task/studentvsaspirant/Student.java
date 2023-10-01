package task.studentvsaspirant;

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

    static class Aspirant extends Student{
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
}
