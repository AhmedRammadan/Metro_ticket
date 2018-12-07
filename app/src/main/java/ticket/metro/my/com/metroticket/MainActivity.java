package ticket.metro.my.com.metroticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    public static Spinner spinner, spinner2,spinner11,spinner22;
    public static RadioGroup radioGroup3;
    public static RadioButton full_ticket, Half_ticket;
    public static TextView number, pricetext, textView9, tahwel;
    public static LinearLayout ticket;
    public static int tahwel_2;
    public static int get_ticket;
    public static int get_position1;
    public static int get_position2;
    private long prssback;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,map_metro.class);
                startActivity(intent);
            }
        });




        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner11 = findViewById(R.id.spinner11);
        spinner22 = findViewById(R.id.spinner22);
        number = findViewById(R.id.textView4);
        pricetext = findViewById(R.id.textView6);
        tahwel = findViewById(R.id.textView66);
        full_ticket = findViewById(R.id.radioButton8);
        Half_ticket = findViewById(R.id.radioButton7);
        full_ticket.isChecked();
        textView9 = findViewById(R.id.textView9);
        radioGroup3 = findViewById(R.id.radio3);
        spinner11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        get_position1=spinner11.getSelectedItemPosition();
                        getArrayAdapter(1);
                        if (get_position2==0)
                            get_ticket=1;
                        else if (get_position2==1||get_position2==2)
                            get_ticket=2;
                        break;
                    case 1:
                        get_position1=spinner11.getSelectedItemPosition();
                        getArrayAdapter(2);
                        if (get_position2==1)
                            get_ticket=1;
                        else if (get_position2==0||get_position2==2)
                            get_ticket=2;
                        break;
                    case 2:
                        get_position1=spinner11.getSelectedItemPosition();
                        getArrayAdapter(3);
                        if (get_position2==2)
                            get_ticket=1;
                        else if (get_position2==0||get_position2==1)
                            get_ticket=2;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner22.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        get_position2=spinner22.getSelectedItemPosition();
                        getArrayAdapter2(1);
                        if (get_position1==0)
                            get_ticket=1;
                        else if (get_position1==1||get_position1==2)
                            get_ticket=2;
                        break;
                    case 1:
                        get_position2=spinner22.getSelectedItemPosition();
                        getArrayAdapter2(2);
                        if (get_position1==1)
                            get_ticket=1;
                        else if (get_position1==0||get_position1==2)
                            get_ticket=2;
                        break;
                    case 2:
                        get_position2=spinner22.getSelectedItemPosition();
                        getArrayAdapter2(3);
                        if (get_position1==2)
                            get_ticket=1;
                        else if (get_position1==0||get_position1==1)
                            get_ticket=2;
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton7:
                        line1.tickettyp = 1;
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==0)
                                get_ticket=1;
                            else if (get_position1==0 && get_position2==1)
                                get_ticket=2;
                            else if (get_position1==0 && get_position2==2)
                                get_ticket=2;
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1)
                                get_ticket=1;
                            else if (get_position1==1 && get_position2==0)
                                get_ticket=2;
                            else if (get_position1==1 && get_position2==2)
                                get_ticket=2;
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2)
                                get_ticket=1;
                            else if (get_position1==2 && get_position2==0)
                                get_ticket=2;
                            else if (get_position1==2 && get_position2==1)
                                get_ticket=2;
                        }
                        break;

                    case R.id.radioButton8:
                        line1.tickettyp = 2;
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==0)
                                get_ticket=1;
                            else if (get_position1==0 && get_position2==1)
                                get_ticket=2;
                            else if (get_position1==0 && get_position2==2)
                                get_ticket=2;
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1)
                                get_ticket=1;
                            else if (get_position1==1 && get_position2==0)
                                get_ticket=2;
                            else if (get_position1==1 && get_position2==2)
                                get_ticket=2;
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2)
                                get_ticket=1;
                            else if (get_position1==2 && get_position2==0)
                                get_ticket=2;
                            else if (get_position1==2 && get_position2==1)
                                get_ticket=2;
                        }
                        break;
                }
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        line1.stpStart = 1;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;

                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 1:
                        line1.stpStart = 2;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;

                        else if (get_position1==1 && get_position2==1)

                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;

                    case 2:
                        line1.stpStart = 3;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 3:
                        line1.stpStart = 4;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 4:
                        line1.stpStart = 5;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 5:
                        line1.stpStart = 6;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 6:
                        line1.stpStart = 7;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 7:
                        line1.stpStart = 8;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 8:
                        line1.stpStart = 9;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 9:
                        line1.stpStart = 10;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 10:
                        line1.stpStart = 11;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 11:
                        line1.stpStart = 12;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 12:
                        line1.stpStart = 13;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 13:
                        line1.stpStart = 14;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 14:
                        line1.stpStart = 15;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 15:
                        line1.stpStart = 16;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 16:
                        line1.stpStart = 17;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 17:
                        line1.stpStart = 18;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 18:
                        line1.stpStart = 19;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 19:
                        line1.stpStart = 20;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 20:
                        line1.stpStart = 21;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 21:
                        line1.stpStart = 22;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 22:
                        line1.stpStart = 23;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 23:
                        line1.stpStart = 24;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 24:
                        line1.stpStart = 25;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 25:
                        line1.stpStart = 26;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 26:
                        line1.stpStart = 27;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 27:
                        line1.stpStart = 28;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 28:
                        line1.stpStart = 29;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 29:
                        line1.stpStart = 30;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 30:
                        line1.stpStart = 31;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 31:
                        line1.stpStart = 32;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 32:
                        line1.stpStart = 33;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 33:
                        line1.stpStart = 34;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)
                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;
                    case 34:
                        line1.stpStart = 35;
                        if (get_position1==0 && get_position2==1)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==2)
                            get_ticket=2;
                        else if (get_position1==0 && get_position2==0)
                            get_ticket=1;


                        else if (get_position1==1 && get_position2==1)
                            get_ticket=1;
                        else if (get_position1==1 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==1 && get_position2==2)
                            get_ticket=2;

                        else if (get_position1==2 && get_position2==2)

                            get_ticket=1;
                        else if (get_position1==2 && get_position2==0)
                            get_ticket=2;
                        else if (get_position1==2 && get_position2==1)
                            get_ticket=2;

                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 1;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 10;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 13;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 3;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 4;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 2;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 3;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 3;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 4;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 2;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 3;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 1;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 19;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 22;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 1;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 1;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 12;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 21;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 1:
                        if (get_position1==0) {
                            if (get_position1==0) {
                                if (get_position1==0 && get_position2==1) {
                                    if (line1.stpStart <= 20)
                                        line1.stpEnd = 9;
                                    else if (line1.stpStart >= 20)
                                        line1.stpEnd = 12;
                                    get_ticket=2;
                                } else if (get_position1==0 && get_position2==0) {
                                    line1.stpEnd = 2;
                                    get_ticket=1;
                                } else if (get_position1==0 && get_position2==2) {
                                    if (line1.stpStart <= 19)
                                        line1.stpEnd = 4;
                                    else if (line1.stpStart == 20)
                                        line1.stpEnd = 5;
                                    else if (line1.stpStart >= 22)
                                        line1.stpEnd = 3;
                                    else if (line1.stpStart == 21)
                                        line1.stpEnd = 4;
                                    get_ticket=2;
                                }
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 2;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 18;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 21;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 2;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 2;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 11;
                                get_ticket=2;
                                ;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 20;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 2:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 8;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 11;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 3;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 5;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 6;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 4;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 5;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 3;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 17;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 20;
                                    get_ticket=2;
                                }

                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 3;
                                get_ticket=2;
                            }
                            get_ticket=2;
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 3;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 10;
                                get_ticket=2;
                                ;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 19;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 3:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 7;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 10;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 4;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 6;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 7;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 5;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 6;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 4;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 16;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 19;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 4;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 4;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 9;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 18;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 4:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 6;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 9;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 5;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 7;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 8;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 6;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 7;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 5;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 15;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 18;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 5;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 5;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 8;
                                get_ticket=2;
                                ;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 17;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 5:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 5;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 8;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 6;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 8;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 9;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 7;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 8;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 6;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 14;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 17;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 6;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 6;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 7;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 16;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 6:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 4;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 7;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 7;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 9;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 10;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 8;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 9;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 7;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 13;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 16;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 7;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 7;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 6;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 15;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 7:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 3;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 6;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 8;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 10;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 11;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 9;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 10;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 8;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 12;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 15;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 8;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 8;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 5;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 14;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 8:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 2;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 5;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 9;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 11;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 12;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 10;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 11;
                                get_ticket=2;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 9;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 11;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 14;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 9;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 9;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 4;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 13;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 9:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 1;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 4;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 10;
                                get_ticket=1;
                            } else if (get_position1==0 && get_position2==2) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 12;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 13;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 11;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 12;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 10;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 10;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 13;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            } else if (get_position1==1 && get_position2==2) {
                                line1.stpEnd = 10;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==2) {
                                line1.stpEnd = 10;
                                get_ticket=1;
                            } else if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 3;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 12;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 10:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 2;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 3;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                if (line1.stpStart <= 19)
                                    line1.stpEnd = 13;
                                else if (line1.stpStart == 20)
                                    line1.stpEnd = 14;
                                else if (line1.stpStart >= 22)
                                    line1.stpEnd = 12;
                                else if (line1.stpStart == 21)
                                    line1.stpEnd = 13;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 11;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 9;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 12;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 2;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 11;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 11:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 3;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 2;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 12;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 12;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 8;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 11;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 1;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 10;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 12:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 4;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 1;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 13;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 13;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 7;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 10;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 2;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 9;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 13:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 5;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 2;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 14;
                                get_ticket=1;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 14;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 6;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 9;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 3;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 8;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 14:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 6;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 3;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 15;
                                get_ticket=1;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 15;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 5;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 8;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 4;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 7;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 15:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 7;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 4;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 16;
                                get_ticket=1;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 16;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 4;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 7;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 5;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 6;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 16:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 8;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 5;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 17;
                                get_ticket=1;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 17;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 3;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 6;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 6;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 5;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 17:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 9;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 6;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 18;
                                get_ticket=1;
                            }

                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 18;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 2;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 5;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 7;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 4;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 18:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 10;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 7;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 19;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 19;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 1;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 4;
                                    get_ticket=2;
                                }
                                get_ticket=2;

                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 8;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 3;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 19:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 11;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 8;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 20;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==1) {
                                line1.stpEnd = 20;
                                get_ticket=1;
                            } else if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 2;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 3;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 9;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 1;
                                line1.stpEnd = 4;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 20:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 12;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 9;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 21;
                                get_ticket=1;
                            }

                        } else if (get_position1==0 && get_position2==0) {
                            line1.stpEnd = 19;
                            get_ticket=1;
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 3;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 2;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 10;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 2;
                                line1.stpEnd = 3;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 21:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 13;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 10;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 22;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 4;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 1;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 11;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 2;
                                line1.stpEnd = 2;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 22:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 14;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 11;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 23;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 5;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 2;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==1) {
                                line1.stpEnd = 12;
                                get_ticket=2;
                            } else if (get_position1==2 && get_position2==0) {
                                tahwel_2 = 2;
                                line1.stpEnd = 3;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 23:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 17;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 12;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 24;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 6;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 1;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 3;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 4;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 24:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 18;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 15;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 25;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 7;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 4;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 5;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 25:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 19;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 16;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 26;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 8;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 5;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 6;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 26:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 20;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 17;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 27;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 9;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 6;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 7;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 27:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 21;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 18;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 28;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 10;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 7;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 7;
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 8;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 28:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 22;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 19;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 29;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 11;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 8;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 9;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 29:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 23;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 20;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 30;
                                get_ticket=1;
                            }
                        } else if (get_position1==2) {
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 6;
                                get_ticket=2;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 12;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 9;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 10;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 30:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 24;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 21;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 31;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 13;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 10;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 11;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 31:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 25;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 22;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 32;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 14;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 11;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 12;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 32:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 26;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 23;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 33;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 15;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 12;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 13;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 33:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 27;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 24;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 34;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 16;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 13;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 14;
                                get_ticket=2;
                            }
                        }
                        break;
                    case 34:
                        if (get_position1==0) {
                            if (get_position1==0 && get_position2==1) {
                                if (line1.stpStart <= 20)
                                    line1.stpEnd = 28;
                                else if (line1.stpStart >= 20)
                                    line1.stpEnd = 25;
                                get_ticket=2;
                            } else if (get_position1==0 && get_position2==0) {
                                line1.stpEnd = 35;
                                get_ticket=1;
                            }
                        } else if (get_position1==1) {
                            if (get_position1==1 && get_position2==0) {
                                if (line1.stpStart <= 11) {
                                    line1.stpEnd = 17;
                                    get_ticket=2;
                                } else if (line1.stpStart >= 12) {
                                    line1.stpEnd = 14;
                                    get_ticket=2;
                                }
                                get_ticket=2;
                            }
                        } else if (get_position1==2) {
                            tahwel_2 = 2;
                            if (get_position1==2 && get_position2==0) {
                                line1.stpEnd = 15;
                                get_ticket=2;
                            }
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
    public void getArrayAdapter(int position){
        switch (position){
            case 1:
                spinner = findViewById(R.id.spinner);
                String[] array = getResources().getStringArray(R.array.line1);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array);
                spinner.setAdapter(arrayAdapter);
                break;
            case 2:
                spinner = findViewById(R.id.spinner);
                String[] array3 = getResources().getStringArray(R.array.line2);
                ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array3);
                spinner.setAdapter(arrayAdapter3);
                break;
            case 3:
                spinner = findViewById(R.id.spinner);
                String[] array5 = getResources().getStringArray(R.array.line3);
                ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array5);
                spinner.setAdapter(arrayAdapter5);
                break;
        }
    }
    public void getArrayAdapter2(int position){
        switch (position){
            case 1:
                spinner2 = findViewById(R.id.spinner2);
                String[] array = getResources().getStringArray(R.array.line1);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array);
                spinner2.setAdapter(arrayAdapter);
                break;
            case 2:
                spinner2 = findViewById(R.id.spinner2);
                String[] array3 = getResources().getStringArray(R.array.line2);
                ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array3);
                spinner2.setAdapter(arrayAdapter3);
                break;
            case 3:
                spinner2 = findViewById(R.id.spinner2);
                String[] array5 = getResources().getStringArray(R.array.line3);
                ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array5);
                spinner2.setAdapter(arrayAdapter5);
                break;
        }
    }


    public void get_ticket(View view) {
        Intent intent =new Intent(this,get_ticket.class);
        intent.putExtra("ticket",get_ticket);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        if (prssback + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
            backToast=Toast.makeText(this, "press back agine to Exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        prssback= System.currentTimeMillis();
    }

}
