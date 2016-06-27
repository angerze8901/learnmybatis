package model;

/**
 * @Description:
 * @author:wangze
 * @CreateDate: 2016年6月26日
 * @version: V1.0
 */
public class ConditionUser
{
    private String name;

    private int minAge;

    private int maxAge;

    public ConditionUser(final String name, final int minAge, final int maxAge)
    {
        super();
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public ConditionUser()
    {
        super();
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public int getMinAge()
    {
        return minAge;
    }

    public void setMinAge(final int minAge)
    {
        this.minAge = minAge;
    }

    public int getMaxAge()
    {
        return maxAge;
    }

    public void setMaxAge(final int maxAge)
    {
        this.maxAge = maxAge;
    }

    @Override
    public String toString()
    {
        return "ConditionUser [name=" + name + ", minAge=" + minAge + ", maxAge=" + maxAge + "]";
    }

}
