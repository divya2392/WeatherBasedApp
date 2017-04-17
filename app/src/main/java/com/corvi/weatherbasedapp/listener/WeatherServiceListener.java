package com.corvi.weatherbasedapp.listener;

import com.corvi.weatherbasedapp.data.Channel;

/**
 * Created by divya on 17/04/17.
 */

public interface WeatherServiceListener {
    void serviceSuccess(Channel channel);

    void serviceFailure(Exception exception);
}
