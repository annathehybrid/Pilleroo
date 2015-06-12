package com.anna.pillmuncher;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayMessageActivity extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);


        // Get the message from the intent
        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //Log.i("debug", "made it to new class");
        // Create the text view

        //int padding = 50;
        //TextView textView = new TextView(this);
        //textView.setTextSize(40);
        //textView.setPadding(padding, padding, padding, padding);
        //textView.setText(message);

        // Set the text view as the activity layout
        //GridLayout.LayoutParams layout = new GridLayout.LayoutParams();
        //addContentView(textView, layout);


        addListenerOnButton();
    }


    public void addListenerOnButton() {

        imageButton1 = (ImageButton) findViewById(R.id.imagebutton_pill1);
        imageButton2 = (ImageButton) findViewById(R.id.imagebutton_pill2);
        imageButton3 = (ImageButton) findViewById(R.id.imagebutton_pill3);



        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                startExplicitActivation();

            }

        });

        imageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(DisplayMessageActivity.this,
                        "You clicked imagebutton 3",
                        Toast.LENGTH_SHORT).show();

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
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

        else if (id == R.id.action_search) {

            Context context = getApplicationContext();
            CharSequence text = "You made a search!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }


    // Start the ExplicitlyLoadedActivity

    private void startExplicitActivation() {

        // TODO - Create a new intent to launch the ExplicitlyLoadedActivity class
        Intent intent = new Intent(this,Activity2.class);
        // TODO - Start an Activity using that intent and the request code defined above
        //this.startActivityForResult(intent, GET_TEXT_REQUEST_CODE);

        ImageButton button_pill = (ImageButton)this.findViewById(R.id.imagebutton_pill2);
        startActivity(intent);
    }


    // ** Called when the user clicks the Send button */
    public void sendPillMessage1(View view) {
        Intent intent = new Intent(this, Activity2.class);
        ImageButton button_pill = (ImageButton)this.findViewById(R.id.imagebutton_pill1);
        startActivity(intent);

    }

    // ** Called when the user clicks the Send button */
    public void sendPillMessage2(View view) {


    }

    // ** Called when the user clicks the Send button */
    public void sendPillMessage3(View view) {
        Intent intent = new Intent(this, Activity2.class);
        ImageButton button_pill = (ImageButton)this.findViewById(R.id.imagebutton_pill3);
        startActivity(intent);

    }
}
