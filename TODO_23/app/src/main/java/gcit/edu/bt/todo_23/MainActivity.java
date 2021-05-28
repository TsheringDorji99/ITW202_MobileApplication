package gcit.edu.bt.todo_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CustomReceiver mCustomReceiver = new CustomReceiver ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        IntentFilter filter = new IntentFilter ();
        filter.addAction (Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction (Intent.ACTION_POWER_CONNECTED);

        //Register the receiver using the activity context.
        this.registerReceiver (mCustomReceiver,filter);

    }
    @Override
    protected void onDestroy() {
        this.unregisterReceiver (mCustomReceiver);
        super.onDestroy ();
    }
}