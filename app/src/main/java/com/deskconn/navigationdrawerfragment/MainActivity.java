package com.deskconn.navigationdrawerfragment;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    DrawerLayout dLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dLayout = findViewById(R.id.drawer_layout);
        Fragment frag = null;
        frag = new HomeFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, frag); // replace a Fragment with Frame Layout
        transaction.commit(); // commit the changes
        dLayout.closeDrawers(); // close the all open Drawer Views
    }

    public void ClickMenu(View view){
        dLayout.openDrawer(GravityCompat.START);
    }

    public void ClickHome(View view){
        Fragment frag = null;
        frag = new HomeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, frag); // replace a Fragment with Frame Layout
        transaction.commit(); // commit the changes
        dLayout.closeDrawers(); // close the all open Drawer Views
    }

    public void ClickDashboard(View view){
        Fragment frag = null;
        frag = new DashboardFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, frag); // replace a Fragment with Frame Layout
        transaction.commit(); // commit the changes
        dLayout.closeDrawers(); // close the all open Drawer Views
    }

    public void ClickAboutUs(View view){
        Fragment frag = null;
        frag = new AboutFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, frag); // replace a Fragment with Frame Layout
        transaction.commit(); // commit the changes
        dLayout.closeDrawers(); // close the all open Drawer Views
    }

    public void ClickLogout(View view){
        //Initialize Alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout..?");
        builder.setPositiveButton("Yes", (dialog, which) -> {
            //Finish Activity
            finishAffinity();
            //Exit app
            System.exit(0);
        });
        builder.setNegativeButton("No", (dialog, which) -> dialog.dismiss());
        builder.show();
    }
}