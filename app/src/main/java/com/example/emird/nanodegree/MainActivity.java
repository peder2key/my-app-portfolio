package com.example.emird.nanodegree;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void showSpotifyToast(View view)
    {
        Toast.makeText(getApplicationContext(), "This Button Will Start My Spotify App", Toast.LENGTH_SHORT).show();
    }

    public void showScoresToast(View view)
    {
     Toast.makeText(getApplicationContext(), "This Button Will Start Scores App", Toast.LENGTH_SHORT).show();
    }

    public  void showLibraryApp(View view)
    {
        Toast.makeText(getApplicationContext(), "This Button Will Start Library App", Toast.LENGTH_SHORT).show();
    }

    public void showBuildItBigger(View view)
    {
        Toast.makeText(getApplicationContext(), "This Button Will Launch Build It Bigger App", Toast.LENGTH_SHORT).show();
    }

    public  void showXYZreader(View view)
    {
        Toast.makeText(getApplicationContext(), "This Button Will Launch XYZ Reader App", Toast.LENGTH_SHORT).show();
    }

    public  void showCapstoneMyApp(View view)
    {
        Toast.makeText(getApplicationContext(), "This Button Will Launch My Own App", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
