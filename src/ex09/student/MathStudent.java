package ex09.student;

public class MathStudent implements Student{

    @Override
    public void doHomeWork() {
        System.out.println("수학 숙제를 합니다.");
    }

    @Override
    public boolean isSameWork(HomeworkType homeworkType) {
        return HomeworkType.MATH.equals(homeworkType);
    }
}
