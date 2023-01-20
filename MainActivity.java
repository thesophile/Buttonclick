package com.example.buttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonA;
    Button buttonB;
    Button buttonC;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView numMoves;
    TextView score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonA = (Button)findViewById(R.id.btn1);
        buttonB = (Button)findViewById(R.id.btn2);
        buttonC = (Button)findViewById(R.id.btn3);
        textView1 = (TextView)findViewById(R.id.textView1);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        numMoves =  (TextView)findViewById(R.id.numMoves);
        score    =  (TextView)findViewById(R.id.score);
        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);

        vaint scorevalue = 0



    }




    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btn1 )
        {  textView1.setText(generateString(1)); }

        if(view.getId()==R.id.btn2 )
        {  textView2.setText(generateString(1)); }

        if(view.getId()==R.id.btn3 )
        {  textView3.setText(generateString(1)); }

        private String generateString (int length){
            char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            Random random = new Random();
            for (int i=0; i < length; i++ ) {
                char c = chars[random.nextInt(chars.length)];
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }


        String input = textView1.getText().toString()+textView2.getText().toString()+textView3.getText().toString();

        String words = " abs\n" +
                "ace\n" +
                "act\n" +
                "add\n" +
                "ado\n" +
                "aft\n" +
                "age\n" +
                "ago\n" +
                "aha\n" +
                "aid\n" +
                "aim\n" +
                "air\n" +
                "ala\n" +
                "ale\n" +
                "all\n" +
                "alt\n" +
                "amp\n" +
                "ana\n" +
                "and\n" +
                "ant\n" +
                "any\n" +
                "ape\n" +
                "app\n" +
                "apt\n" +
                "arc\n" +
                "are\n" +
                "ark\n" +
                "arm\n" +
                "art\n" +
                "ash\n" +
                "ask\n" +
                "asp\n" +
                "ass\n" +
                "ate\n" +
                "ave\n" +
                "awe\n" +
                "axe\n" +
                "aye\n" +
                "BAA\n" +
                "bad\n" +
                "bag\n" +
                "ban\n" +
                "bar\n" +
                "bat\n" +
                "bay\n" +
                "bed\n" +
                "bee\n" +
                "beg\n" +
                "bel\n" +
                "ben\n" +
                "bet\n" +
                "bid\n" +
                "big\n" +
                "bin\n" +
                "bio\n" +
                "bis\n" +
                "bit\n" +
                "biz\n" +
                "bob\n" +
                "bog\n" +
                "boo\n" +
                "bow\n" +
                "box\n" +
                "boy\n" +
                "bra\n" +
                "bud\n" +
                "Bug\n" +
                "bum\n" +
                "bun\n" +
                "bus\n" +
                "but\n" +
                "buy\n" +
                "bye\n" +
                "cab\n" +
                "cad\n" +
                "cam\n" +
                "can\n" +
                "cap\n" +
                "car\n" +
                "cat\n" +
                "chi\n" +
                "cob\n" +
                "cod\n" +
                "col\n" +
                "con\n" +
                "coo\n" +
                "cop\n" +
                "cor\n" +
                "cos\n" +
                "cot\n" +
                "cow\n" +
                "cox\n" +
                "coy\n" +
                "cry\n" +
                "cub\n" +
                "cue\n" +
                "cum\n" +
                "cup\n" +
                "cut\n" +
                "dab\n" +
                "dad\n" +
                "dal\n" +
                "dam\n" +
                "dan\n" +
                "day\n" +
                "Dee\n" +
                "def\n" +
                "del\n" +
                "den\n" +
                "dew\n" +
                "did\n" +
                "die\n" +
                "dig\n" +
                "dim\n" +
                "din\n" +
                "dip\n" +
                "dis\n" +
                "doc\n" +
                "doe\n" +
                "dog\n" +
                "don\n" +
                "dot\n" +
                "dry\n" +
                "dub\n" +
                "due\n" +
                "dug\n" +
                "dun\n" +
                "duo\n" +
                "dye\n" +
                "ear\n" +
                "eat\n" +
                "ebb\n" +
                "ecu\n" +
                "eft\n" +
                "egg\n" +
                "ego\n" +
                "elf\n" +
                "elm\n" +
                "emu\n" +
                "end\n" +
                "era\n" +
                "eta\n" +
                "eve\n" +
                "eye\n" +
                "fab\n" +
                "fad\n" +
                "fan\n" +
                "far\n" +
                "fat\n" +
                "fax\n" +
                "fay\n" +
                "fed\n" +
                "fee\n" +
                "fen\n" +
                "few\n" +
                "fig\n" +
                "fin\n" +
                "fir\n" +
                "fit\n" +
                "fix\n" +
                "flu\n" +
                "fly\n" +
                "foe\n" +
                "fog\n" +
                "for\n" +
                "fox\n" +
                "fry\n" +
                "fun\n" +
                "fur\n" +
                "gag\n" +
                "gal\n" +
                "gap\n" +
                "gas\n" +
                "gay\n" +
                "gee\n" +
                "gel\n" +
                "gem\n" +
                "get\n" +
                "gig\n" +
                "gin\n" +
                "god\n" +
                "got\n" +
                "gum\n" +
                "gun\n" +
                "gut\n" +
                "guy\n" +
                "gym\n" +
                "had\n" +
                "ham\n" +
                "has\n" +
                "hat\n" +
                "hay\n" +
                "hem\n" +
                "hen\n" +
                "her\n" +
                "hey\n" +
                "hid\n" +
                "him\n" +
                "hip\n" +
                "his\n" +
                "hit\n" +
                "hog\n" +
                "hon\n" +
                "hop\n" +
                "hot\n" +
                "how\n" +
                "hub\n" +
                "hue\n" +
                "hug\n" +
                "huh\n" +
                "hum\n" +
                "hut\n" +
                "ice\n" +
                "icy\n" +
                "igg\n" +
                "ill\n" +
                "imp\n" +
                "ink\n" +
                "inn\n" +
                "ion\n" +
                "its\n" +
                "ivy\n" +
                "jam\n" +
                "jar\n" +
                "jaw\n" +
                "jay\n" +
                "jet\n" +
                "jew\n" +
                "job\n" +
                "joe\n" +
                "jog\n" +
                "joy\n" +
                "jug\n" +
                "jun\n" +
                "kay\n" +
                "ken\n" +
                "key\n" +
                "kid\n" +
                "kin\n" +
                "kit\n" +
                "lab\n" +
                "lac\n" +
                "lad\n" +
                "lag\n" +
                "lam\n" +
                "lap\n" +
                "law\n" +
                "lax\n" +
                "lay\n" +
                "lea\n" +
                "led\n" +
                "Lee\n" +
                "leg\n" +
                "les\n" +
                "let\n" +
                "lib\n" +
                "lid\n" +
                "lie\n" +
                "lip\n" +
                "lit\n" +
                "log\n" +
                "lot\n" +
                "low\n" +
                "mac\n" +
                "mad\n" +
                "mag\n" +
                "man\n" +
                "map\n" +
                "mar\n" +
                "mas\n" +
                "mat\n" +
                "max\n" +
                "may\n" +
                "med\n" +
                "meg\n" +
                "men\n" +
                "Met\n" +
                "mid\n" +
                "mil\n" +
                "mix\n" +
                "mob\n" +
                "mod\n" +
                "mol\n" +
                "mom\n" +
                "mon\n" +
                "mop\n" +
                "mot\n" +
                "mud\n" +
                "mug\n" +
                "mum\n" +
                "nab\n" +
                "nah\n" +
                "nan\n" +
                "nap\n" +
                "nay\n" +
                "neb\n" +
                "neg\n" +
                "net\n" +
                "new\n" +
                "nil\n" +
                "nip\n" +
                "nod\n" +
                "nor\n" +
                "nos\n" +
                "not\n" +
                "now\n" +
                "nun\n" +
                "nut\n" +
                "oak\n" +
                "odd\n" +
                "off\n" +
                "oft\n" +
                "oil\n" +
                "old\n" +
                "ole\n" +
                "one\n" +
                "ooh\n" +
                "opt\n" +
                "orb\n" +
                "ore\n" +
                "our\n" +
                "out\n" +
                "owe\n" +
                "owl\n" +
                "own\n" +
                "pac\n" +
                "pad\n" +
                "pal\n" +
                "pam\n" +
                "pan\n" +
                "pap\n" +
                "par\n" +
                "pas\n" +
                "pat\n" +
                "paw\n" +
                "pay\n" +
                "pea\n" +
                "peg\n" +
                "pen\n" +
                "pep\n" +
                "per\n" +
                "pet\n" +
                "pew\n" +
                "phi\n" +
                "pic\n" +
                "pie\n" +
                "pig\n" +
                "pin\n" +
                "pip\n" +
                "pit\n" +
                "ply\n" +
                "pod\n" +
                "pol\n" +
                "pop\n" +
                "pot\n" +
                "pro\n" +
                "psi\n" +
                "pub\n" +
                "pup\n" +
                "put\n" +
                "rad\n" +
                "rag\n" +
                "raj\n" +
                "ram\n" +
                "ran\n" +
                "rap\n" +
                "rat\n" +
                "raw\n" +
                "ray\n" +
                "red\n" +
                "ref\n" +
                "reg\n" +
                "rem\n" +
                "rep\n" +
                "rev\n" +
                "rib\n" +
                "rid\n" +
                "rig\n" +
                "rim\n" +
                "rip\n" +
                "rob\n" +
                "rod\n" +
                "roe\n" +
                "rot\n" +
                "row\n" +
                "rub\n" +
                "rue\n" +
                "rug\n" +
                "rum\n" +
                "run\n" +
                "rye\n" +
                "sab\n" +
                "sac\n" +
                "sad\n" +
                "sae\n" +
                "sag\n" +
                "sal\n" +
                "sap\n" +
                "sat\n" +
                "saw\n" +
                "say\n" +
                "sea\n" +
                "sec\n" +
                "see\n" +
                "sen\n" +
                "set\n" +
                "sew\n" +
                "sex\n" +
                "she\n" +
                "shy\n" +
                "sic\n" +
                "sim\n" +
                "sin\n" +
                "sip\n" +
                "sir\n" +
                "sis\n" +
                "sit\n" +
                "six\n" +
                "ski\n" +
                "sky\n" +
                "sly\n" +
                "sod\n" +
                "sol\n" +
                "son\n" +
                "sow\n" +
                "soy\n" +
                "spa\n" +
                "spy\n" +
                "sub\n" +
                "sue\n" +
                "sum\n" +
                "sun\n" +
                "sup\n" +
                "tab\n" +
                "tad\n" +
                "tag\n" +
                "tam\n" +
                "tan\n" +
                "tap\n" +
                "tar\n" +
                "tat\n" +
                "tax\n" +
                "tea\n" +
                "ted\n" +
                "tee\n" +
                "ten\n" +
                "the\n" +
                "thy\n" +
                "tie\n" +
                "tin\n" +
                "tip\n" +
                "tod\n" +
                "toe\n" +
                "tom\n" +
                "ton\n" +
                "too\n" +
                "top\n" +
                "tor\n" +
                "tot\n" +
                "tow\n" +
                "toy\n" +
                "try\n" +
                "tub\n" +
                "tug\n" +
                "two\n" +
                "use\n" +
                "van\n" +
                "vat\n" +
                "vet\n" +
                "via\n" +
                "vie\n" +
                "vow\n" +
                "wan\n" +
                "war\n" +
                "was\n" +
                "wax\n" +
                "way\n" +
                "web\n" +
                "wed\n" +
                "wee\n" +
                "wet\n" +
                "who\n" +
                "why\n" +
                "wig\n" +
                "win\n" +
                "wis\n" +
                "wit\n" +
                "won\n" +
                "woo\n" +
                "wow\n" +
                "wry\n" +
                "wye\n" +
                "yen\n" +
                "yep\n" +
                "yes\n" +
                "yet\n" +
                "you\n" +
                "zip\n" +
                "zoo" ;

        if (words.contains(input)){numMoves.setText("hooray");
            score.setText("score:"+scorevalue);
        }
        else {numMoves.setText("Find a word");}


    }




}

