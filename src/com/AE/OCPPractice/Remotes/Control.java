package com.AE.OCPPractice.Remotes;

import com.AE.OCPPractice.Devices.Device;

/**
 * Created by Angel on 5/30/17.
 */
public interface Control  {
    public abstract void connect(Device device);

    public abstract void on(Device device);
    public abstract void off(Device device);
}
