package ge.ibsu.demo.dto.projections;

public class CityDTO {
    private String cityName;
    private String countryName;

    public CityDTO(String cityName, String countryName) {
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
