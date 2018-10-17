package io.github.yashxd.gaitondeapp;

public class GModel {
    private String personName;
    private String deathType;

    public GModel(String personName, String deathType) {
        this.personName = personName;
        this.deathType = deathType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getDeathType() {
        return deathType;
    }

    public void setDeathType(String deathType) {
        this.deathType = deathType;
    }
}
