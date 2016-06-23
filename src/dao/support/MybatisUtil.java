package dao.support;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��16��
 * @version: V1.0
 */
public class MybatisUtil
{
    //����session
    public static SqlSession openSqlSession()
    {
        String resource = "conf.xml";

        InputStream is = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = factory.openSession();
        //ò�ƿ��п���
        session.commit();
        return session;
    }

}
