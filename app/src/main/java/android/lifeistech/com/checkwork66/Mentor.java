package android.lifeistech.com.checkwork66;

/**
 * Created by matsumotokomei on 2018/06/06.
 */

public class Mentor {

    int resId;
    String name;
    int attack;

    public Mentor(int resId, String name, int attack) {
        this.resId = resId;
        this.name = name;
        this.attack = attack;
    }

    public int getResId() {
        return resId;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }
}
