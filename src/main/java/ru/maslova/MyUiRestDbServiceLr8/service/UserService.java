package ru.maslova.MyUiRestDbServiceLr8.service;

import org.springframework.stereotype.Service;
import ru.maslova.MyUiRestDbServiceLr8.dto.UserDto;
import ru.maslova.MyUiRestDbServiceLr8.entity.User;

import java.util.List;
@Service
public interface UserService {
    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}
