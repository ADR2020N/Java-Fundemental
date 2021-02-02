
public class OjaectArray {

    public static void main(String[] args) {
        Students s1 = new Students(1201, "Aline");
        Students s2 = new Students(1202, "Soso");
        Students s3 = new Students(1203, "Yve");

        //Students[] stud = {s1,s2,s3};
        Students[] stud = new Students[3];
        stud[0]=s1;
        stud [1]=s2;
        stud[2]=s3;
        for (Students s : stud) {
            System.out.println(s);
        }

    }

}
