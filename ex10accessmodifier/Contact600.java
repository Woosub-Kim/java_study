package ex10accessmodifier;

public class Contact600 {
	SneezeCap sneeze = new SneezeCap();
	SinivelCap sinvel = new SinivelCap();
	SnuffleCap snuffle = new SnuffleCap();
	
	public void take() {
		sinvel.take();
		sneeze.take();
		snuffle.take();
	}
}
