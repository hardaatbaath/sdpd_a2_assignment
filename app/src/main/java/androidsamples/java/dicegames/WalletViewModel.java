package androidsamples.java.dicegames;

import androidx.lifecycle.ViewModel;

public class WalletViewModel extends ViewModel {

  private int Balance = 0;
  private int PrevRoll = 0;
  private int TotalRoll = 0;
  private int SixRoll = 0;
  private int DoubleSix = 0;
  private int DoubleOther = 0;
  private  Die die;

  /**
   * The no argument constructor.
   */
  public WalletViewModel() {
    // TODO implement method
    die = new Die6();
  }

  /**
   * Reports the current balance.
   */
  public int balance() {
    // TODO implement method
    return Balance;
  }

  /**
   * Rolls the {@link Die} in the wallet and implements the changes accordingly.
   */
  public void rollDie() {
    // TODO implement method
    PrevRoll = dieValue();
    die.roll();
    TotalRoll++;
    int WIN_VALUE = 6;
    int INCREMENT = 5;
    if (die.value() == WIN_VALUE)
    {
      SixRoll++;
      if (PrevRoll == WIN_VALUE)
      {
        DoubleSix++;
        Balance += 2 * INCREMENT;
      } else
      {
        Balance += INCREMENT;
      }
    }
    else if (PrevRoll == die.value())
    {
      Balance -= INCREMENT;
      DoubleOther++;
    }
  }

  /**
   * Reports the current value of the {@link Die}.
   */
  public int dieValue() {
    // TODO implement method
    return die.value();
  }

  /**
   * Reports the number of single (or first) sixes rolled so far.
   */
  public int singleSixes() {
    // TODO implement method
    return SixRoll;
  }

  /**
   * Reports the total number of dice rolls so far.
   */
  public int totalRolls() {
    // TODO implement method
    return TotalRoll;
  }

  /**
   * Reports the number of times two sixes were rolled in a row.
   */
  public int doubleSixes() {
    // TODO implement method
    return DoubleSix;
  }

  /**
   * Reports the number of times any other number was rolled twice in a row.
   */
  public int doubleOthers() {
    // TODO implement method
    return DoubleOther;
  }

  /**
   * Reports the value of the die on the previous roll.
   */
  public int previousRoll() {
    // TODO implement method
    return PrevRoll;
  }

  public void setDie(Die d) {
    // TODO implement method
    die = d;
  }
}
