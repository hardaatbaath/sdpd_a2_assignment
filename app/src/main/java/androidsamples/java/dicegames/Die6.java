package androidsamples.java.dicegames;

import java.util.Random;

/**
 * An implementation of a six-faced {@link Die} using {@link Random}.
 */
public class Die6 implements Die {
  private static final int FACES = 6;
  private final Random mRng;
  private int mvalue;
  public Die6() {
    // TODO implement method
    mRng = new Random();
  }

  @Override
  public void roll() {
    // TODO implement method
    mvalue = mRng.nextInt(FACES)+1;
  }

  @Override
  public int value() {
    // TODO implement method
    return mvalue;
  }
}
