package gcit.edu.bt.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mOperand1, mOperand2;
    TextView mResult;
    calculator mCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOperand1 = findViewById(R.id.et1);
        mOperand2 = findViewById(R.id.et2);
        mResult = findViewById(R.id.tv2);

        mCal = new calculator();
    }

    public void add(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double result = mCal.add(Double.valueOf(operand1), Double.valueOf(operand2));
        mResult.setText(String.valueOf(result));
    }

    public void sub(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double result = mCal.sub(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(result));
    }

    public void mul(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double result = mCal.mul(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(result));
    }

    public void div(View view) {
        String operand1 = mOperand1.getText().toString();
        String operand2 = mOperand2.getText().toString();

        double result = mCal.div(Double.valueOf(operand1),Double.valueOf(operand2));
        mResult.setText(String.valueOf(result));
    }
}