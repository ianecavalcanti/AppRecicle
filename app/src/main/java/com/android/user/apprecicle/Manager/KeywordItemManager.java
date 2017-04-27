package com.android.user.apprecicle.Manager;

import com.android.user.apprecicle.Model.KeywordItem;
import com.android.user.apprecicle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 17/04/2017.
 */

public class KeywordItemManager {
    public static List<KeywordItem> populateDefaultKeywordItems() {
        List<KeywordItem> keywordItemList = new ArrayList<>();
        keywordItemList.add(new KeywordItem("Plástico", R.drawable.plastico));
        keywordItemList.add(new KeywordItem("Vidro", R.drawable.liquor_store));
        keywordItemList.add(new KeywordItem("Eletrônica", R.drawable.electronics_store));
        keywordItemList.add(new KeywordItem("Metal", R.drawable.plastico));
        keywordItemList.add(new KeywordItem("Papel", R.drawable.book_store));
        keywordItemList.add(new KeywordItem("Papelão", R.drawable.plastico));
        keywordItemList.add(new KeywordItem("Papelão", R.drawable.plastico));
        keywordItemList.add(new KeywordItem("Papelão", R.drawable.plastico));





        return keywordItemList;
    }
}