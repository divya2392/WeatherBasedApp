package com.corvi.weatherbasedapp.data;

import org.json.JSONObject;

/**
 * Created by divya on 17/04/17.
 */

public interface JSONPopulator {
    void populate(JSONObject data);

    JSONObject toJSON();
}
