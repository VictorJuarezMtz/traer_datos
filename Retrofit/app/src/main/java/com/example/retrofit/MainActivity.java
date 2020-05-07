package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.retrofit.Interface.JsonPlaceHolderApi;
import com.example.retrofit.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {



    private TextView mJsonTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJsonTxtView = findViewById(R.id.jsonText);
        getPosts();
    }


    private void getPosts(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://us-central1-dblackdish.cloudfunctions.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Posts>> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {

                if(!response.isSuccessful()){
                    mJsonTxtView.setText("Codigo: "+response.code());
                    return;
                }

                List<Posts> postsList = response.body();

                for(Posts post: postsList){
                    String content = "";
                    content += "codigo postal:"+ post.getCP() + "\n";
                    content += "categoria:"+ post.getCategoria()+ "\n";
                    content += "direccion:"+ post.getDireccion() +"\n";
                    content += "fechaREgistro:"+ post.getFechaRegistro()+"\n";
                    content += "nombre:"+ post.getNombre() + "\n";
                    content += "telefono:"+ post.getTelefono() + "\n";
                    content += "ciudad :"+ post.getCiudad() +"\n";
                    content += "coordenadas:"+ post.getCoordenadas() + "\n";
                    content += "estado:"+ post.getEstado() + "\n";
                    content += "idrestaurante:"+ post.getIdRestaurante() +"\n";
                    content += "img:"+ post.getImg() +"\n";
                    content += "pais:"+ post.getCategoria() + "\n";
                    content += "rfc:"+ post.getRfc() + "\n\n";
                    mJsonTxtView.append(content);

                }


            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                mJsonTxtView.setText(t.getMessage());

            }
        });

    }
}
