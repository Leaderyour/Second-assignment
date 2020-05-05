package com.ldy;

import com.ldy.pojo.Person;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        testFindOrderById();
        /*SqlSession session = MybatisUtils.getSqlSession();
        Person person = session.selectOne("com.ldy.dao.PersonMapper.findPersonById2",2);
        System.out.println(person);
        session.close();*/
    }
    public static void testFindUserById() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        Person person = session.selectOne("com.ldy.dao.PersonMapper.findPersonById2",1);
        System.out.println(person);
        session.close();
    }
    public static void testFindUsers() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        List<Person> person = session.selectList("com.ldy.dao.PersonMapper.findPerson");
        System.out.println(person);
        session.close();
    }
    public static void testFindOrderById() throws IOException {
        SqlSession session = MybatisUtils.getSqlSession();
        Object order = session.selectOne("com.ldy.dao.OrderMapper.findOrderById2",1);
        System.out.println(order);
        session.close();

    }
}
