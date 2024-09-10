import java.util.*;

class student {
    int roll;
    String name;
    int marks;
}

public class obj_arr {
    public static void main(String[] args) {

        student s1 = new student();
        s1.marks = 23;
        s1.name = "Manik";
        s1.roll = 1;

        student s2 = new student();
        s2.marks = 99;
        s2.name = "Vish";
        s2.roll = 2;

        student s3 = new student();
        s3.marks = 92;
        s3.name = "Shail";
        s3.roll = 3;

        // Create an array of student objects and assign the objects to the array
        student[] stu = new student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        // Loop through the array and print the name and marks of each student
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].name + " : " + stu[i].marks);
        }
    }
}
