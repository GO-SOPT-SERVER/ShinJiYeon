package sopt.org.ThirdSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.ThirdSeminar.controller.user.dto.request.UserRequestDto;
import sopt.org.ThirdSeminar.controller.user.dto.response.UserResponseDto;
import sopt.org.ThirdSeminar.domain.User;
import sopt.org.ThirdSeminar.exception.BusinessException;
import sopt.org.ThirdSeminar.exception.ErrorStatus;
import sopt.org.ThirdSeminar.infrastructure.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto create(UserRequestDto request) {
        User user = User.builder()
                .email(request.getEmail())
                .nickname(request.getNickname())
                .password(request.getPassword())
                .build();

        userRepository.save(user);

        return UserResponseDto.of(user.getId(), user.getNickname());
    }

    public User findUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new BusinessException(ErrorStatus.USER_NOT_FOUND));
    }
}