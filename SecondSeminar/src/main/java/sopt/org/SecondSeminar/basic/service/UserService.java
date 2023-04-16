package sopt.org.SecondSeminar.basic.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.basic.controller.user.dto.request.RegisterRequestDto;
import sopt.org.SecondSeminar.basic.domain.user.User;

import static sopt.org.SecondSeminar.SecondSeminarApplication.userList;

@Service
public class UserService {
    public Long register(RegisterRequestDto request) {

        User newUser = new User(
                request.getGender(),
                request.getName(),
                request.getContact(),
                request.getAge());

        userList.add(newUser);
        newUser.setId((long) userList.size());

        return newUser.getId();
    }
}
