package gcit.edu.bt.todo_23;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import static android.content.Intent.ACTION_POWER_DISCONNECTED;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String intentAction = intent.getAction ();

        if(intentAction != null){
            String toastMessage = "unknown intent action";
            switch(intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "POWER CONNECTED!";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "POWER DISCONNECTED!";
                    break;
            }
            Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show ();
        }
        //throw new UnsupportedOperationException ("Not yet implemented.");
    }
}