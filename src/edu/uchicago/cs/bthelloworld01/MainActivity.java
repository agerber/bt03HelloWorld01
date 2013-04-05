package edu.uchicago.cs.bthelloworld01;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	// step 1: declare variables
	EditText edtMessage;
	Button btnShow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// step 2: get references to objects
		edtMessage = (EditText) findViewById(R.id.edtMessage);
		btnShow = (Button) findViewById(R.id.btnShow);

		// step 3: register event-listeners
		btnShow.setOnClickListener(this);
		// step 4: let enclosing activity implement listener
		// step 5: add unimplemented methods
	}

	@Override
	public void onClick(View v) {
		// step 6: program behavior
		String strMessage = edtMessage.getText().toString();
		Toast.makeText(getApplicationContext(),
				"This is your message: " + strMessage, Toast.LENGTH_SHORT)
				.show();

	}

}
