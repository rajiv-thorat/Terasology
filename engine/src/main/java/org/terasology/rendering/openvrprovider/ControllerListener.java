package org.terasology.rendering.openvrprovider;

import jopenvr.JOpenVRLibrary;
import jopenvr.VRControllerState_t;

/* Interface intended to be front-facing to user for controller interaction. */
public interface ControllerListener {
    int LEFT_CONTROLLER = 0;
    int RIGHT_CONTROLLER = 1;
    int EAXIS_TRIGGER = 1;
    int EAXIS_TOUCHPAD = 0;
    long BUTTON_TOUCHPAD = (1L << JOpenVRLibrary.EVRButtonId.EVRButtonId_k_EButton_SteamVR_Touchpad);
    long BUTTON_TRIGGER = (1L << JOpenVRLibrary.EVRButtonId.EVRButtonId_k_EButton_SteamVR_Trigger);
    long BUTTON_APP_MENU = (1L << JOpenVRLibrary.EVRButtonId.EVRButtonId_k_EButton_ApplicationMenu);
    long BUTTON_GRIP = (1L << JOpenVRLibrary.EVRButtonId.EVRButtonId_k_EButton_Grip);
    float TRIGGER_THRESHOLD = .25f;

    void buttonStateChanged(VRControllerState_t stateBefore, VRControllerState_t stateAfter, int nController);
    // TODO: touch, axes
}