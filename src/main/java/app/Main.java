package app;

import app.entities.User;
import app.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("MyBatis Hello World start!");

        // читаем файл с настройками
        Reader reader = Resources.getResourceAsReader("mybatis-config");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //создаем мапер, методы которогор будем вызывать
        UserMapper userMapper = factory.openSession().getMapper(UserMapper.class);

        User user = userMapper.getUserById(2);
        List<User> users = userMapper.getUsers();
        System.out.println(user);
    }
}
