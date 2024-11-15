package android.hello_world;
import android.app.Activity;
import android.os.Bundle;
import java.text.DateFormat;
import java.util.Date;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class Hello_worldActivity extends Activity {
    EditText text1;
    TextView view1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);//this name should //follow your xml file's name in layout
        text1= findViewById(R.id.editText1);
        view1= findViewById(R.id.textView1);
    }
    public void onclick(View view)
    {
        String currentDateTimeString = DateFormat.getDateInstance().format(new Date());
        if(text1.getText().toString()==""){
            view1.setText("Hello! Default user! \r\n Now is "+currentDateTimeString);
        }
        else
        {
            view1.setText("Hello! " + text1.getText().toString() + "\r\n Now is " + currentDateTimeString);
        }
    }

}
