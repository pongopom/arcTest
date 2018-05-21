package uk.co.pongosoft.arctesr;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

//import android.arch.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = findViewById(R.id.myTextview);

        MyViewModel myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        if(myViewModel.getStringToSave() == null){
            myViewModel.setStringToSave("this will be saved on rotation");
        }

        textview.setText(myViewModel.getStringToSave());

        if(savedInstanceState ==  null){
          //  myString ="this text will not be saved on rotation";
        }

    }
}
