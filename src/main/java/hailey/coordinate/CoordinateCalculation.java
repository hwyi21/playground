package hailey.coordinate;

import java.util.Scanner;

public class CoordinateCalculation {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        System.out.println("좌표값은 모두 최대 24까지 입력가능합니다.");
        System.out.println("좌표 정보는 괄호(,)로 둘러쌓여 있으며 쉼표(,)로 x값과 y값을 구분하며 좌표값과 좌표값 사이는 '-' 문자로 구분합니다.");
        String coordinates = scanner.nextLine();
    }
}
