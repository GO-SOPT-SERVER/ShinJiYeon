package sopt.org.SecondSeminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.SecondSeminar.Advanced.domain.Book;
import sopt.org.SecondSeminar.basic.domain.post.Post;
import sopt.org.SecondSeminar.basic.domain.user.User;

import java.util.ArrayList;

@SpringBootApplication
public class SecondSeminarApplication {

	public static ArrayList<User> userList;
	public static ArrayList<Post> postList;
	public static ArrayList<Book> bookList;

	public static void main(String[] args) {
		SpringApplication.run(SecondSeminarApplication.class, args);

		userList = new ArrayList<>();
		postList = new ArrayList<>();
		bookList = new ArrayList<>();
	}

}
