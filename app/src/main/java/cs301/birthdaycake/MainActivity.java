package cs301.birthdaycake;

import android.accessibilityservice.AccessibilityButtonController;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cV1;

        CompoundButton cb;

        Switch switch1;
        cV1 = findViewById(R.id.cakeview);
        CakeController CC = new CakeController(cV1);
        switch1 = findViewById(R.id.ButtonSwitch);
        switch1.setOnCheckedChangeListener(CC);


        Button button2;
        button2 = findViewById(R.id.blowOutButton);
        button2.setOnClickListener(CC);

        SeekBar seekBar1;
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar1.setOnSeekBarChangeListener(CC);

        cV1.setOnTouchListener(CC);




    }
}
