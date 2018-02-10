package chaper2;

interface VideoCard {
	void getName();

	void getVideoMemory();
}

interface Memory {
	void getMemoryVolume();

	void getMemoryType();

}

interface CPU {
	void getName();

	void getSpeed();
}

interface AudioCard {
	void getName();
}

interface AudioCard1 {
	void getName();
}

interface Mainboard {
	void setCPU(CPU cpu);

	void setMemory(Memory memory);

	void setVideoCard(VideoCard vc);

	void setAudioCard(AudioCard ac);
}

class VideoCardImpln implements VideoCard {
	public void getName() {
		System.out.println("the video card name is Winfast");
	}

	public void getVideoMemory() {
		System.out.println("the video memory is 256M");
	}
}

class MemoryImpl implements Memory {
	public void getMemoryVolume() {
		System.out.println("the memory volume id 2GB");
	}

	public void getMemoryType() {
		System.out.println("the memory type is DDR2");
	}
}

class CPUImpl implements CPU {
	public void getName() {
		System.out.println("The CPUU name is Intel");
	}

	public void getSpeed() {
		System.out.println("The CPU speed is 2.8G");
	}
}

class AudioCardImpl implements AudioCard {
	public void getName() {
		System.out.println("The audio card name is Ac97");
	}
}

class MainboardImpl implements Mainboard {
	public void setCPU(CPU cpu) {
		cpu.getName();
		cpu.getSpeed();
	}

	public void setMemory(Memory memory) {
		memory.getMemoryVolume();
		memory.getMemoryType();
	}

	public void setVideoCard(VideoCard vc) {
		vc.getName();
		vc.getVideoMemory();
	}

	public void setAudioCard(AudioCard ac) {
		ac.getName();
	}
}

public class InterfaceExample {
	public static void main(String args[]) {
		Mainboard mb = new MainboardImpl();
		mb.setCPU(new CPUImpl());
		mb.setMemory(new MemoryImpl());
		mb.setVideoCard(new VideoCardImpln());
		mb.setAudioCard(new AudioCardImpl());
	}
}
