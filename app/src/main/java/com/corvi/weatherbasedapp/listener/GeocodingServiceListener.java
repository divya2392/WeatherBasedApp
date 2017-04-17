package com.corvi.weatherbasedapp.listener;

import com.corvi.weatherbasedapp.data.LocationResult;

/**
 * Created by divya on 17/04/17.
 */

public interface GeocodingServiceListener {
    void geocodeSuccess(LocationResult location);

    void geocodeFailure(Exception exception);
}
