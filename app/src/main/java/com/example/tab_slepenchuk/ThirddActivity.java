package com.example.tab_slepenchuk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class ThirddActivity extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @Nullable Bundle sevedInstanseState)
    {
        return inflater.inflate(R.layout.third_main, container, false);
    }

}
