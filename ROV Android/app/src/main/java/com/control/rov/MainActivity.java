package com.control.rov;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button open, close, up, down, left, right, armu, armd, armr, arml, pressure, temprature;
    SeekBar speed;
    RadioButton forward, backward;
    TextView speeed;
    RadioGroup dir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {

            actionBar.hide();

        }

        //Initialize components
        define();


        open.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "open1");
                        open.setTextColor(0xffffffff);

                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "open0");
                        open.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        close.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "close1");
                        close.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "close0");
                        close.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        up.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "up1");

                        up.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "up0");
                        up.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        down.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "down1");
                        down.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "down0");
                        down.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "left1");
                        left.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "left0");
                        left.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED


                        Log.d("ROV", "right1");
                        right.setTextColor(0xffffffff);

                        return true; // if you want to handle the touch event`
                    case MotionEvent.ACTION_UP:
                        // RELEASED


                        Log.d("ROV", "right0");
                        right.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        armu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "armu1");
                        armu.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "armu0");
                        armu.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        arml.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "arml1");
                        arml.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        Log.d("ROV", "arml0");
                        arml.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        armd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "armd1");
                        armd.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "armd0");
                        armd.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        armr.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED


                        Log.d("ROV", "armr1");
                        armr.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED

                        Log.d("ROV", "armr0");
                        armr.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        //Start pressure process
        pressure.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED

                        Log.d("ROV", "pressure");
                        pressure.setTextColor(0xffffffff);


                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        pressure.setTextColor(0xffffc107);


                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        //Start temperature process
        temprature.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        Log.d("ROV", "temprature");
                        temprature.setTextColor(0xffffffff);


                        return true;// if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        pressure.setTextColor(0xffffc107);

                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


        //Sets speed by pwm & duty cycle
        speed.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                speeed.setText("Speed By PWM : " + String.valueOf(seekBar.getProgress()));

                Log.d("ROV", "Speed =" + String.valueOf(seekBar.getProgress()));

            }


            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }


            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                speeed.setText("Speed By PWM : " + String.valueOf(seekBar.getProgress()));

            }


        });


        dir.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.radioButton2:


                        //Case 1
                        Log.d("ROV", "for");

                        break;

                    case R.id.radioButton:

                        //Case 2
                        Log.d("ROV", "back");

                        break;

                }


            }
        });


    }


    public void define() {


        open = (Button) findViewById(R.id.button10);
        close = (Button) findViewById(R.id.button9);
        up = (Button) findViewById(R.id.button);
        down = (Button) findViewById(R.id.button3);
        left = (Button) findViewById(R.id.button2);
        right = (Button) findViewById(R.id.button4);
        armu = (Button) findViewById(R.id.button7);
        armd = (Button) findViewById(R.id.button8);
        armr = (Button) findViewById(R.id.button6);
        arml = (Button) findViewById(R.id.button5);
        pressure = (Button) findViewById(R.id.button11);
        temprature = (Button) findViewById(R.id.button12);


        speed = (SeekBar) findViewById(R.id.seekBar);


        speeed = (TextView) findViewById(R.id.textView);


        dir = (RadioGroup) findViewById(R.id.radioGroup);


        forward = (RadioButton) findViewById(R.id.radioButton2);
        backward = (RadioButton) findViewById(R.id.radioButton);


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
