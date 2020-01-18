package com.weatherapp.pojo;

public class WindDirection {
	private String code;

    private String deg;

    private String name;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getDeg ()
    {
        return deg;
    }

    public void setDeg (String deg)
    {
        this.deg = deg;
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
        return "ClassPojo [code = "+code+", deg = "+deg+", name = "+name+"]";
    }
}
