package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);

    }
    public static void soundAnimal(AbstractAnimal anmial){
        System.out.println("동물 소리 테스트 시작");
        anmial.sound();
        System.out.println("동물 소리 테스트 시작");
    }

    public static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
