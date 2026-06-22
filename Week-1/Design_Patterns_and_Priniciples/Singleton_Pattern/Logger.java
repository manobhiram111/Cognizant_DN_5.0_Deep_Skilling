
public class Logger {
	
	private static Logger log;
	
	private Logger() {
		System.out.println("OBject Created Successfully");
	}
	
	public static Logger getInstance() {
		if(log == null) {
			log = new Logger();
		}
		return log;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l = Logger.getInstance();
		Logger l1 = Logger.getInstance();
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l == l1);
	}

}
