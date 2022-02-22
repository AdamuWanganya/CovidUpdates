
package tech.adamu.covidupdates.models;

//import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

//import javax.annotation.Generated;

//@Generated("jsonschema2pojo")
public class CovidDataAfricaResponse implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("Continent")
    @Expose
    private String continent;
    @SerializedName("TwoLetterSymbol")
    @Expose
    private String twoLetterSymbol;
    @SerializedName("ThreeLetterSymbol")
    @Expose
    private String threeLetterSymbol;
    @SerializedName("Infection_Risk")
    @Expose
    private Integer infectionRisk;
    @SerializedName("Case_Fatality_Rate")
    @Expose
    private Integer caseFatalityRate;
    @SerializedName("Test_Percentage")
    @Expose
    private Integer testPercentage;
    @SerializedName("Recovery_Proporation")
    @Expose
    private Integer recoveryProporation;
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
    private String totalRecovered;
    @SerializedName("NewRecovered")
    @Expose
    private Integer newRecovered;
    @SerializedName("ActiveCases")
    @Expose
    private Integer activeCases;
    @SerializedName("TotalTests")
    @Expose
    private String totalTests;
    @SerializedName("Population")
    @Expose
    private String population;
    @SerializedName("one_Caseevery_X_ppl")
    @Expose
    private Integer oneCaseeveryXPpl;
    @SerializedName("one_Deathevery_X_ppl")
    @Expose
    private Integer oneDeatheveryXPpl;
    @SerializedName("one_Testevery_X_ppl")
    @Expose
    private Integer oneTesteveryXPpl;
    @SerializedName("Deaths_1M_pop")
    @Expose
    private Integer deaths1MPop;
    @SerializedName("Serious_Critical")
    @Expose
    private Integer seriousCritical;
    @SerializedName("Tests_1M_Pop")
    @Expose
    private Integer tests1MPop;
    @SerializedName("TotCases_1M_Pop")
    @Expose
    private Integer totCases1MPop;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CovidDataAfricaResponse() {
    }

    /**
     * 
     * @param continent
     * @param country
     * @param caseFatalityRate
     * @param newCases
     * @param totalRecovered
     * @param oneCaseeveryXPpl
     * @param recoveryProporation
     * @param newRecovered
     * @param totalDeaths
     * @param seriousCritical
     * @param rank
     * @param id
     * @param activeCases
     * @param oneDeatheveryXPpl
     * @param tests1MPop
     * @param threeLetterSymbol
     * @param oneTesteveryXPpl
     * @param totalTests
     * @param population
     * @param testPercentage
     * @param newDeaths
     * @param totCases1MPop
     * @param deaths1MPop
     * @param infectionRisk
     * @param twoLetterSymbol
     * @param totalCases
     */
    public CovidDataAfricaResponse(String id, Integer rank, String country, String continent, String twoLetterSymbol, String threeLetterSymbol, Integer infectionRisk, Integer caseFatalityRate, Integer testPercentage, Integer recoveryProporation, Integer totalCases, Integer newCases, Integer totalDeaths, Integer newDeaths, String totalRecovered, Integer newRecovered, Integer activeCases, String totalTests, String population, Integer oneCaseeveryXPpl, Integer oneDeatheveryXPpl, Integer oneTesteveryXPpl, Integer deaths1MPop, Integer seriousCritical, Integer tests1MPop, Integer totCases1MPop) {
        super();
        this.id = id;
        this.rank = rank;
        this.country = country;
        this.continent = continent;
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
        this.oneCaseeveryXPpl = oneCaseeveryXPpl;
        this.oneDeatheveryXPpl = oneDeatheveryXPpl;
        this.oneTesteveryXPpl = oneTesteveryXPpl;
        this.deaths1MPop = deaths1MPop;
        this.seriousCritical = seriousCritical;
        this.tests1MPop = tests1MPop;
        this.totCases1MPop = totCases1MPop;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
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

    public Integer getInfectionRisk() {
        return infectionRisk;
    }

    public void setInfectionRisk(Integer infectionRisk) {
        this.infectionRisk = infectionRisk;
    }

    public Integer getCaseFatalityRate() {
        return caseFatalityRate;
    }

    public void setCaseFatalityRate(Integer caseFatalityRate) {
        this.caseFatalityRate = caseFatalityRate;
    }

    public Integer getTestPercentage() {
        return testPercentage;
    }

    public void setTestPercentage(Integer testPercentage) {
        this.testPercentage = testPercentage;
    }

    public Integer getRecoveryProporation() {
        return recoveryProporation;
    }

    public void setRecoveryProporation(Integer recoveryProporation) {
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

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
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

    public String getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(String totalTests) {
        this.totalTests = totalTests;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Integer getOneCaseeveryXPpl() {
        return oneCaseeveryXPpl;
    }

    public void setOneCaseeveryXPpl(Integer oneCaseeveryXPpl) {
        this.oneCaseeveryXPpl = oneCaseeveryXPpl;
    }

    public Integer getOneDeatheveryXPpl() {
        return oneDeatheveryXPpl;
    }

    public void setOneDeatheveryXPpl(Integer oneDeatheveryXPpl) {
        this.oneDeatheveryXPpl = oneDeatheveryXPpl;
    }

    public Integer getOneTesteveryXPpl() {
        return oneTesteveryXPpl;
    }

    public void setOneTesteveryXPpl(Integer oneTesteveryXPpl) {
        this.oneTesteveryXPpl = oneTesteveryXPpl;
    }

    public Integer getDeaths1MPop() {
        return deaths1MPop;
    }

    public void setDeaths1MPop(Integer deaths1MPop) {
        this.deaths1MPop = deaths1MPop;
    }

    public Integer getSeriousCritical() {
        return seriousCritical;
    }

    public void setSeriousCritical(Integer seriousCritical) {
        this.seriousCritical = seriousCritical;
    }

    public Integer getTests1MPop() {
        return tests1MPop;
    }

    public void setTests1MPop(Integer tests1MPop) {
        this.tests1MPop = tests1MPop;
    }

    public Integer getTotCases1MPop() {
        return totCases1MPop;
    }

    public void setTotCases1MPop(Integer totCases1MPop) {
        this.totCases1MPop = totCases1MPop;
    }

}
