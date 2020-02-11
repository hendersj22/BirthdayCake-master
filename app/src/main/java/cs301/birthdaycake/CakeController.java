package cs301.birthdaycake;

import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener
{
     CakeView cakeView1;
     CakeModel cakeModel1;

     public CakeController(CakeView view)
     {
         cakeView1 = view;
         cakeModel1 = cakeView1.getModel();
     }



    @Override
    public void onClick(View view) {
        Log.d(null, "clicked");
        cakeModel1.isLit = false;
        cakeView1.invalidate();
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel1.hasCandles = b;
        cakeView1.invalidate();

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        cakeModel1.numCandles = i;
        cakeView1.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        cakeModel1.xCord = motionEvent.getX();
        cakeModel1.yCord = motionEvent.getY();
        cakeView1.invalidate();
        Log.d("test", "dubf");
        return true;
    }
}
