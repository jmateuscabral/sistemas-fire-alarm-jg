package sistemas_fire_alarm_jg;

public class Server {
	
	public static void main(String [] args){ 
		FireAlarmConsumer alarmCall = new FireAlarmConsumer();
		String msg = alarmCall.await();
		System.out.println("\nAlarme Recebido: " + msg);
	}
	
}
