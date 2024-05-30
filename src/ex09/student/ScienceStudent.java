package ex09.student;

public class ScienceStudent implements Student{

    @Override
    public void doHomeWork() {
        System.out.println("과학 숙제를 합니다.");
    }

    @Override
    public boolean isSameWork(HomeworkType homeworkType) {

        return HomeworkType.SCIENCE.equals(homeworkType);
    }
}
