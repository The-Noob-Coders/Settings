package me.anxuiz.settings;

import java.util.List;

import javax.annotation.Nonnull;

public interface SettingCallbackManager {
    @Nonnull List<SettingCallback> getCallbacks(@Nonnull Setting setting);

    @Nonnull List<SettingCallback> getCallbacks(@Nonnull Setting setting, boolean includeGlobal);

    int getNumCallbacks(@Nonnull Setting setting);

    int getNumCallbacks(@Nonnull Setting setting, boolean includeGlobal);

    boolean hasCallbacks(@Nonnull Setting setting);

    boolean hasCallbacks(@Nonnull Setting setting, boolean includeGlobal);

    boolean addCallback(@Nonnull Setting setting, @Nonnull SettingCallback callback);

    int clearCallbacks(@Nonnull Setting setting);

    boolean removeCallback(@Nonnull Setting setting, @Nonnull SettingCallback callback);

    @Nonnull List<SettingCallback> getGlobalCallbacks();

    boolean addGlobalCallback(@Nonnull SettingCallback callback);

    boolean removeGlobalCallback(@Nonnull SettingCallback callback);

    int notifyChange(@Nonnull SettingManager manager, @Nonnull Setting setting, @Nonnull Object oldValue, @Nonnull Object newValue);

    int notifyChange(@Nonnull SettingManager manager, @Nonnull Setting setting, @Nonnull Object oldValue, @Nonnull Object newValue, boolean includeGlobal);
}
