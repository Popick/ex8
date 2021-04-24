package com.example.ex8;

        import java.util.ArrayList;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText display;
    int sum=0;
    String num="",tar="",answer="None",backanswer=null;
    float val1=0, val2=0;
    Intent s2;
    boolean madd=false, msub=false, mmul=false, mdiv=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(EditText)findViewById(R.id.display);
        Intent gi = getIntent();
        backanswer = gi.getStringExtra("answer");
        display.setText(backanswer);
    }

    public void plus(View view) {
        try {
            num="";
            val1 = Float.parseFloat(display.getText() + "");
            madd = true;
            display.setText("+");        }
        catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Error! "+e,Toast.LENGTH_SHORT).show();
        }
    }

    public void div(View view) {
        try {
            num="";
            val1 = Float.parseFloat(display.getText() + "");
            mdiv = true;
            display.setText("÷");
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Error! "+e,Toast.LENGTH_SHORT).show();
        }}

    public void minus(View view) {
        try {
        num="";
        val1 = Float.parseFloat(display.getText() + "");
        msub = true;
        display.setText("-");
    }catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Error! "+e,Toast.LENGTH_SHORT).show();
        }}

    public void mul(View view) {
        try {
        num="";
        val1 = Float.parseFloat(display.getText() + "");
        mmul = true;
        display.setText("×");
    }catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Error! "+e,Toast.LENGTH_SHORT).show();
        }}


    public void equal(View view) {
        try {
        val2 = Float.parseFloat(display.getText() + "");

        if (madd == true) {
            answer=val1 + val2+"";
            display.setText(answer);
            madd = false;
        }

        if (msub == true) {
            answer=val1 - val2+"";
            display.setText(answer);
            msub = false;
        }

        if (mmul == true) {
            answer=val1 * val2+"";
            display.setText(answer);
            mmul = false;
        }

        if (mdiv == true) {
            answer=val1 / val2+"";
            display.setText(answer);
            mdiv = false;
        }
        }catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Error! "+e,Toast.LENGTH_SHORT).show();
        }}



    public void ac(View view) {
        answer="None";
        display.setText("");
    }

    public void credits(View view) {
        s2 = new Intent(this,scscreen.class);
        s2.putExtra("answer",answer);
        startActivity(s2);
    }

    public void btn_1(View view) {
        num=num+"1";
        display.setText(num);
    }
    public void btn_2(View view) {
        num=num+"2";
        display.setText(num);
    }
    public void btn_3(View view) {
        num=num+"3";
        display.setText(num);
    }
    public void btn_4(View view) {
        num=num+"4";
        display.setText(num);
    }
    public void btn_5(View view) {
        num=num+"5";
        display.setText(num);
    }
    public void btn_6(View view) {
        num=num+"6";
        display.setText(num);
    }
    public void btn_7(View view) {
        num=num+"7";
        display.setText(num);
    }
    public void btn_8(View view) {
        num=num+"8";
        display.setText(num);
    }
    public void btn_9(View view) {
        num=num+"9";
        display.setText(num);
    }
    public void btn_0(View view) {
        num=num+"0";
        display.setText(num);
    }


}

