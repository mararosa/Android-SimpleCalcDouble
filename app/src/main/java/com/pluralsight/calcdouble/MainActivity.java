package com.pluralsight.calcdouble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        FloatingActionButton btnCalcDouble = findViewById(R.id.btn_doublecalc);
        btnCalcDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtValue = findViewById(R.id.txt_value);
                String stringValue = txtValue.getText().toString();
                int originalValue = Integer.parseInt(stringValue);
                int newValue = MyWorker.doubleValue(originalValue);
                txtValue.setText((Integer.toString(newValue)));

                Snackbar.make(view, "Changed value " + originalValue + " to " + newValue, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
