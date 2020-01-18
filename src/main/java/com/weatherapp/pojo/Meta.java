package com.weatherapp.pojo;

public class Meta {
	private String nextupdate;

    private String calctime;

    private String lastupdate;

    public String getNextupdate ()
    {
        return nextupdate;
    }

    public void setNextupdate (String nextupdate)
    {
        this.nextupdate = nextupdate;
    }

    public String getCalctime ()
    {
        return calctime;
    }

    public void setCalctime (String calctime)
    {
        this.calctime = calctime;
    }

    public String getLastupdate ()
    {
        return lastupdate;
    }

    public void setLastupdate (String lastupdate)
    {
        this.lastupdate = lastupdate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nextupdate = "+nextupdate+", calctime = "+calctime+", lastupdate = "+lastupdate+"]";
    }
}
