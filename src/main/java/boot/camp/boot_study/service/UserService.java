package boot.camp.boot_study.service;

import boot.camp.boot_study.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional
public class UserService {


    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public ArrayList<HashMap<String, Object>> findAll() {
        return userMapper.findAll();
    }
}