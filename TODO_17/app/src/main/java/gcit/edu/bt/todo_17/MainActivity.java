package gcit.edu.bt.todo_17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScore1, mScore2;

    private TextView mt1, mt2;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.night_mode)
        {
            int nightmode = AppCompatDelegate.getDefaultNightMode();
            if(nightmode == AppCompatDelegate.MODE_NIGHT_YES)
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            else
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        mt1 = findViewById (R.id.score1);
        mt2 = findViewById (R.id.score2);

        if (savedInstanceState != null) {
            mScore1 = savedInstanceState.getInt("score1");
            mScore2 = savedInstanceState.getInt("Score2");

            //Set the score text views
            mt1.setText(String.valueOf(mScore1));
            mt2.setText(String.valueOf(mScore2));
        }
    }

    public void add1(View view) {
        int viewID = view.getId ();
        switch (viewID){
            case R.id.add1:
                mScore1++;
                mt1.setText (String.valueOf (mScore1));
                break;
            case R.id.add2:
                mScore2++;
                mt2.setText (String.valueOf (mScore2));
        }
    }

    public void min1(View view) {
        int viewID = view.getId ();
        switch (viewID){
            case R.id.min1:
                mScore1--;
                mt1.setText (String.valueOf (mScore1));
                break;
            case R.id.min2:
                mScore2--;
                mt2.setText (String.valueOf (mScore2));
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save the scores.
        outState.putInt("score1", mScore1);
        outState.putInt("score2", mScore2);
        super.onSaveInstanceState(outState);
    }
}