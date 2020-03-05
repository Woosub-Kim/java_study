package ex10accessmodifier;
//시나리오 감기환자는 아래 1,2,3 순으로 약을 복용해야 한다.

class SnuffleCap{
	public void take() {
		System.out.println("3.코막힘이 치료됩니다.");
	}
}
class SneezeCap{
	public void take() {
		System.out.println("2.기침이 멈춥니다.");
	}
}
class SinivelCap{
	public void take() {
		System.out.println("1.콧물이 맘춥니다.");
	}
}

class ColdPatient{
	SneezeCap sneeze = new SneezeCap();
	SinivelCap sinivel = new SinivelCap();
	SnuffleCap snuffle = new SnuffleCap();
	public void take() {
		snuffle.take();
		sinivel.take();
		sneeze.take();
	}
}
class ColdPatientCapsule {
	Contact600 contact600 = new Contact600();
	public void take() {
		contact600.take();
	}
}

public class ColdPatientMain {
	
	public static void main(String[] args) {
		
		ColdPatient patient = new ColdPatient();
		patient.take();
		
		ColdPatientCapsule patient2 = new ColdPatientCapsule();
		patient2.take();
	}

}
