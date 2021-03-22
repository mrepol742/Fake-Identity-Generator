package com.android.DROID_MJ.fakeidentitygenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.helloworld.R;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.AppCompatButton;
import java.util.Random;
import android.view.View;
import android.support.v7.widget.AppCompatImageView;
import android.widget.Toast;
import android.view.WindowManager;
import android.os.Build;
import android.graphics.Color;
import android.graphics.Typeface;
 

public class a extends AppCompatActivity {
    private String[] aM = {"James", "John", "Robert", "Michael", "William", "David" ,"Richard", "Joseph"," Thomas", "Charles","Christopher" ,"Daniel","Matthew","Anthony", "Donald","Mark", "Paul", "Steven", "Andrew", "Kenneth" ,"Joshua", "George" , "Kevin", "Brian", "Edward","Ronald","Timothy", "Jason", "Jeffrey","Ryan", "Jacob","Gary","Nicholas","Eric","Stephen","Jonathan","Larry","Justin","Scott","Brandon","Frank","Benjamin","Gregory","Samuel","Raymond","Patrick","Alexander","Jack","Deniss","Jerry","Tyler","Aaron","Jose","Henry","Douglas","Adam","Peter","Nathan","Zachary","Walter","Kyle","Harold","Carl","Jeremy","Keith","Roger","Gerald","Ethan","Arthur","Terry","Christian","Sean","Lawrence","Austin","Joe","Noah","Jesse","Albert","Bryan","Billy","Bruce","Willie","Jordan","Dylan","Alan","Ralph","Gabriel","Roy","Juan","Wayne","Eugene","Logan","Randy","Louis","Russell","Vincent","Philip","Bobby","Johnny","Bradley"};

private String[] bF = {"Mary","Patricia","Jennifer","Linda","Elizabeth","Barbara","Susan","Jessica","Sarah","Karen","Nancy","Margaret","Lisa","Betty","Dorothy","Sandra","Ashley","Kimberly","Donna","Emily","Michelle","Carol","Amanda","Melissa","Deborah","Stephanie","Rebecca","Laura","Sharon","Cynthia","Kathleen","Helen","Amy","Shirley","Angela","Anna","Brenda","Pamela","Nicole","Ruth","Katherine","Samantha","Christine","Emma","Catherine","Debra","Virginia","Rachel","Carolyn","Janet","Marzia","Heather","Diane","Julie","Joyce","Victoria","Kelly","Christina","Joan","Evely","Lauren","Judith","Olivia","Frances","Martha","Cheryl","Megan","Andrea","Hannah","Jacqueline","Ann","Jean","Alice","Kathryn","Gloria","Teresa","Doris","Sara","Janice","Julia","Marie","Madison","Grace","Judy","Theresa","Beverly","Denise","Marilyn","Amber","Danielle","Abigail","Brittany","Rose","Diana","Natalie","Sophia","Alexis","Lori","Kayla","Jane"};

String[] cC = {"AF|Afghanistan","AL|Albania","DZ|Algeria","AS|American Samoa","AD|Andorra","AO|Angola","AI|Anguilla","AQ|Antarctica","AG|Antigua And Barbuda","AR|Argentina","AM|Armenia","AW|Aruba","AU|Australia","AT|Austria","AZ|Azerbaijan","BS|Bahamas","BH|Bahrain","BD|Bangladesh","BB|Barbados","BY|Belarus","BE|Belgium","BZ|Belize","BJ|Benin","BM|Bermuda","BT|Bhutan","BO|Bolivia","BA|Bosnia And Herzegovina","BW|Botswana","BV|Bouvet Island","BR|Brazil","IO|British Indian Ocean Territory","BN|Brunei Darussalam","BG|Bulgaria","BF|Burkina Faso","BI|Burundi","KH|Cambodia","CM|Cameroon","CA|Canada","CV|Cape Verde","KY|Cayman Islands","CF|Central African Republic","TD|Chad","CL|Chile","CN|China","CX|Christmas Island","CC|Cocos (keeling) Islands","CO|Colombia","KM|Comoros","CG|Congo","CD|Congo, The Democratic Republic Of The","CK|Cook Islands","CR|Costa Rica","CI|Cote D'ivoire","HR|Croatia","CU|Cuba","CY|Cyprus","CZ|Czech Republic","DK|Denmark","DJ|Djibouti","DM|Dominica","DO|Dominican Republic","TP|East Timor","EC|Ecuador","EG|Egypt","SV|El Salvador","GQ|Equatorial Guinea","ER|Eritrea","EE|Estonia","ET|Ethiopia","FK|Falkland Islands (malvinas)","FO|Faroe Islands","FJ|Fiji","FI|Finland","FR|France","GF|French Guiana","PF|French Polynesia","TF|French Southern Territories","GA|Gabon","GM|Gambia","GE|Georgia","DE|Germa ny","GH|Ghana","GI|Gibraltar","GR|Greece","GL|Greenland","GD|Grenada","GP|Guadeloupe","GU|Guam","GT|Guatemala","GN|Guinea","GW|Guinea-bissau","GY|Guyana","HT|Haiti","HM|Heard Island And Mcdonald Islands","VA|Holy See (vatican City State)","HN|Honduras","HK|Hong Kong","HU|Hungary","IS|Iceland","IN|India","ID|Indonesia","IR|Iran, Islamic Republic Of","IQ|Iraq","IE|Ireland","IL|Israel","IT|Italy","JM|Jamaica","JP|Japan","JO|Jordan","KZ|Kazakstan","KE|Kenya","KI|Kiribati","KP|Korea, Democratic People's Republic Of","KR|Korea, Republic Of","KV|Kosovo","KW|Kuwait","KG|Kyrgyzstan","LA|Lao People's Democratic Republic","LV|Latvia","LB|Lebanon","LS|Lesotho","LR|Liberia","LY|Libyan Arab Jamahiriya","LI|Liechtenstein","LT|Lithuania","LU|Luxembourg","MO|Macau","MK|Macedonia, The Former Yugoslav Republic Of","MG|Madagascar","MW|Malawi","MY|Malaysia","MV|Maldives","ML|Mali","MT|Malta","MH|Marshall Islands","MQ|Martinique","MR|Mauritania","MU|Mauritius","YT|Mayotte","MX|Mexico","FM|Micronesia, Federated States Of","MD|Moldova, Republic Of","MC|Monaco","MN|Mongolia","MS|Montserrat","ME|Montenegro","MA|Morocco","MZ|Mozambique","MM|Myanmar","NA|Namibia","NR|Nauru","NP|Nepal","NL|Netherlands","AN|Netherlands Antilles","NC|New Caledonia","NZ|New Zealand","NI|Nicaragua","NE|Niger","NG|Nigeria","NU|Niue","NF|Norfolk Island","MP|Northern Mariana Islands","NO|Norway","OM|Oman","PK|Pakistan","PW|Palau","PS|Palestinian Territory, Occupied","PA|Panama","PG|Papua New Guinea","PY|Paraguay","PE|Peru","PH|Philippines","PN|Pitcairn","PL|Poland","PT|Portugal","PR|Puerto Rico","QA|Qatar","RE|Reunion","RO|Romania","RU|Russian Federation","RW|Rwanda","SH|Saint Helena","KN|Saint Kitts And Nevis","LC|Saint Lucia","PM|Saint Pierre And Miquelon","VC|Saint Vincent And The Grenadines","WS|Samoa","SM|San Marino","ST|Sao Tome And Principe","SA|Saudi Arabia","SN|Senegal","RS|Serbia","SC|Seychelles","SL|Sierra Leone","SG|Singapore","SK|Slovakia","SI|Slovenia","SB|Solomon Islands","SO|Somalia","ZA|South Africa","GS|South Georgia And The South Sandwich Islands","ES|Spain","LK|Sri Lanka","SD|Sudan","SR|Suriname","SJ|Svalbard And Jan Mayen","SZ|Swaziland","SE|Sweden","CH|Switzerland","SY|Syrian Arab Republic","TW|Taiwan, Province Of China","TJ|Tajikistan","TZ|Tanzania, United Republic Of","TH|Thailand","TG|Togo","TK|Tokelau","TO|Tonga","TT|Trinidad And Tobago","TN|Tunisia","TR|Turkey","TM|Turkmenistan","TC|Turks And Caicos Islands","TV|Tuvalu","UG|Uganda","UA|Ukraine","AE|United Arab Emirates","GB|United Kingdom","US|United States","UM|United States Minor Outlying Islands","UY|Uruguay","UZ|Uzbekistan","VU|Vanuatu","VE|Venezuela","VN|Viet Nam","VG|Virgin Islands, British","VI|Virgin Islands, U.s.","WF|Wallis And Futuna","EH|Western Sahara","YE|Yemen","ZM|Zambia","ZW|Zimbabwe"};
String[] dS ={"Single","In A Relationship","Engaged","Married","In A Civil Union","In A Domestic Partnership","In A Open Relationship"};
String[] eM = {"January","February","March","April","May","June","July","August","September","October","November","December"};
String[] fE = {"Brown","Blue"};
String[] gR = {"Islam","Buddhism","Hinduism","Judaism","Christianity","Sikhism","Animism","Catholicism","Agnosticism","Confucianism","Taoism"};
    AppCompatTextView b;
    AppCompatImageView c;

AppCompatTextView e;
    protected void onCreate(Bundle a) {
        setTheme(R.style.a);
        super.onCreate(a);
        setContentView(R.layout.b);
if (Build.VERSION.SDK_INT != 23) {
getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
}
        Typeface c78 = Typeface.createFromAsset(getAssets(), "fonts/a.ttf");
Typeface c28 = Typeface.createFromAsset(getAssets(), "fonts/b.ttf");
         b = (AppCompatTextView) findViewById(R.id.b);
        AppCompatButton c = (AppCompatButton) findViewById(R.id.c);
b.setTypeface(c78);
b.setTextColor(Color.parseColor("#141414"));
this.c = (AppCompatImageView) findViewById(R.id.d);

     this.e = (AppCompatTextView) findViewById(R.id.e);
     
this.c.setBackgroundResource(R.drawable.i);
a1();
c.setBackgroundResource(R.drawable.h);
c.setText("Generate");
this.e.setTypeface(c28);
this.e.setTextColor(Color.parseColor("#212121"));
c.setTypeface(c28);
c.setTextColor(Color.parseColor("#ffffff"));
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
   
           
      a1();

            }
        });







    }
private void a1() {
try {
          Random d = new Random();
     int e = d.nextInt(2);
int f = d.nextInt(99);
int g = d.nextInt(99);
int h = d.nextInt(99);
int i = d.nextInt(60-18)+18;
int j = cC.length;
int k = d.nextInt(j);
int l = d.nextInt(7);
int m = d.nextInt(12);
int o = d.nextInt(28-1)+1;
int p = d.nextInt(2);
int q = d.nextInt(8-5)+5;
int r = d.nextInt(9-0)+0;
String s = Integer.toString(q)+"."+Integer.toString(r)+" Feet";
int t = d.nextInt(24-18)+18;
int u = d.nextInt(9-5)+5;
String v = Integer.toString(t)+"."+Integer.toString(u)+" Pounds";
int w = d.nextInt(99);
int x = d.nextInt(99);
int y = d.nextInt(99);
int z = d.nextInt(11);
int a1 = d.nextInt(99);
 if (e == 0) {

 b.setText(a.this.aM[f]+" "+a.this.aM[g]+" "+a.this.aM[h]);
this.e.setText("First Name: "+ a.this.aM[f] + "\n"+"Middle Name: "+a.this.bF[g]+"\n"+"Last Name: "+a.this.aM[h]+"\n"+"Birthday: "+a.this.eM[m]+" "+ Integer.toString(o)+" "+ Integer.toString(2019 -i)+"\n"+"Gender: Male"+"\n"+"Age: "+Integer.toString(i)+"\n"+"Relationship: "+a.this.dS[l]+"\n"+"Country: "+ a.this.cC[k]+"\n"+"Eye Color: "+a.this.fE[p]+"\n"+"Height: "+s+"\n"+"Weight: "+ v+"\n"+"Religion: "+a.this.gR[z]+"\n"+"Mother Name: "+a.this.bF[w] +" "+a.this.bF[x]+" "+a.this.aM[g]+"\n"+"Father Name: "+a.this.aM[y]+" "+a.this.bF[a1]+" "+a.this.aM[h]);
this.c.setImageResource(R.drawable.f);

} else {
  b.setText(a.this.bF[f]+" "+a.this.bF[g]+" "+a.this.bF[h]);
this.e.setText("First Name: "+a.this.bF[f]+"\n"+"Middle Name: "+a.this.bF[g]+"\n"+"Last Name: "+a.this.bF[h]+"\n"+"Birthday: "+a.this.eM[m]+" "+ Integer.toString(o)+" "+ Integer.toString(2019-i)+"\n"+"Gender: Female"+"\n"+"Age: "+Integer.toString(i)+"\n"+"Relationship: "+a.this.dS[l]+"\n"+"Country: "+a.this.cC[k]+"\n"+"Eye Color: "+a.this.fE[p]+"\n"+"Height: "+s+"\n"+"Weight: "+ v+"\n"+"Religion: "+a.this.gR[z]+"\n"+"Mother Name: "+a.this.bF[w] +" "+a.this.bF[x]+" "+a.this.bF[g]+"\n"+"Father Name: "+a.this.aM[y]+" "+a.this.bF[a1]+" "+a.this.bF[h]);
this.c.setImageResource(R.drawable.g);
}

} catch (Exception ex) {
Toast .makeText(this, ex.getMessage(),0).show();
}

}
}