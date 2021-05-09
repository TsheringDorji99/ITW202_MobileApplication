package gcit.edu.todo_143;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pick(View view) {
        DialogFragment newf= new datepickerfragment();
        newf.show(getSupportFragmentManager(),"Date picker");
    }
    public void processDate(int year, int month,int day){
        String month_string=Integer.toString(month+1);
        String day_string=Integer.toString(day);
        String year_string=Integer.toString(year);
        String date_message=(month_string+"/"+day_string+"/"+year_string);
        Toast.makeText(this, "Date:"+date_message, Toast.LENGTH_SHORT).show();

    }

}