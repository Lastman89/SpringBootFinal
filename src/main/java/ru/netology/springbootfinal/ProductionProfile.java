package ru.netology.springbootfinal;

import ru.netology.springbootfinal.systemProfile.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
