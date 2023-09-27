package org.example;

// PermissionManager.java
public class PermissionManager {
    private PermissionLevel mCurrentLevel;

    public PermissionManager() {
        // Initialize the mCurrentLevel to USER
        mCurrentLevel = PermissionLevel.USER;
    }

    // Method to get the name of the current role
    public String getCurrentRoleName() {
        return mCurrentLevel.name();
    }

    // Method to set the current role
    public void setCurrentRole(PermissionLevel newLevel) {
        mCurrentLevel = newLevel;
    }
}
