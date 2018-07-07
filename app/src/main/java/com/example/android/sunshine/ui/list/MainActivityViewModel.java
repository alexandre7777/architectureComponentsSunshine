package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListViewWeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private final SunshineRepository mRepository;

    private final LiveData<List<ListViewWeatherEntry>> mForecast;

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        mForecast = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListViewWeatherEntry>> getForecast() {
        return mForecast;
    }
}
