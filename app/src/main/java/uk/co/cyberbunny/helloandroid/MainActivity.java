package uk.co.cyberbunny.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // Remove underlines from HTML links
        TextView txtUrladdress = (TextView)findViewById(R.id.add);

        // Make sure the TextView was instantiated correctly
        if(txtUrladdress != null) {
            URLSpanNoUnderline.removeUnderlines((Spannable)txtUrladdress.getText());



    ImageView imageView = (ImageView) findViewById(R.id.ud1);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("http://www.udacity.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}

    public void goToUrl(View view) {
    }
}
