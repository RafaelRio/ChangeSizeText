package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.databinding.ActivityChangeSizeTextBinding;
import com.example.changesizetext.databinding.ActivityViewMessageBinding;
import com.example.changesizetext.model.Message;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en la clase ChangeSizeTextActivity.
 * Se configura el componente textView con un texto y un tamaño de fuente
 * @author Rafa Rio
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeProject";
    ActivityViewMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //1. Recoger intent
        Intent intent = getIntent();
        //2. Recoger el mensaje
        Message message = (Message) intent.getExtras().getSerializable("message");
        //3. Actualizamos la vista
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());

        /*
        Todas las Activitys tienen acceso a la informacion de la clase Application desde el metodo
        getApplication(). Para ello se debe hacer un casting explicito
         */
        Log.d(TAG, ((ChangeSizeApplication)getApplication()).getUser().toString());
    }
}