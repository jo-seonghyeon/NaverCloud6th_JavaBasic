
public class Tv {
	String brand;
	int volume;
	int channel;
	int price;
	
	public final static int VOLUME_UP = 1;
	public final static int VOLUME_DOWN = 1;
	public final static int CHANNEL_UP = 1;
	public final static int CHANNEL_DOWN = 1;
	
	public Tv(String t_B, int t_P) {
		brand = t_B;
		volume = 0;
		channel = 0;
		price = t_P;
	}
	
	public void volumeUp() {
		volume += VOLUME_UP;
	}
	public void volumeDown() {
		volume -= VOLUME_DOWN;
	}
	
	public void channelUp() {
		channel += CHANNEL_UP;
	}
	public void channelDown() {
		channel += CHANNEL_DOWN;
	}
	
	
	public void showTvInfo() {
		System.out.println("브랜드: " + brand);
		System.out.println("채널: " + channel);
		System.out.println("볼륨: " + volume);
		System.out.println("가격: " + price);
		System.out.println();
		
	}
}
