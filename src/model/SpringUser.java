package model;

import java.util.Date;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月26日
 * @version: V1.0
 */
public class SpringUser
{
    private int id;

    private String name;

    private Date birthday;

    private double salary;

    public SpringUser(final int id, final String name, final Date birthday, final double salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public SpringUser()
    {
        super();
    }

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

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(final Date birthday)
    {
        this.birthday = birthday;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(final double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "SpringUser [id=" + id + ", name=" + name + ", birthday=" + birthday + ", salary=" + salary + "]";
    }
}
