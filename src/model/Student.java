package model;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月25日
 * @version: V1.0
 */
public class Student
{
    private int id;

    private String name;

    public Student()
    {
        super();
    }

    public Student(final int id, final String name)
    {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + "]";
    }

}
