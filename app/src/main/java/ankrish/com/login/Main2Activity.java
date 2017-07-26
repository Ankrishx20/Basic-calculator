package ankrish.com.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine ,zero, equal, plus,sub,div,mul ,clear;
    int i, num1, num2, ans, flag = 0;
    TextView text;
    String call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text = (TextView) findViewById(R.id.screen);

        zero= (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four=(Button) findViewById(R.id.four);
        five= (Button) findViewById(R.id.five);
        six= (Button) findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine= (Button) findViewById(R.id.nine);


        equal = (Button) findViewById(R.id.equal);
        plus = (Button) findViewById(R.id.plus);
        sub= (Button) findViewById(R.id.sub);
        div= (Button) findViewById(R.id.div);
        mul= (Button) findViewById(R.id.mul);
        clear= (Button) findViewById(R.id.reset);


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    flag = 0;
                    text.setText(zero.getText().toString());
                } else
                    text.setText(text.getText().toString() + zero.getText().toString());
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    flag = 0;
                    text.setText(one.getText().toString());
                } else
                    text.setText(text.getText().toString() + one.getText().toString());
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1)
                {
                    flag=0;
                    text.setText(two.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + two.getText().toString());
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {
                    flag=0;
                    text.setText(three.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + three.getText().toString());
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {
                    flag=0;
                    text.setText(four.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + four.getText().toString());
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1) {
                    flag=0;
                    text.setText(five.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + five.getText().toString());
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1)
                {
                    flag=0;
                    text.setText(six.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + six.getText().toString());
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1)
                {
                    flag=0;
                    text.setText(seven.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + seven.getText().toString());
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1)
                {
                    flag=0;
                    text.setText(eight.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + eight.getText().toString());
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==1)
                {
                    flag=0;
                    text.setText(nine.getText().toString());
                }
                else
                    text.setText(text.getText().toString() + nine.getText().toString());
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String call;
                try{
                    num1 = Integer.parseInt(text.getText().toString());
                    text.setText("");
                }
                catch (Exception e)
                {

                }
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String call= "sub";
                try{
                    num1=Integer.parseInt(text.getText().toString());
                    text.setText("");
                }
                catch (Exception e)
                {
                }
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String call= "mul";
                try {
                    num1 = Integer.parseInt(text.getText().toString());
                    text.setText("");
                }
                catch (Exception e)
                {
                }
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String call= "div";
                try {
                    num1 = Integer.parseInt(text.getText().toString());
                    text.setText("");
                }
                catch (Exception e)
                {
                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num2 = Integer.parseInt(text.getText().toString());


                    switch (call){
                        case "sum":
                            ans = num1 + num2;
                            break;
                        case "sub":
                            ans=num2-num1;
                            break;
                    }

                    text.setText(ans + "");
                    num1 = 0;
                    num2 = 1;
                    flag = 1;
                }

                catch (Exception e) {
                    Log.e("error", e.getMessage().toString());
                    Toast.makeText(Main2Activity.this, "Error" + e.getMessage().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
