package com.project.geriarticcare.alarm;

import com.project.geriarticcare.BasePresenter;
import com.project.geriarticcare.BaseView;
import com.project.geriarticcare.data.source.History;
import com.project.geriarticcare.data.source.MedicineAlarm;

/**
 * Created by gautam on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
