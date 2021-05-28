package gcit.edu.bt.todo_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        mTextView =findViewById (R.id.textView1);
        mTextView.setText (R.string.napping);

        SimpleAsyncTask simpleAsyncTask = (SimpleAsyncTask) new SimpleAsyncTask (mTextView).execute ();
    }
}