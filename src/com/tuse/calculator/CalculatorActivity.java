package com.tuse.calculator;

//import android.R.string;
import android.R.integer;
import android.R.string;
import android.app.Activity;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends Activity {
	
	EditText editText;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bplus,bminus,bmul,bpoint,bequal,bdiv,bac;
	
	
    /** Called when the activity is first created. */
    @Override  
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        editText=(EditText)findViewById(R.id.editText);
        
        
        //1.........................................
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"1");		
			}
		});
        
        //2............................................
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"2");		
			}
		});
        
        //3...........................................
        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"3");		
			}
		});
        
        //4.............................................
        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"4");		
			}
		});
        
        //5.............................................
        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"5");		
			}
		});
        
        //6............................................
        b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"6");		
			}
		});
        
        //7.............................................
        b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"7");		
			}
		});
        
        //8.............................................
        b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"8");		
			}
		});
        
        //9..............................................
        b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"9");		
			}
		});
        
        //0.............................................
        b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"0");		
			}
		});
        
        //+............................................
        bplus=(Button)findViewById(R.id.bplus);
        bplus.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"+");		
			}
		});
        
        //-............................................
        bminus=(Button)findViewById(R.id.bminus);
        bminus.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"-");		
			}
		});
        
        //x............................................
        bmul=(Button)findViewById(R.id.bmul);
        bmul.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"x");		
			}
		});
        
        //Division.......................................
        bdiv=(Button)findViewById(R.id.bdiv);
        bdiv.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+"/");		
			}
		});
        
        //Point.........................................
        bpoint=(Button)findViewById(R.id.bpoint);
        bpoint.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String x=editText.getText().toString();
				editText.setText(x+".");		
			}
		});
        
        //AC Button......................................
        bac=(Button)findViewById(R.id.bac);
        bac.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//String x=editText.getText().toString();
				editText.setText("");		
			}
		});
        
        //Equal.............................................
        bequal=(Button)findViewById(R.id.bequal);
        bequal.setOnClickListener(new OnClickListener() {	
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String fulltext=editText.getText().toString();
				
				
				char checkSign='\0';
				int indexNumber=0;
				
				for(int i=0;i < fulltext.length();i++){
					checkSign=fulltext.charAt(i);
					if(checkSign == '+'){
						indexNumber=i;
						break;
					}
					else if(checkSign == '-'){
						indexNumber=i;
						break;
					}
					else if(checkSign == 'x'){
						indexNumber=i;
						break;
					}
					else if(checkSign == '/'){
						indexNumber=i;
						break;
					}
					else {
						continue;
					}
				}
				
				String firstHalf,secondHalf;
				Double frst,scnd;
				
				firstHalf=fulltext.substring(0, indexNumber);
				secondHalf=fulltext.substring(indexNumber+1, fulltext.length());
				
				frst=Double.parseDouble(firstHalf);
				scnd=Double.parseDouble(secondHalf);
				
				
				
				if(checkSign == '+'){
					Double total=frst+scnd;
					String xyz=Double.toString(total);
					
					editText.setText(xyz);	
				}
				else if(checkSign == '-'){
					Double total=frst-scnd;
					String xyz=Double.toString(total);
					
					editText.setText(xyz);
				}
				else if(checkSign == 'x'){
					Double total=frst*scnd;
					String xyz=Double.toString(total);
					
					editText.setText(xyz);
				}
				else if(checkSign == '/'){		
					if(frst==0){
						if(scnd==0){
							editText.setText("1");
						}
						else {
							editText.setText("Error");
						}
					}
					else if(scnd==0){
						if(frst==0){
							editText.setText("1");
						}
						else {
							editText.setText("Error");
						}
					}
					else{
						Double total=frst/scnd;
						String xyz=Double.toString(total);					
						editText.setText(xyz);
					}
				}	
			}
		});     
    } 
}