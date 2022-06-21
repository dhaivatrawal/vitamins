package com.zedr.dhaivat.vitamins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Five extends AppCompatActivity {

    RecyclerView recyclerView;
    Context context;
    private List<Club> clubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);

        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {

        RecyclerViewAdapterFive adapter = new RecyclerViewAdapterFive(clubs);
        recyclerView.setAdapter(adapter);

    }

    private void initializeData() {

        clubs= new ArrayList<Five.Club>();
        clubs.add(new Five.Club("What are vitamins and minerals?" ,"Vitamins and minerals are essential nutrients required for healing and functioning of the body.\n" +
                "When we don't take in enough nutrients, vitamin and mineral deficiencies occur and diseases -- even death -- can result.\n" +
                "Vitamins are classified as either water-soluble or fat-soluble.\n" +
                "Minerals are classified as electrolytes or trace minerals."));
        clubs.add(new Five.Club("What is the best way to get vitamins and minerals each day?" ,"Vitamins and minerals come from healthy foods, but many people do not eat enough of the right foods to ensure they get the entire recommended daily intake."));
        clubs.add(new Five.Club("What Do Vitamins and Minerals Do?" ,"Vitamins and minerals function as cofactors in the body that enable many metabolic reactions to happen. Without vitamins and minerals, we couldn't make new cells, repair damaged tissue, or convert food to energy."));
        clubs.add(new Five.Club("What Are Vitamins and Minerals?" ,"Vitamins and minerals are essential nutrients. You don't need much, just milligrams to micrograms a day, but if you don't get enough or the right kinds of vitamins and minerals, essential functions in the body cannot happen. The difference between vitamins and minerals has to do with their chemical structure. Vitamins can be broken down, but minerals are inorganic and cannot be broken into smaller chemical units. Vitamins are essential, meaning we have to get them from our diet (or supplements). Some, but not all, minerals are essential. Vitamins can also be classified as fat-soluble or water-soluble. Water-soluble vitamins are only in the body for a short time before excesses are excreted in the urine and sweat. Fat-soluble vitamins can be stored in fat tissue, so they can accumulate over time. Minerals can be classified as macrominerals, which are also called electrolytes, or trace minerals."));
        clubs.add(new Five.Club("What Are Symptoms and Signs of Vitamin and Mineral Deficiencies and Toxicities?" ,"The signs and symptoms of deficiency depend on the specific vitamin or mineral. For example, if a person is deficient in the vitamins and minerals that are necessary to make and repair skin, connective tissue, and collagen, he or she will have signs and symptoms related to poor skin healing, excess skin wrinkling or dryness, lack of elasticity, dermatitis, or rashes. There are minimum requirements for the amount of vitamins and minerals we need. If we don't get enough, we become deficient and display the signs and symptoms of low nutrient intake."));
        clubs.add(new Five.Club("Can Vitamin and Mineral Supplements Be Harmful if Taken in Excess?" ,"Like many good things, taking too much of a vitamin or mineral can be harmful. This is especially true of the fat-soluble vitamins, as excesses can't be excreted easily."));
        clubs.add(new Five.Club("What Are the Recommended Daily Requirements for Vitamins and Minerals?" ,"Daily requirements have been set by the USDA to help us understand the bare minimum of the nutrients we need to prevent major disease. There are different needs based on age, pregnancy status, and sex. The requirements are reevaluated periodically as scientific knowledge evolves. For example, the recommended daily value for adults for vitamin D is only 400 IU, but more recent research suggests that requirements may be 1,000 IU-4,000 IU per day. The chart below shows the minimum daily requirements for vitamin A, vitamin B1 or thiamin, vitamin B2 or riboflavin, vitamin B3 or niacin, vitamin B6, vitamin B12, vitamin C, ascorbic acid, vitamin D, vitamin E, folate, folic acid, vitamin K, calcium, chromium, copper, fluoride, iron, magnesium, manganese, molybdenum, phosphorus, potassium, selenium, and zinc."));
        clubs.add(new Five.Club("What Foods Are High in Which Vitamins and Minerals?" ,"Healthy foods, such as fruits and vegetables, are high in necessary nutrients. Fruits and vegetables are good sources of vitamin C, vitamin K, potassium, and magnesium, as well as many other nutrients. Whole grains like brown rice and quinoa are also high in vitamins, especially B vitamins such as vitamin B1 or thiamin, vitamin B2 or riboflavin, vitamin B3 or niacin, vitamin B6, and folate. Beans and lentils are high in minerals such as iron, magnesium, and manganese, as are nuts. White foods (such as white bread, white rice, and sugar), which are highly processed, are low in vitamins and minerals."));
        clubs.add(new Five.Club("Who Should Take Vitamin and Mineral Supplements?" ,"Research studies have tried to answer the following question:\n" +
                "\n" +
                "\"Do people need to take vitamin supplements?\"\n" +
                "\n" +
                "The answer appears to be \"it depends.\" Studies show that regular intake of a multivitamin is associated with a lower cancer rate and is especially beneficial to prevent a cancer recurrence (risk was reduced by 27%)." +
                "Seniors\n" +
                "Older adults benefit from taking a multivitamin; it may help reduce cognitive decline, improve mood, physical strength, and well-being.\n" +
                "\n" +
                "Pregnant Women\n" +
                "Pregnant women have a higher need for folate, which is necessary for normal brain development in the fetus, as well as higher needs for iron, calcium, and other minerals.\n" +
                "\n" +
                "Menopausal Women\n" +
                "Women after menopause need more calcium and other bone-supporting nutrients like magnesium, vitamin D, boron, strontium, and vitamin K to reduce the risks of osteoporosis.\n" +
                "\n" +
                "How Certain Medications Affect Nutrient Absorption\n" +
                "People who are taking medications that affect nutrients should also pay attention to ensure they get enough. For example, people taking statins need more CoQ10 than others. People taking acid-blocking medications are unable to absorb many nutrients and may benefit from a multivitamin or B12. Your health-care provider can help you decide whether taking a vitamin or mineral supplement is right for you."));
        clubs.add(new Five.Club("What Should People Look for When Choosing Vitamin and Mineral Supplements?" ,"When choosing a vitamin or mineral supplement, people must consider the quality, amount, and form of the nutrient. To find a good-quality vitamin or mineral supplement, look for a brand manufactured in the U.S., Europe, or Canada (where regulations are more strict) that carries an indication of third-party analysis. Several organizations do this and put their seal on the products: NSF International, U.S. Pharmacopeia, or Consumer Lab. Choosing a good-quality brand ensures that the supplement contains what the label says it contains. It is also important to get the right forms of the vitamins. For example, some people have genetic variation that affects processing of B vitamins and requires them to take methylfolate (instead of folic acid)."));
        clubs.add(new Five.Club("Where Can People Find Additional Information About Vitamins and Minerals?" ,"People who have questions about whether they should take vitamins and minerals, or whether they would benefit from increased intake of specific nutrients, should talk to an expert in micronutrients. Naturopathic doctors, nutritionists, registered dieticians, and integrative medicine doctors are all good resources for people who want to understand their needs for vitamins and minerals. For people who want to study about vitamins and minerals themselves, be careful! There is a lot of misinformation on the Internet! Reputable institutes such as the Linus Pauling Institute and the NIH Office of Dietary Supplements are good resources for quality information."));

    }

    class Club {

        String nameone,nametwo;

        public Club(String nameone, String nametwo) {


            this.nameone=nameone;
            this.nametwo=nametwo;

        }
    }

}
