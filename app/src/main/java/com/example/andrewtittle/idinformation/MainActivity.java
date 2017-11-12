package com.example.andrewtittle.idinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring the variable EditText as "etID" globally as it is at the top of our code
    EditText etID;
    //Declaring the variable TextView as "tvMessage" globally as it is at the top of our code
    TextView tvMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //here we cast "findByView" as an "EditText"
        etID = (EditText) findViewById(R.id.etID);
        //here again we cast "findByView" as an ""TextView
        tvMessage = (TextView) findViewById(R.id.tvMessage);
    }

    //creates a method for "btnSubmit_onClick" to be ran when our button is pressed
    //and the button will be referred to as a "v"
    public void btnSubmit_onClick(View v) {

        /*
        creates a varialbe data type of String called "data" with a value of "etID"
        the ".getText()" method refers to taking the text that was entered by the user
        the ".toString()" method refers to converting the data into a String
          */
        String data = etID.getText().toString();

        /*
        creates a variable data type of String with a value of "DOB"
        the "substring()" method allows us to give an int that starts at 0 and ends at 6
        */
        String DOB = data.substring(0, 6);

        /*
        creates a varialbe data type of Integer called "gender"
        the "Integer.parseInt()" method means we will convert into an integer from a string
        we use the "charAt()" method because we can use any character and set the value to six
        and we add the "" to add a blank string soo the compiler is works with the "parseInt()" method
         */
        int gender = Integer.parseInt(data.charAt(6) + "");

        //creates a variable of String called "sGender"
        String sGender;

        //creates an "if" statment that will compare to our "gender" int
        if (gender >= 5)

            //if "sGender" is greater than or equals "5" then "sGender" will have a value of "Male"
            sGender = "Male";

        //else statment
        else

            //if "sGender is less than five then "sGender" will have a value of "Female"
            sGender = "Female";

        /*
        creates a variable data type of integer called "nationality"
        again we use the "Integer.parseInt()" method to convert our String "data.charAt()" method
        from a String into an Integer
         */
        int nationality = Integer.parseInt(data.charAt(10) + "");

        //creates a String called "sNationality"
        String sNationality;

        //creates an "if" statment that will compare to our "nationality" int
        if (nationality == 0)

            //if "sNationality" absolutely"==" equals "0" then value will be ""
            sNationality = "Permenant Resident";

        //else statment
        else

            //if "sNationaloty" does not equal "0" then value will be
            sNationality = "Not a Resident";

        tvMessage.setText("Your Information from your ID number: \n" +
                            "Date of Birth: " + DOB + "\n" +
                            "Gender: " + sGender + "\n" +
                            "Nationality: " + sNationality );

    }
}
