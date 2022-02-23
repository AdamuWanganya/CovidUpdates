package tech.adamu.covidupdates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import tech.adamu.covidupdates.models.news.News;

public class VaccineNews extends AppCompatActivity {

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;

    @BindView(R.id.newsimage) ImageView image;
    @BindView(R.id.country) TextView country;
    @BindView(R.id.total_tests) TextView pubdate;
    @BindView(R.id.serious_critical) TextView content;
    @BindView(R.id.active_cases) TextView url;
    @BindView(R.id.total_cases) TextView reference;
    @BindView(R.id.cardView) CardView cardView;
    @BindView(R.id.save) Button save;
    @BindView(R.id.logout) Button logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccine_news);
        ButterKnife.bind(this);


        News response = (News) getIntent().getSerializableExtra("Vaccine");

        Picasso.get().load(response.getUrlToImage()).into(image);
        country.setText(response.getTitle());
        pubdate.setText(response.getPubDate().trim());
        content.setText(response.getContent());
        url.setText(response.getLink());
        reference.setText(response.getReference());

        //database
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference().child("News");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                root.push().setValue(response);
                Toast.makeText(VaccineNews.this, "Saved", Toast.LENGTH_LONG).show();


            }
        });

    }


}