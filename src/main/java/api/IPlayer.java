package api;

public interface IPlayer {
    byte getId();
    short getY();
    void setY(short y);
    short getX();
    void setX(short x);
    boolean isDirection();
    void setDirection(boolean direction);
    byte getCurAnim();
    void setCurAnim(byte curAnim);
    byte getHeroType();
    void setHeroType(byte heroType);
    void setId(byte id);
}
