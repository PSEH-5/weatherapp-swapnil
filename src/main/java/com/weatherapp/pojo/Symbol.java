package com.weatherapp.pojo;

public class Symbol {
	private String number;

    private String var;

    private String name;

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getVar ()
    {
        return var;
    }

    public void setVar (String var)
    {
        this.var = var;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number = "+number+", var = "+var+", name = "+name+"]";
    }
}
