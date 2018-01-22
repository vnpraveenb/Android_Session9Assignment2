package com.praveen.session9assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
         menu.add("Computer");
         menu.add("Gamepad");
         menu.add("Camera");
         menu.add("Video");
         menu.add("E-mail");

         return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        Toast.makeText(getApplicationContext(),"Menu item selected is : " + item.getTitle().toString(),Toast.LENGTH_LONG).show();

        return true;
    }

}
