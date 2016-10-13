package cn.edu.gdmec.s07105733.onclicklistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置页面布局
        setContentView(R.layout.activity_act2);
        Button button = (Button) findViewById(R.id.button2);
        button.setText("ACT2");
        button.setOnClickListener(new OuterClass());
    }

    class OuterClass implements OnClickListener {

        @Override
        public void onClick(View v) {

            Toast.makeText(Act2.this,"第二...",Toast.LENGTH_SHORT).show();
            System.out.println("已单击2...");
        }
    }
}
