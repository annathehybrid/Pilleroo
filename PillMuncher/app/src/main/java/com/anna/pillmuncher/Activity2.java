package com.anna.pillmuncher;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Activity2 extends DisplayMessageActivity {

    private ArrayAdapter<String> mPillAdapter;

    public Activity2() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        ListView listView = (ListView) findViewById(R.id.listview_pills);

        String[] pill_data = {
                "Red Pill",
                "Orange Pill",
                "Yellow Pill",
                "Green Pill",
                "Blue Pill",
                "Purple Pill",
                "Black Pill",
                "White Pill"
        };

        List<String> weekPills = new ArrayList<String>(Arrays.asList(pill_data));
        weekPills.add("Another pill!!!!!");


        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> mPillAdapter = new ArrayAdapter<String>(
                this, //global information about the app enviroment, resources
                android.R.layout.activity_list_item, //layout for each element
                android.R.id.text1, //id of the textview
                pill_data);

        listView.setAdapter(mPillAdapter);

    }

    public class FetchWeatherTask extends AsyncTask<String, Void, Void> {

        private final String LOG_TAG = FetchWeatherTask.class.getSimpleName();

        @Override
        protected Void doInBackground(String... params) {

            // If there's no zip code, there's nothing to look up.  Verify size of params.
            if (params.length == 0) {
                return null;
            }

            // These two need to be declared outside the try/catch
            // so that they can be closed in the finally block.
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;

            // Will contain the raw JSON response as a string.
            String rxnormJsonStr = null;

                return null;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Context context = getApplicationContext();
            CharSequence text = "You made a setting!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;

        }
        else if (id == R.id.action_search) {
            Context context = getApplicationContext();
            CharSequence text = "You made a search!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;

        }
        else if (id == R.id.action_refresh) {
            Context context = getApplicationContext();
            CharSequence text = "You made a refresh!";
            int duration = Toast.LENGTH_SHORT;


            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            //FetchWeatherTask weatherTask = new FetchWeatherTask();
            //weatherTask.execute("94043");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}


