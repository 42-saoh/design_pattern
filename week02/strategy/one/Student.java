package strategy.one;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList = new ArrayList<>();
    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score, int majorCode) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (Subject subject : subjectList) {
            System.out.println("학생 " + studentName + "의 " + subject.getName() + " 과목 성적은 "
                    + subject.getScorePoint() + "점 이고, 학점은 "
                    + subject.getGrade() + "입니다.");
        }
    }
}
