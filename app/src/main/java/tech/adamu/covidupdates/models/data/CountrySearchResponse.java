
package tech.adamu.covidupdates.models.data;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//@Generated("jsonschema2pojo")
public class CountrySearchResponse implements Serializable {

    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("TwoLetterSymbol")
    @Expose
    private String twoLetterSymbol;
    @SerializedName("ThreeLetterSymbol")
    @Expose
    private String threeLetterSymbol;
    @SerializedName("Infection_Risk")
    @Expose
    private Double infectionRisk;
    @SerializedName("Case_Fatality_Rate")
    @Expose
    private Double caseFatalityRate;
    @SerializedName("Test_Percentage")
    @Expose
    private Double testPercentage;
    @SerializedName("Recovery_Proporation")
    @Expose
    private Double recoveryProporation;
    @SerializedName("TotalCases")
    @Expose
    private Integer totalCases;
    @SerializedName("NewCases")
    @Expose
    private Integer newCases;
    @SerializedName("TotalDeaths")
    @Expose
    private Integer totalDeaths;
    @SerializedName("NewDeaths")
    @Expose
    private Integer newDeaths;
    @SerializedName("TotalRecovered")
    @Expose
    private Integer totalRecovered;
    @SerializedName("NewRecovered")
    @Expose
    private Integer newRecovered;
    @SerializedName("ActiveCases")
    @Expose
    private Integer activeCases;
    @SerializedName("TotalTests")
    @Expose
    private Integer totalTests;
    @SerializedName("Population")
    @Expose
    private Integer population;
    @SerializedName("Serious_Critical")
    @Expose
    private Integer seriousCritical;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CountrySearchResponse() {
    }

    /**
     * 
     * @param country
     * @param threeLetterSymbol
     * @param caseFatalityRate
     * @param newCases
     * @param totalRecovered
     * @param recoveryProporation
     * @param totalTests
     * @param population
     * @param testPercentage
     * @param newDeaths
     * @param newRecovered
     * @param totalDeaths
     * @param seriousCritical
     * @param infectionRisk
     * @param twoLetterSymbol
     * @param totalCases
     * @param activeCases
     */
    public CountrySearchResponse(String country, String twoLetterSymbol, String threeLetterSymbol, Double infectionRisk, Double caseFatalityRate, Double testPercentage, Double recoveryProporation, Integer totalCases, Integer newCases, Integer totalDeaths, Integer newDeaths, Integer totalRecovered, Integer newRecovered, Integer activeCases, Integer totalTests, Integer population, Integer seriousCritical) {
        super();
        this.country = country;
        this.twoLetterSymbol = twoLetterSymbol;
        this.threeLetterSymbol = threeLetterSymbol;
        this.infectionRisk = infectionRisk;
        this.caseFatalityRate = caseFatalityRate;
        this.testPercentage = testPercentage;
        this.recoveryProporation = recoveryProporation;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.totalRecovered = totalRecovered;
        this.newRecovered = newRecovered;
        this.activeCases = activeCases;
        this.totalTests = totalTests;
        this.population = population;
        this.seriousCritical = seriousCritical;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTwoLetterSymbol() {
        return twoLetterSymbol;
    }

    public void setTwoLetterSymbol(String twoLetterSymbol) {
        this.twoLetterSymbol = twoLetterSymbol;
    }

    public String getThreeLetterSymbol() {
        return threeLetterSymbol;
    }

    public void setThreeLetterSymbol(String threeLetterSymbol) {
        this.threeLetterSymbol = threeLetterSymbol;
    }

    public Double getInfectionRisk() {
        return infectionRisk;
    }

    public void setInfectionRisk(Double infectionRisk) {
        this.infectionRisk = infectionRisk;
    }

    public Double getCaseFatalityRate() {
        return caseFatalityRate;
    }

    public void setCaseFatalityRate(Double caseFatalityRate) {
        this.caseFatalityRate = caseFatalityRate;
    }

    public Double getTestPercentage() {
        return testPercentage;
    }

    public void setTestPercentage(Double testPercentage) {
        this.testPercentage = testPercentage;
    }

    public Double getRecoveryProporation() {
        return recoveryProporation;
    }

    public void setRecoveryProporation(Double recoveryProporation) {
        this.recoveryProporation = recoveryProporation;
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public Integer getNewCases() {
        return newCases;
    }

    public void setNewCases(Integer newCases) {
        this.newCases = newCases;
    }

    public Integer getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(Integer totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public Integer getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(Integer activeCases) {
        this.activeCases = activeCases;
    }

    public Integer getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(Integer totalTests) {
        this.totalTests = totalTests;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(Integer seriousCritical) {
        this.seriousCritical = seriousCritical;
    }

}
