package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.databinding.ActivityChangeSizeTextBinding;
import com.example.changesizetext.model.Message;

/**
 * Clase que pide a un usuario un texto y un tamaño mediante un seekbar
 * Despues se inicializa un textView @see {@link ViewMessageActivity}
 */
public class ChangeSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeTextActivity";
    ActivityChangeSizeTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityChangeSizeTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSend.setOnClickListener(view -> {
            //1. Crear objeto Bundle
            Bundle bundle = new Bundle();
            //2. Añadir el mensaje al bundle
            Message message = new Message(((ChangeSizeApplication) getApplication()).getUser(),
                    binding.edMessage.getText().toString(), binding.skSize.getProgress());
            bundle.putSerializable("message", message);
            //3. Enviar el intent con el bundle
            Intent intent = new Intent(this, ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ChangeSizeTextActivity -> onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ChangeSizeTextActivity -> onPause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ChangeSizeTextActivity -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ChangeSizeTextActivity -> onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ChangeSizeTextActivity -> onStop()");
    }
}