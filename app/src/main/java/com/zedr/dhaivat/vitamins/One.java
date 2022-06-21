package com.zedr.dhaivat.vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class One extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterOne adapter = new RecyclerViewAdapterOne(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<One.Club>();
        clubs.add(new One.Club("How much do you know about the 13 essential vitamins your body needs?",R.mipmap.evta,"The 13 essential vitamins your body needs are vitamins A, C, D, E, K and the B vitamins: thiamine (B1), riboflavin (B2), niacin (B3), pantothenic acid (B5), pyroxidine (B6), biotin (B7), folate (B9) and cobalamin (B12).\n" +
                "\n" +
                "The four fat-soluble vitamins—A, D, E, and K—are stored in the body’s fatty tissues. The other nine vitamins are water-soluble and therefore must be replenished regularly because they are removed from the body in your urine. Vitamin B12 is the only water-soluble vitamin that is stored in the liver.\n" +
                "\n" +
                "The best way to get enough of the 13 essential vitamins is to eat a balanced diet from a variety of foods." ));
        clubs.add(new One.Club("Vitamin A",R.mipmap.a1,"Vitamin A plays an important role in growth and cell development. It also promotes healthy skin, hair, nails, gums, glands, bones and teeth; prevents night blindness and may help prevent lung cancer.\n" +
                "\n" +
                "Where to get Vitamin A: Salmon, other cold-water fish, egg yolks, fortified dairy products."));
        clubs.add(new One.Club("Vitamin D",R.mipmap.a2,"As an essential vitamin, Vitamin D aids calcium absorption, and builds and maintains strong bones and teeth.\n" +
                "\n" +
                "Where to get Vitamin D: Fortified milk, fortified soy/rice beverages, butter, egg yolks, fatty fish, fish-liver oil; made by the body when exposed to the sun."));
        clubs.add(new One.Club("Vitamin E",R.mipmap.a3,"Vitamin E protects fatty acids; maintains muscles and red blood cells; and serves as an important antioxidant.\n" +
                "\n" +
                "Where to get Vitamin E: Eggs, vegetable oils, margarine, mayonnaise; nuts, seeds, fortified cereals."));
        clubs.add(new One.Club("Vitamin K",R.mipmap.a4,"Vitamin K is an essential vitamin for your body. Your body needs it for proper blood clotting.\n" +
                "\n" +
                "Where to get Vitamin K: spinach, broccoli, green leafy vegetables, liver."));
        clubs.add(new One.Club("Vitamin C (Ascorbic Acid)",R.mipmap.a5,"Vitamin C, found in citrus fruits, is an essential vitamin and important for your body.\n" +
                "\n" +
                "Why you need Vitamin C: Strengthens blood vessel walls; promotes wound healing and iron absorption; helps prevent atherosclerosis; supports immunity; serves as a key antioxidant.\n" +
                "\n" +
                "Where to get Vitamin C: Citrus fruits, juices, melons, berries, peppers, broccoli, potatoes."));
        clubs.add(new One.Club("Thiamine (Vitamin B1)",R.mipmap.a6,"Vitamin B1 is important for maintaining a healthy metabolism. It also helps maintain normal digestion, appetite and proper nerve function.\n" +
                "\n" +
                "Where to get Vitamin B1: Pork, legumes, nuts, seeds, fortified cereals, grains."));
        clubs.add(new One.Club("Riboflavin (Vitamin B2)",R.mipmap.a7a,"Why you need Vitamin B2: Vitamin B2 is essential for energy metabolism. It also aids adrenal function, supports normal vision and helps maintain healthy skin.\n" +
                "\n" +
                "Where to get Vitamin B2: Fortified cereals, grains, lean meat, poultry, dairy products, fortified soy/rice beverages, raw mushrooms."));
        clubs.add(new One.Club("Niacin (Vitamin B3)",R.mipmap.a8,"Vitamin B3 is important for the body. It’s used to metabolize energy and promote normal growth. In large doses, Vitamin B3 can also lower cholesterol.\n" +
                "\n" +
                "Where to get Vitamin B: Lean meats, poultry, seafood, milk; eggs, legumes, fortified breads, cereals."));
        clubs.add(new One.Club("Pantothenic Acid (Vitamin B5)",R.mipmap.a9a,"Although it’s one of the essential vitamins, Vitamin B5 is relatively easy to come by.\n" +
                "\n" +
                "Why you need Vitamin B5: Aids energy metabolism and normalizes blood sugar levels.\n" +
                "\n" +
                "Where to get it: Almost all foods contain Vitamin B5."));
        clubs.add(new One.Club("Pyridoxine (Vitamin B6)",R.mipmap.a10,"Vitamin B6 is an essential vitamin for good health. It promotes protein metabolism, metabolism of carbohydrates and the release of energy. It also plays a role in proper nerve function and the synthesis of red blood cells.\n" +
                "\n" +
                "Where to get Vitamin B6: Meat, fish, poultry, grains, cereals, bananas, green leafy vegetables, potatoes, soybeans."));
        clubs.add(new One.Club("Biotin (Vitamin B7)",R.mipmap.a11,"Vitamin B7 (also known as biotin) is an essential vitamin that plays an important role in maintaining a healthy metabolism.\n" +
                "\n" +
                "Where to get Vitamin B7: Egg yolks, soybeans, whole grains, nuts, yeast."));
        clubs.add(new One.Club("Folic Acid (Vitamin B9)",R.mipmap.a12,"Vitamin B9 is an essential vitamin, and is especially important for pregnant women.\n" +
                "\n" +
                "Why you need Vitamin B9: To make DNA, RNA, red blood cells, and synthesize certain amino acids. Vitamin B9 is also important for pregnant women, as it helps prevent birth defects.\n" +
                "\n" +
                "Where to get Vitamin B9: Liver, yeast, leafy green vegetables, asparagus, orange juice, fortified flour, avocados; legumes."));
        clubs.add(new One.Club("Cobalamin (Vitamin B12)",R.mipmap.a13,"Why you need Vitamin B12: To make red blood cells, DNA, RNA, and myelin for nerve fibres.\n" +
                "\n" +
                "Where to get Vitamin B12: All animal products."));

    }

    class Club {

        String nameone,nametwo;
        int logoId;
        public Club(String nameone, int logoId, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;
            this.logoId=logoId;

        }
    }

}
