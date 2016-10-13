package cn.edu.gdmec.s07105733.onclicklistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setText("ACT1");
        button.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"已单击1...",Toast.LENGTH_SHORT).show();
        System.out.println("已单击我1...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

