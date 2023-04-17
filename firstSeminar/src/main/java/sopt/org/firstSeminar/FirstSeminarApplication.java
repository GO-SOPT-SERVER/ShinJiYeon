package sopt.org.firstSeminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.firstSeminar.Inheritance.Animal;
import sopt.org.firstSeminar.Inheritance.Cat;

@SpringBootApplication
public class FirstSeminarApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSeminarApplication.class, args);

		Animal animal = new Cat("여자", 3, 6);
		animal.eat("우유");  //자식클래스 Cat의 eat() 호출
		//animal.superTest();   상위클래스에서 하위클래스의 함수 알 수 없다!
	}
}
