package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class scscreen extends AppCompatActivity {
    String answer;
    TextView bracha;
    Intent s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scscreen);

        Intent gi = getIntent();

        answer = gi.getStringExtra("answer");

        bracha = (TextView) findViewById(R.id.pazmalul);

        bracha.setText("מעיין שלנו,\n" +
                "כשמך כך אתה:\n" +
                "מים זכים, טהורים וצלולים,\n" +
                "הזורמים במסלולם ומעניקים חיים.\n" +
                "מעייני, הגעת לגיל מצוות חבר-\n" +
                "ועל ההזדמנות לעשות לך בושות, לא אוותר!\n" +
                "אז כיוון שאני הדודה שאתה הכי אוהב,\n" +
                "לקחתי על עצמי לכתוב לך משהו, ממש מהלב.\n" +
                "אני מבקשת לך לאחל,\n" +
                "את כל אשר ליבך אליו מייחל:\n" +
                "שתמשיך להצטיין בלימודים,\n" +
                "לשחק במחשב ולהסתבך עם דרקונים…\n" +
                "שתשאר ממש כפי שהינך:\n" +
                "עדין, מנומס ורגיש,\n" +
                "עם קסם אישי שמפיל כל אישה ואיש.\n" +
                "אבל מעיין,\n" +
                "וזהו עצם העניין,\n" +
                "על בנות עוד לא שמענו – והגיע הזמן!!!\n" +
                "אז קדימה חבר,\n" +
                "אל תוותר,\n" +
                "והעיקר- אל תשכח ה-כ-ל לי לספר!\n" +
                "מעייני,\n" +
                "שמחתנו מהולה אמנם בעצב\n" +
                "על סבא רחמים ז”ל-\n" +
                "שלצערנו לא זכה להגיע לרגע המיוחל-\n" +
                "ובגלל זה אני רוצה בהזדמנות זו החגיגית,\n" +
                "להעניק לך קמע כסמל לשמחת-החיים.\n" +
                "אותה מתנה שנותן אלוהים,\n" +
                "רק לאלו מאיתנו שלכך באמת ראויים!\n" +
                "באהבת ענק,\n" +
                "אמא של שמעוני\n"+answer+" זה המספר המבוקש");
    }


    public void goback(View view) {
        s1 = new Intent(this,MainActivity.class);
        s1.putExtra("answer",answer);
        startActivity(s1);
    }
}