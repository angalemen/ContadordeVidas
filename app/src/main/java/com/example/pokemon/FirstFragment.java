package com.example.pokemon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pokemon.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    int vida1= 25,vida2 = 25, veneno1,veneno2;
    int contador = 0;
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        binding.corazonLleno1.setOnClickListener(view1 -> {

            vida1++;
            binding.texto1.setText(" " + vida1 + "/" + veneno1);

        });

        binding.corazonVacio1.setOnClickListener(view1 -> {

            vida1--;
            binding.texto1.setText(" " + vida1 + "/" + veneno1);

        });

        binding.boton1.setOnClickListener(view1 -> {

            veneno1++;
            binding.texto1.setText(" " + vida1 + "/" + veneno1);

        });

        binding.boton2.setOnClickListener(view1 -> {

            veneno1--;
            binding.texto1.setText(" " + vida1 + "/" + veneno1);

        });

        binding.corazonLleno2.setOnClickListener(view1 -> {

            vida2++;
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.corazonVacio2.setOnClickListener(view1 -> {

            vida2--;
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.boton3.setOnClickListener(view1 -> {

            veneno2++;
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.boton4.setOnClickListener(view1 -> {

            veneno2--;
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.reset.setOnClickListener(view1 -> {

            veneno1 = 0;
            veneno2 = 0;
            vida1 = 25;
            vida2 = 25;

            binding.texto1.setText(" " + vida1 + "/" + veneno1);
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.flechaArriba.setOnClickListener(view1 -> {

            vida1++;
            vida2--;

            binding.texto1.setText(" " + vida1 + "/" + veneno1);
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

        binding.flechaAbajo.setOnClickListener(view1 -> {

            vida1--;
            vida2++;

            binding.texto1.setText(" " + vida1 + "/" + veneno1);
            binding.texto2.setText(" " + vida2 + "/" + veneno2);

        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}