package com.miss.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView Output;
    private Button SetChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowEnabled(true);
        datePicker = findViewById(R.id.kalender);
        Output = findViewById(R.id.output);
        SetChange = findViewById(R.id.set_kalender);
        SetChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Mencetak Output
                Output.setText(getDate());
                Toast.makeText(getApplicationContext(), "Berhasil Diubah", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getDate(){
        int hari;
        int bulan;
        int tahun;
        StringBuilder date = new StringBuilder();
        hari = datePicker.getDayOfMonth(); //Mendapatkan Input Hari dari DatePicker
        bulan = datePicker.getMonth() + 1; //Mendapatkan Input Bulan dari DatePicker
        tahun = datePicker.getYear(); //Mendapatkan Input Tahun dari DatePicker

        //Meambah Isi/Nilai pada Variable date(StringBuilder)
        date.append("Date : ").append(hari).append("/").append(bulan).append("/").append(tahun);
        return date.toString();//Mengembalikan Nilai date
    }
    }

