package ex10_command_pattern;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. 사용자 입력 받기
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        // 2. 입력에 따른 버튼 생성
        ButtonFacotory facotory = ButtonFacotory.getInstance();
        Button button = facotory.createButton(command);

        // 3. 커맨드 패턴이 적용된 메서드
        button.press();
    }
}
