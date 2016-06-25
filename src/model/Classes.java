package model;

import java.util.List;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016��6��23��
 * @version: V1.0
 */
public class Classes
{
    private int id;

    private String name;

    private Teacher teacher;

    private List<Student> students;

    //    public Classes(final int id, final String name, final Teacher teacher)
    //    {
    //        super();
    //        this.id = id;
    //        this.name = name;
    //        this.teacher = teacher;
    //    }

    public Classes(final int id, final String name, final Teacher teacher, final List<Student> students)
    {
        super();
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void setStudents(final List<Student> students)
    {
        this.students = students;
    }

    public Classes()
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

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(final Teacher teacher)
    {
        this.teacher = teacher;
    }

    @Override
    public String toString()
    {
        return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
    }
}
