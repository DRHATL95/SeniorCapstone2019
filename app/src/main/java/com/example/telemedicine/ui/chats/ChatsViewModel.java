package com.example.telemedicine.ui.chats;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChatsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChatsViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}