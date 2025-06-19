class Students {
    int id;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.id = 1;
        s1.name = "Hari";
        s1.marks = 45;

        Students s2 = new Students();
        s2.id = 2;
        s2.name = "Hari";
        s2.marks = 80;

        Students s3 = new Students();
        s3.id = 3;
        s3.name = "Hari";
        s3.marks = 91;

        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        System.out.println("Id " + "Name " + "Marks");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].id + " " + student[i].name + " " + student[i].marks);
        }

        // ForEach loop or Enhanced For Loop
        for (Students n : student) {
            System.out.println(n.id + " " + n.name + " " + n.marks);
        }
    }
}
