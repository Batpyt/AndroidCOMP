package com.example.myapplication1.ui.garbage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GarbageViewModel extends ViewModel
{
    private MutableLiveData<String> mText;

    public GarbageViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("This is garbage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}