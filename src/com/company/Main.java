package com.company;

public class Main {

    public static <Weapon> void main(String[] args) {
	Weapon weapon = new Weapon();
	weapon.setWeaponType("Firearms");
	weapon.setWeaponName("Rifle");
	Boss boss = new Boss();
	boss.setWeaponBoss(weapon);
	boss.setDamage(70);
	boss.sethealth(900);
	boss.setDefenseType("Physical");

        System.out.println("Тип урона Босса - " + boss.getdefenseType() + "; " + "Урон Босса - " + boss.getDamage() + "; "
         + "Здоровье Босса" - " + boss.getHealth() + "; " +
          "Имя оружия Босса" - "+ boss.getWeaponBoss().getWeaponName() + "; " +" +
          "Тип оружия Босса - " + boss.getweaponBoss().getWeaponTType());

        System.out.println("Тип урона Босса - " + boss.getdefenseType());
        System.out.println("Урон Босса - " + boss.getDamage());
        System.out.println("Здоровье Босса - " + boss.getHealth());
        System.out.println("Тип оружия Босса - " + boss.getWeaponBoss().getWeaponType());
        System.out.println("Имя оружия Босса - " + boss.getWeaponBoss().getweaponName());


    }
}
