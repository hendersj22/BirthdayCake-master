package cs301.birthdaycake;

import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;


public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener,
        View.OnTouchListener
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
        public boolean onTouch(View v, MotionEvent event) {

            int x = (int) event.getX();
            int y = (int) event.getY();
            cakeModel1.x = x;
            cakeModel1.y = y;
            cakeView1.invalidate();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.i("TAG", "touched down");
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.i("TAG", "moving: (" + x + ", " + y + ")");
                    break;
                case MotionEvent.ACTION_UP:
                    Log.i("TAG", "touched up");
                    break;
            }

            return true;
        }

}
