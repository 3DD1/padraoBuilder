import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheElderScrollSkyrimGameRacesTest {
    /*https://elderscrolls.fandom.com/wiki/Khajiit_(Online)*/
    @Test
    public void retornaUmTipoDeRacaKhajiit(){
        TheElderScrollSkyrimGameRaces races = new TheElderScrollSkyrimGameRaces();
            races.setRace("Khajiit")
                    .setProvince("Elsweyr")
                    .setSkillFirst("Robustness")
                    .setSkillSecond("Lunar Blessings")
                    .setSkillthird("Feline Ambush")
                    .setWeaponFirst("Double Daedric Dagger")
                    .setWeaponSecond("Forest bow and arrow");
    }
    /*https://elderscrolls.fandom.com/wiki/Bosmer_(Online)*/
    @Test
    public void retornaUmTipoDeRacaBosmer(){
        TheElderScrollSkyrimGameRaces races = new TheElderScrollSkyrimGameRaces();
        races.setRace("Bosmer")
                .setProvince("Valenwood")
                .setSkillFirst("Resist Affliction")
                .setSkillSecond("Stealthy")
                .setSkillthird("Acrobat")
                .setWeaponFirst("Bow")
                .setWeaponSecond("DragonBone Battleaxe");
    }

}