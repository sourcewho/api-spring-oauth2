package source.springoauth2.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.springoauth2.dtos.UserRequestBodyDTO;
import source.springoauth2.dtos.UserResponseBodyDTO;
import source.springoauth2.entities.UserEntity;
import source.springoauth2.repositories.IUsersRepository;

@Service
public class UsersService {
    @Autowired
    private IUsersRepository repository;

    @Transactional
    public UserResponseBodyDTO save(UserRequestBodyDTO requestBodyDTO) {
        var userEntity = new UserEntity();

        BeanUtils.copyProperties(requestBodyDTO, userEntity);

        try {
            var userResponseBodyDTO = new UserResponseBodyDTO();

            var responseEntity = repository.save(userEntity);

            BeanUtils.copyProperties(responseEntity, userResponseBodyDTO);

            return userResponseBodyDTO;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
