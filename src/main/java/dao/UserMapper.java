package  dao;
import entity.User;

import java.util.List;

public interface UserMapper {

    int queryCount();

    List<User> queryAll();

}
