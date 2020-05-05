package com.ldy;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
//保证线程安全
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory= null;
    public static SqlSession getSqlSession() throws IOException {
        if (sqlSessionFactory == null){
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            //2.通过上一步创建SqlSessionFactory
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        return sqlSessionFactory.openSession();
    }
}
