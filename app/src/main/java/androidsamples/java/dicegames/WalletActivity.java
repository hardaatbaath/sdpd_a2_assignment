package androidsamples.java.dicegames;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class WalletActivity extends AppCompatActivity {
  private TextView textBalance;
  private TextView prevRoll;
  private TextView sixRoll;
  private TextView totalRoll;
  private TextView doubleSix;
  private TextView doubleOther;
  private final int WIN_VALUE = 6;
  private Button btnDie;
  private WalletViewModel wallet;

  @SuppressLint("SetTextI18n")
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_wallet);

    textBalance = findViewById(R.id.txt_coins);
    prevRoll = findViewById(R.id.txt_prev_roll);
    sixRoll = findViewById(R.id.txt_single_sixes);
    totalRoll = findViewById(R.id.txt_total_rolls);
    doubleSix = findViewById(R.id.txt_double_sixes);
    doubleOther = findViewById(R.id.txt_double_others);
    btnDie = findViewById(R.id.btn_die);
    wallet = new ViewModelProvider(this).get(WalletViewModel.class);
    updateUI();
    btnDie.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view) {
        wallet.rollDie();
        if(wallet.dieValue()==WIN_VALUE) {
          CharSequence text = "Congratulations!";
          int duration = Toast.LENGTH_SHORT;
          Toast toast = Toast.makeText(getApplicationContext()/* MyActivity */, text, duration);
          toast.show();
        }
        updateUI();
      }
    });
  }

  @SuppressLint("SetTextI18n")
  public void updateUI(){
    btnDie.setText(Integer.toString(wallet.dieValue()));
    textBalance.setText(Integer.toString(wallet.balance()));
    prevRoll.setText(Integer.toString(wallet.previousRoll()));
    totalRoll.setText(Integer.toString(wallet.totalRolls()));
    sixRoll.setText(Integer.toString(wallet.singleSixes()));
    doubleSix.setText(Integer.toString(wallet.doubleSixes()));
    doubleOther.setText(Integer.toString(wallet.doubleOthers()));
  }
}