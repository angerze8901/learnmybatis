package model;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016Äê6ÔÂ23ÈÕ
 * @version: V1.0
 */
public class Teacher
{
    private int id;

    private String name;

    public Teacher(final int id, final String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    public Teacher()
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

    @Override
    public String toString()
    {
        return "Teacher [id=" + id + ", name=" + name + "]";
    }
}
