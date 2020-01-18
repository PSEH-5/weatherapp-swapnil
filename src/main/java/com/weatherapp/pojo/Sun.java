package com.weatherapp.pojo;

public class Sun {
	private String set;

    private String rise;

    public String getSet ()
    {
        return set;
    }

    public void setSet (String set)
    {
        this.set = set;
    }

    public String getRise ()
    {
        return rise;
    }

    public void setRise (String rise)
    {
        this.rise = rise;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [set = "+set+", rise = "+rise+"]";
    }
}
