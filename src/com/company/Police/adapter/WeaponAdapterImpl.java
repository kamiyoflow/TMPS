package com.company.Police.adapter;

public class WeaponAdapterImpl implements WeaponAdapter{
    private Weapon guns;

    public WeaponAdapterImpl(Weapon guns) {
        this.guns = guns;
    }

    @Override
    public String getWeapon(){
        return modifyWithCollimator(guns.getWeapon());
    }

    private String modifyWithCollimator(String gun){
        return (gun+" "+"with collimator");
    }
}
