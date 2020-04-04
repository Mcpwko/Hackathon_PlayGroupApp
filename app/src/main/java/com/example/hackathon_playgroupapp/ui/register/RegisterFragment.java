package com.example.hackathon_playgroupapp.ui.register;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.hackathon_playgroupapp.R;

public class RegisterFragment extends Fragment {

    private RegisterViewModel mViewModel;

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        if (container != null) {
            container.removeAllViews();
        }

        return inflater.inflate(R.layout.register_fragment, container, false);



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RegisterViewModel.class);
        // TODO: Use the ViewModel


        //Get the text of the EditText
        EditText username = getView().findViewById(R.id.username);
        EditText phoneNumber = getView().findViewById(R.id.phonenumber);
        EditText email = getView().findViewById(R.id.email);
        EditText password = getView().findViewById(R.id.password);


        //Set a client object and set all his variables with the Edittext






    }

    //Give as parameter a client object
    public void register(){




    }


}
