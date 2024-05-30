package ex09.student;

public class HistoryStudent implements Student{

    @Override
    public void doHomeWork() {
        System.out.println("역사 숙제를 합니다.");
    }

    @Override
    public boolean isSameWork(HomeworkType homeworkType) {

        return HomeworkType.HISTORY.equals(homeworkType);
    }
}
