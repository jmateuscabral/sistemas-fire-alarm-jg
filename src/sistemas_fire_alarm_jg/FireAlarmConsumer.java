package sistemas_fire_alarm_jg;

import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.Receiver;

public class FireAlarmConsumer {
	public String await(){
        try{
            JChannel channel = new JChannel();
//            Receiver receiver = new MyReceiver("rec1");
            MyReceiver receiver = new MyReceiver("Exemplo receiver");
            channel.setReceiver(receiver);
            channel.connect("AlarmChannel");
            Message msg = (Message)channel.receive(0);
            return(String)msg.getObject();
        }
        catch(Exception e){
            return null;
        }
    }
}
