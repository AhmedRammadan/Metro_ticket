package ticket.metro.my.com.metroticket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class get_ticket extends AppCompatActivity {
    public static TextView point2,point1,number, pricetext, textView9, tahwel,price,ticket;
    private AdView mAdView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_ticket);
        MobileAds.initialize(this, "ca-app-pub-5919356622462995~4207495409");


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.SMART_BANNER);
        adView.setAdUnitId("ca-app-pub-5919356622462995/6821727366");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        number = findViewById(R.id.textView4);
        pricetext = findViewById(R.id.textView6);
        tahwel = findViewById(R.id.textView66);
        textView9 = findViewById(R.id.textView9);
        price = findViewById(R.id.price);
        ticket = findViewById(R.id.ticket);
        point2=findViewById(R.id.textView66);
        point1=findViewById(R.id.point2);


        Bundle bundle=getIntent().getExtras();
        int get_ticket=bundle.getInt("ticket");
        switch (get_ticket){
            case 1:
                get1();
                break;
            case 2:
                get2();
                break;
        }
    }
    public static void get1(){
        point1.setVisibility(View.INVISIBLE);
        point2.setVisibility(View.INVISIBLE);
        number.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.VISIBLE);
        textView9.setText(""+line1.getResualt());
        pricetext.setText(""+line1.getPrice());
        tahwel.setText("");
        line1.getImage();
    }
    public static void get2(){
        point1.setVisibility(View.VISIBLE);
        point2.setVisibility(View.VISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        number.setVisibility(View.VISIBLE);
        number.setText(""+line1.getResualt2());
        pricetext.setText(""+line1.getPrice2());
        pricetext.setText(""+line1.getPrice2());
        tahwel.setText(""+line1.getTahwel());
        line1.getImage2();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if (id==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
