package finds;

public class TableData {
    public String sky;
        public String airTemp;
        public String humidity;
        public String wind;
        public String water;
        public String forecast;
        public String enjoySports;

        public TableData(String sky, String airTemp, String humidity, String wind, String water, String forecast, String enjoySports) {
            this.sky = sky;
            this.airTemp = airTemp;
            this.humidity = humidity;
            this.wind = wind;
            this.water = water;
            this.forecast = forecast;
            this.enjoySports = enjoySports;
        }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public String getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(String airTemp) {
        this.airTemp = airTemp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getEnjoySports() {
        return enjoySports;
    }

    public void setEnjoySports(String enjoySports) {
        this.enjoySports = enjoySports;
    }
        
    
}
