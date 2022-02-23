package tech.adamu.covidupdates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Response;
import tech.adamu.covidupdates.models.data.CountrySearchResponse;

public class CountryDetails extends AppCompatActivity {
    @BindView(R.id.country) TextView name;
    @BindView(R.id.case_fatality) TextView fatalityrate;
    @BindView(R.id.test_percentage) TextView percentagetest;
    @BindView(R.id.total_cases) TextView totalcases;
    @BindView(R.id.total_deaths) TextView totaldeaths;
    @BindView(R.id.new_deaths) TextView newdeaths;
    @BindView(R.id.total_recovery) TextView totalrecovery;
    @BindView(R.id.new_recovery) TextView newrecovery;
    @BindView(R.id.active_cases) TextView activecases;
    @BindView(R.id.total_tests) TextView totaltests;
    @BindView(R.id.population) TextView population;
    @BindView(R.id.serious_critical) TextView seriouscritical;
    @BindView(R.id.recovery_propation) TextView recoverypropation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        ButterKnife.bind(this);

        CountrySearchResponse response = (CountrySearchResponse) getIntent().getSerializableExtra("Country");
        name.setText(response.getCountry());
        fatalityrate.setText("Fatality Rate: " + response.getCaseFatalityRate().toString());
        percentagetest.setText("Test percentage: " + response.getTestPercentage().toString());
        recoverypropation.setText("Recovery Proportionality: " + response.getRecoveryProporation().toString());
        totalcases.setText("Total Cases: " + response.getTotalCases().toString());
        totaldeaths.setText("Total Deaths: " + response.getTotalDeaths().toString());
        newdeaths.setText("New Deaths: " + response.getNewDeaths().toString());
        totalrecovery.setText("Total Recovery: " + response.getTotalRecovered().toString());
        activecases.setText("Active Cases: " + response.getActiveCases().toString());
        totaltests.setText("Total Tests: " + response.getTotalTests().toString());
        population.setText("Population: " + response.getPopulation().toString());
        seriouscritical.setText("Serious Criticals: " + response.getSeriousCritical().toString());
        newrecovery.setText("New Recovery: " + response.getNewRecovered().toString());
    }
}