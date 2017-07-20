package com.example.yoana.shadows;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import static com.example.yoana.shadows.Device.*;

public class MainActivity extends AppCompatActivity
{

    private FrameLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (FrameLayout) findViewById(R.id.frameLayout);
        layout.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Fragment fragment = Device.newInstance();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }


        });


    }

}
