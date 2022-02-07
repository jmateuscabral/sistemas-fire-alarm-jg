package sistemas_fire_alarm_jg;

import org.jgroups.ReceiverAdapter;
import org.jgroups.Message;
import org.jgroups.View;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MeuReceiver extends ReceiverAdapter {
    protected final Collection<Message> msgs=new ConcurrentLinkedQueue<Message>();
    protected final String name;

    public MeuReceiver(String name) {
        this.name=name;
    }

    public Collection<Message> getMsgs() {
        return msgs;
    }

    public void clear() {msgs.clear();}

    public void receive(Message msg) {
        System.out.println("[" + name + "] Mensagem recebida: " + msg.toStringAsObject());
        msgs.add(msg);
    }

    public void viewAccepted(View new_view) {
        System.out.println("[" + name + "] view: " + new_view);
    }
}