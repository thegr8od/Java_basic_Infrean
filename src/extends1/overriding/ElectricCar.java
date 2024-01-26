package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    // 에노테이션, 개발자들은 무조건 쓴다. 오버라이딩  한지 표시
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void charge(){

        System.out.println("충전합니다.");
    }
}
