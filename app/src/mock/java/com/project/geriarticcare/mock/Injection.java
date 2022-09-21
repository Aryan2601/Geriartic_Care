package com.project.geriarticcare.mock;

import android.content.Context;
import androidx.annotation.NonNull;

import com.project.geriarticcare.data.source.MedicineRepository;
import com.project.geriarticcare.data.source.local.MedicinesLocalDataSource;



public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
