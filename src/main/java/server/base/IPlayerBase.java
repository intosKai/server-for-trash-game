package server.base;

import api.IPlayer;
import server.mvc.model.Player;

import java.util.Map;

public interface IPlayerBase extends Cloneable {
    byte addPlayer(Player player) throws ArrayIndexOutOfBoundsException;
    void deletePlayer(byte id);
    void updatePlayer(IPlayer player);
    Map<Byte, IPlayer> getAllPlayer();
    IPlayerBase clone();
}
