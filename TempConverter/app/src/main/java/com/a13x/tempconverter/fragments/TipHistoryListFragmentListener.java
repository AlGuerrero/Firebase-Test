package com.a13x.tempconverter.fragments;

import com.a13x.tempconverter.models.TipRecord;

/**
 * Created by Alejandro on 11/11/2016.
 */

public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
