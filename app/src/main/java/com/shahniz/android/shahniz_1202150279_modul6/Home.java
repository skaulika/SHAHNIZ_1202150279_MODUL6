package com.shahniz.android.shahniz_1202150279_modul6;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //untuk membuat beberapa tab
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Terbaru"));
        tabLayout.addTab(tabLayout.newTab().setText("Poto Saya"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //untuk membuat "create"
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent dari Home ke PostPoto
                Intent intent = new Intent(Home.this,PostPoto.class);
                startActivity(intent);
            }
        });
    }

    //method buat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    //method untuk logout
    public void logout(MenuItem item) {
        Intent intent = new Intent(Home.this, MainActivity.class);
        startActivity(intent);
    }

}
