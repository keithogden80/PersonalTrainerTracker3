package com.bignerdranch.android.personaltrainertracker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.MenuItemHoverListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        //menu.findItem(R.menu.main_menu_item);
        return true;
    }
    public void dialog(){
        new AlertDialog.Builder(this)
                .setTitle("Log Out")
                .setMessage("Logging out...")

                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                }).create().show();
    }
    public void onClickAddCustomer(View view){
        Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
        startActivity(intent);

    }
    public void onClickCustomerList(View view){
        Intent intent = new Intent(MainActivity.this, CustomerListActivity.class);
        startActivity(intent);
    }
    public void onClickCustomerSession(View view){
        Intent intent = new Intent(MainActivity.this, CustomerSession.class);
        startActivity(intent);

    }

    public void onClickSign(View view){
        Intent intent = new Intent(MainActivity.this, SignSessionActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.log_out){
            super.onOptionsItemSelected(item);

            dialog();

            Intent intent = new Intent(this, LoginActivity.class);
            //startActivity(intent);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
