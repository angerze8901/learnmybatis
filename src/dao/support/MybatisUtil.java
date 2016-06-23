package dao.support;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月16日
 * @version: V1.0
 */
public class MybatisUtil
{
    //返回session
    public static SqlSession openSqlSession()
    {
        String resource = "conf.xml";

        InputStream is = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();
        //貌似可有可无
        session.commit();
        return session;
    }

}
