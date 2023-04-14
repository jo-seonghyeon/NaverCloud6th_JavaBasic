
public class TvMain {

	public static void main(String[] args) {
		Tv t1 = new Tv("LG", 500000);
		
		for(int i = 0; i < 22; i++) {
			t1.volumeUp();
		}
		t1.volumeDown();
		t1.volumeDown();
		t1.volumeDown();
		
		for(int i = 0; i < 12; i++) {
			t1.channelUp();
		}
		t1.channelDown();
		t1.channelDown();
		t1.channelDown();
		t1.channelDown();
		
		t1.showTvInfo();
		
		Tv t2 = new Tv("SAMSUNG", 700000);
		for(int i = 0; i < 30; i++) {
			t2.volumeUp();
		}
		t2.volumeDown();
		t2.volumeDown();
		t2.volumeDown();
		
		for(int i = 0; i < 70; i++) {
			t2.channelUp();
		}
		t2.channelDown();
		t2.channelDown();
		
		t2.showTvInfo();
	}
	

}
