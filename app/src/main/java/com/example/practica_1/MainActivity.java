package com.example.practica_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practica_1.databinding.ActivityMainBinding;
import com.example.practica_1.databinding.RelativeTestBinding;
import com.example.practica_1.databinding.ViewBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";//Тег - метка для сообщения
    int duration = Toast.LENGTH_SHORT;
    private TextView textView;
    private ImageView imageView;
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String message = data.getStringExtra("returnMessage");
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void onButtonClick(View view) {
        Log.v(TAG, "Button clicked declared");
        /*EditText editText = findViewById(R.id.enter_point);
        String text = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("message", text);
        startActivityForResult(intent, 1);*/
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewBinding binding = ViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.textView.setText("Строка из кода viewBinding");
        binding.imageView.setImageResource(R.drawable.mem);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button clicked");
            }
        });
    }

}