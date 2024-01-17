package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX){
        System.out.println("dataX=" +dataX);
        // 참조값을 복사해서 들고오기 때문에 값이 바뀜
        dataX.value = 20;
    }
}
