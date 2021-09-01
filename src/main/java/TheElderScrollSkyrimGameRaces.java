/*https://elderscrolls.fandom.com/wiki/The_Elder_Scrolls_Wiki
* Para esse padrão utilizei o tema do jogo The Elder Scroll 5 : Skyrim
*
* */

public class TheElderScrollSkyrimGameRaces {
    private String race;
    private String province;
    private String skillFirst;
    private String skillSecond;
    private String Skillthird;
    private String weaponFirst;
    private String weaponSecond;
    public String getRace() {
        return race;
    }

    public TheElderScrollSkyrimGameRaces setRace(String race) {
        this.race = race;
        return this;
    }

    public String getProvince() {
        return province;
    }

    public TheElderScrollSkyrimGameRaces setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getSkillFirst() {
        return skillFirst;
    }

    public TheElderScrollSkyrimGameRaces setSkillFirst(String skillFirst) {
        this.skillFirst = skillFirst;
        return this;
    }

    public String getSkillSecond() {
        return skillSecond;
    }

    public TheElderScrollSkyrimGameRaces setSkillSecond(String skillSecond) {
        this.skillSecond = skillSecond;
        return this;
    }

    public String getSkillthird() {
        return Skillthird;
    }

    public TheElderScrollSkyrimGameRaces setSkillthird(String skillthird) {
        Skillthird = skillthird;
        return this;
    }

    public String getWeaponFirst() {
        return weaponFirst;
    }

    public TheElderScrollSkyrimGameRaces setWeaponFirst(String weaponFirst) {
        this.weaponFirst = weaponFirst;
        return this;
    }

    public String getWeaponSecond() {
        return weaponSecond;
    }

    public TheElderScrollSkyrimGameRaces setWeaponSecond(String weaponSecond) {
        this.weaponSecond = weaponSecond;
        return this;
    }


}
