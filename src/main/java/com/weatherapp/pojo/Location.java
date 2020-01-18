package com.weatherapp.pojo;

public class Location {
	private String altitude;

    private String latitude;

    private String geobase;

    private String geobaseid;

    private String longitude;

    public String getAltitude ()
    {
        return altitude;
    }

    public void setAltitude (String altitude)
    {
        this.altitude = altitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getGeobase ()
    {
        return geobase;
    }

    public void setGeobase (String geobase)
    {
        this.geobase = geobase;
    }

    public String getGeobaseid ()
    {
        return geobaseid;
    }

    public void setGeobaseid (String geobaseid)
    {
        this.geobaseid = geobaseid;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [altitude = "+altitude+", latitude = "+latitude+", geobase = "+geobase+", geobaseid = "+geobaseid+", longitude = "+longitude+"]";
    }
}
