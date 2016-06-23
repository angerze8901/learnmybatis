/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月22日
 * @version: V1.0
 */
public class Test1
{

    /**
     * @Description:
     * @author:wangze
     * @CreateDate: 2016年6月14日
     * @version: V1.0
     */

    /**
     * xml方式测试
     */
    //设置日志
    //        Logger logger = Logger.getLogger(Test.class);
    //        Logger loger = Logger.getLogger(Test.class);
    //        String resource = "conf.xml";
    //        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
    //        System.out.println(is);
    //        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
    //        SqlSession session = factory.openSession();
    //
    //    String statement = "mybatis.userMapper.selectAllUsers";
    //        User user = session.selectOne(statement, 2);
    //        User user = new User();

    //        user = user.getUserById(2);
    //        System.out.println(user);
    //    List<User> tuser = MybatisUtil.openSqlSession().selectList(statement);
    //        int duser = MybatisUtil.openSqlSession().delete(statement, 7);
    //        MybatisUtil.openSqlSession().close();
    //        logger.info(tuser);
    //        System.out.println(tuser);
    //查询全部的users
    //        List<Object> users = MybatisUtil.openSqlSession().selectList(statement);
    //        MybatisUtil.openSqlSession().close();
    //        System.out.println(users);
    /**
     * 注解方式测试
     */
    //        UserMapperDe mapper = MybatisUtil.openSqlSession().getMapper(UserMapperDe.class);
    //        List<User> inuser = mapper.getAllUser();
    //        MybatisUtil.openSqlSession().close();
    //        System.out.println(inuser);

}
