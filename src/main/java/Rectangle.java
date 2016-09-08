public class Rectangle {
  private int mLength;

  public Rectangle(int length, int width) {
    mLength = length;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;  }

public boolean isSquare() {
  return mLength == mWidth;
	}


}