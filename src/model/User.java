package model;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月14日
 * @version: V1.0
 */

public class User
{
    private int id;

    private String name;

    private int age;

    public User(final int id, final String name, final int age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User()
    {
        super();
    }

    //读取文件的方法
    //    public User getUserById(final int id)
    //    {
    //        String resource = "conf.xml";
    //        InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
    //        //        System.out.println(is);
    //        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
    //        SqlSession session = factory.openSession();
    //        String URI = "mybatis.userMapper";
    //        User user = session.selectOne(URI + ".selectUser", id);
    //        return user;
    //
    //    }

    public int getId()
    {
        return id;
    }

    public void setId(final int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}