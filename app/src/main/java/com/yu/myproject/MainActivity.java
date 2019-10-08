package com.yu.myproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edHeight;
    private EditText edWeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        findView();
    }
    public void bmi(View view){
        float weight= Float.parseFloat(edWeight.getText().toString());
        float height= Float.parseFloat(edHeight.getText().toString());
        float bmi=weight/(height*height);
        Log.d("Main", "bmi: "+bmi);
    }
    private void findView() {
        edWeight = findViewById(R.id.edWeight);
        edHeight = findViewById(R.id.edHeight);
    }
}
