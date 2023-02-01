package strategy.one;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100, 0);
        studentLee.addSubject("수학", 100, 1);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 55, 1);
        studentKim.addSubject("수학", 55, 0);
        studentKim.addSubject("영어", 100, 0);
        studentLee.showGradeInfo();
        System.out.println("======================================");
        studentKim.showGradeInfo();
    }
}
