
package com.example.notesapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Activity for entering a word.
 */

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

    private EditText EditWordView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);
        EditWordView = findViewById(R.id.edit_word);

        Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent reply = new Intent();
            if (TextUtils.isEmpty(EditWordView.getText())) {
                setResult(RESULT_CANCELED, reply);
            } else {
                String word = EditWordView.getText().toString();
                reply.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, reply);
            }
            finish();
        });
    }
}