package sopt.org.firstSeminar.Inheritance;

public class Cat extends Animal {

    public Cat(String gender, int age, int weight) {
        //부모 클래스에서 매개변수 있는 생성자 만들어서 기본생성자가 자동으로 호출되지 X
        //-> 부모 생성자 호출해줘야 한다.
        super(gender, age, weight);
    }

    @Override
    public void walk() {
        System.out.println("고양이가 사뿐사뿐 걷습니다.");
    }

    @Override
    public void eat(String food) {
        System.out.println("고양이가 " + food + "를 먹습니다.");
    }

    public void superTest() {
        walk();          //자식클래스의 walk() 실행
        super.walk();    //부모클래스의 walk() 실행
    }
}
