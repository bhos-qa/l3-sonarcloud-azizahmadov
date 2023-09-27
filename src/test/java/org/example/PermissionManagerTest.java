package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermissionManagerTest {
    private PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    void testGetCurrentRoleName() {
        assertEquals("USER", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentRole(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentRole(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.getCurrentRoleName());
    }

    @Test
    void testSetCurrentRole() {
        permissionManager.setCurrentRole(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentRole(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.getCurrentRoleName());

        permissionManager.setCurrentRole(PermissionLevel.USER);
        assertEquals("USER", permissionManager.getCurrentRoleName());
    }
}