package com.weatherapp.pojo;

public class Temperature {
	private String unit;

    private String min;

    private String max;

    private Float value;

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getMin ()
    {
        return min;
    }

    public void setMin (String min)
    {
        this.min = min;
    }

    public String getMax ()
    {
        return max;
    }

    public void setMax (String max)
    {
        this.max = max;
    }

    public Float getValue ()
    {
        return value;
    }

    public void setValue (Float value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", min = "+min+", max = "+max+", value = "+value+"]";
    }
}
