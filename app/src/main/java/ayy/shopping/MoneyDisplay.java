package ayy.shopping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

import ayy.shopping.R;
import ayy.shopping.textreading.OcrCaptureActivity;


public class MoneyDisplay extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_display);

        Intent intent = getIntent();

        String euro = intent.getStringExtra(OcrCaptureActivity.EXTRA_MESSAGE);
        String cent = intent.getStringExtra(OcrCaptureActivity.EXTRA_MESSAGE);

        TextView euroView = new TextView(this);
        TextView centView = new TextView(this);

        euroView.setTextSize(40);
        centView.setTextSize(40);

        euroView.setText(euro);
        centView.setText(cent);


        ViewGroup layout = (ViewGroup) findViewById(R.id.money_display);
        //ViewGroup layout1 = (ViewGroup) findViewById(R.id.money_display);
        layout.addView(euroView);
        layout.addView(centView);

    }
}
