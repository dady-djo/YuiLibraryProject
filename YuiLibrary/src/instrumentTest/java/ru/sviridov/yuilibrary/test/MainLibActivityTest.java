package ru.sviridov.yuilibrary.test;

import android.test.ActivityInstrumentationTestCase2;

import ru.sviridov.yuilibrary.MainLibActivity;

/**
 * Created by Alex on 15.09.13.
 */
public class MainLibActivityTest extends ActivityInstrumentationTestCase2<MainLibActivity> {

    private MainLibActivity activity;

    public MainLibActivityTest() {
        super(MainLibActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        activity = getActivity();
    }

    public void testConfigAll(){
        assertNull(activity.getViewById());
    }
}
