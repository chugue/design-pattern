package ex09.student;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDelegator {
    private final List<Student> students = new ArrayList<>();

    // 작업을 위임하기 위해 미리 정의된 학생들을 추가
    public HomeworkDelegator() {
        students.add(new MathStudent());
        students.add(new ScienceStudent());
    }

    public void delegateHomework(HomeworkType type){
        students.stream().filter(student -> student.isSameWork(HomeworkType.MATH))
                .forEach(student -> student.doHomeWork());
    }
}
