package sistemas_fire_alarm_jg;

import org.jgroups.JChannel;
import org.jgroups.Message;

public class FireAlarmJG{ 
    public void raise(){
        try{
            JChannel channel = new JChannel();
            channel.connect("AlarmChannel");
            Message msg = new Message(null, null, "Mensagem Fire Alarm JG");
            channel.send(msg);
        }
        catch(Exception e){

        }
    }
}