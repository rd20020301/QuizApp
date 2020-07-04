package uz.include.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int tugri = 0;
    public int xato = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Submit Quiz
    public void submitQuiz(View view) {

        isQuestionOneEmpty();
        editTextQuestionTwo();
        checkboxQuestionThree();
        isQuestionFourEmpty();
        isQuestionOne5Empty();
        isQuestionOne6Empty();
        isQuestionFour7Empty();
        editTextQuestionTwo2();

        Toast.makeText(this,
                "Yakuniy natijangiz!" +
                        "\nTo`g`ri javob: " + tugri +
                        "\nNoto`g`ri javob: " + xato,
                Toast.LENGTH_LONG).show();

        clearQuiz();
    }


    public void clearQuiz() {
        tugri = 0;
        xato = 0;

        RadioGroup radioQuestOne = findViewById(R.id.radio_bir_savol);
        radioQuestOne.clearCheck();

        EditText editQuestTwo = findViewById(R.id.ikki_savol_javob);
        editQuestTwo.setText("");

        EditText editQuestTwo2 = findViewById(R.id.ikki_savol_javob2);
        editQuestTwo2.setText("");

        RadioGroup radioQuestOne5 = findViewById(R.id.radio_bir_savol5);
        radioQuestOne5.clearCheck();

        RadioGroup radioQuestOne6 = findViewById(R.id.radio_bir_savol6);
        radioQuestOne6.clearCheck();

        CheckBox checkboxUbuntu = findViewById(R.id.uzbekistan);
        checkboxUbuntu.setChecked(false);
        CheckBox checkboxMint = findViewById(R.id.japan);
        checkboxMint.setChecked(false);
        CheckBox checkboxAntergos = findViewById(R.id.china);
        checkboxAntergos.setChecked(false);
        CheckBox checkboxSteam = findViewById(R.id.myanma);
        checkboxSteam.setChecked(false);

        RadioGroup radioQuestFour = findViewById(R.id.radio_group_quest_four);
        radioQuestFour.clearCheck();

        RadioGroup radioQuestFour2 = findViewById(R.id.radio_group_quest_yetti);
        radioQuestFour2.clearCheck();
    }

    public void addCorrectPoint() {
        tugri = tugri + 1;
    }

    public void addWrongPoint() {
        xato = xato + 1;
    }

    public void onRadioQuestionOne (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.moscow:

            case R.id.london:
                if (checked)
                    addWrongPoint();
                break;

            case R.id.tashkent:
                if (checked)
                    addCorrectPoint();
                break;
        }
    }

    public void onRadioQuestionOne6 (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.berlin:

            case R.id.rim:

            case R.id.parij:
                if (checked)
                    addWrongPoint();
                break;

            case R.id.madrid:
                if (checked)
                    addCorrectPoint();
                break;
        }
    }

    public void onRadioQuestionOne5 (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.dushanbe:

            case R.id.bishkek:
            case R.id.samarqand:
                if (checked)
                    addWrongPoint();
                break;

            case R.id.nursulton:
                if (checked)
                    addCorrectPoint();
                break;
        }
    }

    public void isQuestionOneEmpty() {
        RadioGroup radioQuestOne = findViewById(R.id.radio_bir_savol);
        if (radioQuestOne.getCheckedRadioButtonId() == -1) {
            addWrongPoint();
        }
    }

    public void isQuestionOne5Empty() {
        RadioGroup radioQuestOne = findViewById(R.id.radio_bir_savol5);
        if (radioQuestOne.getCheckedRadioButtonId() == -1) {
            addWrongPoint();
        }
    }

    public void isQuestionOne6Empty() {
        RadioGroup radioQuestOne = findViewById(R.id.radio_bir_savol6);
        if (radioQuestOne.getCheckedRadioButtonId() == -1) {
            addWrongPoint();
        }
    }
    public void isQuestionFourEmpty() {
        RadioGroup radioQuestFour = findViewById(R.id.radio_group_quest_four);
        if (radioQuestFour.getCheckedRadioButtonId() == -1) {
            addWrongPoint();
        }
    }

    public void isQuestionFour7Empty() {
        RadioGroup radioQuestFour = findViewById(R.id.radio_group_quest_yetti);
        if (radioQuestFour.getCheckedRadioButtonId() == -1) {
            addWrongPoint();
        }
    }

    public void editTextQuestionTwo() {
        EditText editQuestTwo = findViewById(R.id.ikki_savol_javob);
        String questTwoAnswer = editQuestTwo.getText().toString();
        if (questTwoAnswer.equalsIgnoreCase("Uzbekistan")) {
            addCorrectPoint();
        } else {
            addWrongPoint();
        }
    }

    public void editTextQuestionTwo2() {
        EditText editQuestTwo2 = findViewById(R.id.ikki_savol_javob2);
        String questTwoAnswer = editQuestTwo2.getText().toString();
        if (questTwoAnswer.equalsIgnoreCase("OMUC")) {
            addCorrectPoint();
        } else {
            addWrongPoint();
        }
    }

    public void checkboxQuestionThree() {
        CheckBox checkboxchina = findViewById(R.id.china);
        boolean ischina = checkboxchina.isChecked();

        CheckBox checkboxuzbekistan = findViewById(R.id.uzbekistan);
        boolean isuzbekistan = checkboxuzbekistan.isChecked();

        CheckBox checkboxjapan  = findViewById(R.id.japan);
        boolean isjapan = checkboxjapan.isChecked();

        CheckBox checkboxmyanma = findViewById(R.id.myanma);
        boolean ismyanma = checkboxmyanma.isChecked();

        if (ischina && isuzbekistan && ismyanma && !isjapan){
            addCorrectPoint();
        } else {
            addWrongPoint();
        }
    }

    public void onRadioQuestionFour (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.uzbekiya:
                if (checked)
                    addCorrectPoint();
                break;

            case R.id.tadjik:
                if (checked)
                    addWrongPoint();
                break;
        }
    }

    public void onRadioQuestionFour2 (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rossiya:

            case R.id.xitoy:
                if (checked)
                    addWrongPoint();
                break;

            case R.id.amerika:
                if (checked)
                    addCorrectPoint();
                break;
        }
    }
}