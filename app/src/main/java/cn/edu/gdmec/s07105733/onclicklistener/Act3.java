package cn.edu.gdmec.s07105733.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Button button = (Button) findViewById(R.id.button3);
        button.setText("ACT3");
        button.setOnClickListener(new OuterClass());//注册外部类监听器
    }
    class OuterClass implements OnClickListener {
//内部
        @Override
        public void onClick(View v) {

            Toast.makeText(Act3.this,"已单击3...",Toast.LENGTH_SHORT).show();
            System.out.println("已单击3...");
        }
    }
}
