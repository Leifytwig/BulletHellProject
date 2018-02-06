package application;

public class Bullet {
	
	private Vector3d        position;
	private Vector3d        velocity;
	private MovementPattern pattern;
	private double 			radius;
	private int 			lifetime;
	
	public Bullet(Vector3d position, Vector3d velocity, MovementPattern pattern, double radius, int lifetime) {
		this.position = position;
		this.velocity = velocity;
		this.pattern  = pattern;
		this.radius   = radius;
		this.lifetime = lifetime;
	}
	
	public int getLifetime() {
		return lifetime;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Vector3d getPosition() {
		return position;
	}
	
	public Vector3d getVelocity() {
		return velocity;
	}
	
	public void setPosition(Vector3d v) {
		position.set(v);
	}
	
	public void setVelocity(Vector3d v) {
		velocity.set(v);
	}
	
	public void updateState() {
		if(lifetime > 0) {
			lifetime -= 1;
		}
		
		setVelocity(pattern.next());
		position.adjust(velocity);
	}
}