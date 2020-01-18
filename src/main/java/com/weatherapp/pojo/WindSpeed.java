package com.weatherapp.pojo;

public class WindSpeed {
	private String mps;

    private String unit;

    private String name;

    public String getMps ()
    {
        return mps;
    }

    public void setMps (String mps)
    {
        this.mps = mps;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
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
        return "ClassPojo [mps = "+mps+", unit = "+unit+", name = "+name+"]";
    }
}
