package sopt.org.firstSeminar.Inheritance;

public class Animal {
    private String gender;
    private int age;
    private int weight;

    public Animal(String gender, int age, int weight) {
        //내부 생성자 호출로 중복 제거
        this(gender, age);
        this.weight = weight;
    }

    public Animal(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void walk() {
        System.out.println("동물이 걷습니다.");
    }

    public void eat(String food) {
        System.out.println("동물이 "+ food + "를 먹습니다.");
    }
}
