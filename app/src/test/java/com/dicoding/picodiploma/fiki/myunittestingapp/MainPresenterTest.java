package com.dicoding.picodiploma.fiki.myunittestingapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.hamcrest.core.IsInstanceOf.any;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainPresenterTest {
    @Mock
    private MainPresenter mainPresenter;
    private MainView mainView;

    @Before
    public void setUp(){
        mainView = mock(MainView.class);
        mainPresenter = new MainPresenter(mainView);
    }

    @Test
    public void testVolumeWithIntegerInput() {
        double volume = mainPresenter.volume(2, 8,1);
        assertEquals(16, volume, 0.0001);
    }

    @Test
    public void testVolumeWithDoubleInput() {
        double volume = mainPresenter.volume(2.3, 8.1, 2.9);
        assertEquals(54.026999999999994, volume, 0.0001);
    }
    @Test
    public void testVolumeWithZeroInput() {
        double volume = mainPresenter.volume(0, 0, 0);
        assertEquals(0.0, volume, 0.0001);
    }
}