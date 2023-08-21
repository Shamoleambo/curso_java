package rentArrayOop;

public class Tenant {

	private String name;
	private String email;
	private int room;
	
	public Tenant(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public int getRoom() {
		return this.room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return String.format("Name: %s%nEmail: %s%nRoom: %d", this.name, this.email, this.room);
	}
}
