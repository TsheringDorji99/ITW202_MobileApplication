package gcit.edu.todo_142;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alert(View view) {
        AlertDialog.Builder myalert=new AlertDialog.Builder(MainActivity.this);
        myalert.setTitle("Alert");
        myalert.setMessage("click to continue, or Cancel to stop");
        myalert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You have pressed ok", Toast.LENGTH_SHORT).show();
            }
        });
        myalert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "You have clicked Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        myalert.show();

    }
}