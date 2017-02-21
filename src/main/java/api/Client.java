package api;


import server.mvc.model.Player;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public abstract class Client {
    private IPlayer player;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    protected Client(ObjectOutputStream out, ObjectInputStream in) {
        this.out = out;
        this.in = in;
    }

    public final void send(IPlayer player) throws IOException {
        out.writeObject(player);
        out.flush();
        out.reset();
    }

}
