package chapter4;

public class Box {
	private int height, width, length;
	private boolean full;
	
	public Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
		full = false;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}
	
	public void setDimensions(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", length=" + length + ", full=" + full + "]";
	}
	
	
}
