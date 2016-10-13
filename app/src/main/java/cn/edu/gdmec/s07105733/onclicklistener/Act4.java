package cn.edu.gdmec.s07105733.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        Button button = (Button) findViewById(R.id.button4);
        button.setText("ACT4");
        button.setOnClickListener(new OnClickListener() {//+注册匿名类监听器
            @Override
            public void onClick(View v) {
                Toast.makeText(Act4.this, "匿名类监听器...", Toast.LENGTH_SHORT).show();
                System.out.println("已单击4...");
            }
        });
    }
}
