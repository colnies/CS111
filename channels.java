
public class channels {
	public static void main(String[]args){
		
		int []channels= {2,4,5,7,9,11};
		String []networks= {"CBS","NBC","FOX","ABC","My9","CW"};
		
		int chan=channelLookup(channels, networks, IO.readString());
		System.out.println(chan);
	}
	public static int channelLookup(int[] chans, String[]nets, String net){
		for(int i=0;i<nets.length;i++){
			if(nets[i].equals(net)){
				return chans[i];
			}
		}
		System.out.println("Channel does not exist");
		return 0;
	}
	public static String networkLookup(int[] chans, String []net,int chan){
		for(int i=0;i<chans.length;i++){
			if(chans[i]==chan){
				return net[i];
			}
	}
		return"Channel does not exist";
}
}
