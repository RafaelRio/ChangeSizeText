# ChangeSizeText

En este proyecto pedimos al usuario un texto y mediante un SeekBar elegimos el tamaño en el que se muestra en la segunda actividad ViewMessageActivity con
una clase intermedia Message.</br>
-Trozo de codigo para pasar el objeto de una Activity a otra
```java
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
```

-Trozo de codigo para recoger el mensaje con el tamaño en la segunda Activity
```java
        //1. Recoger intent
        Intent intent = getIntent();
        //2. Recoger el mensaje
        Message message = (Message) intent.getExtras().getSerializable("message");
        //3. Actualizamos la vista
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());
```
