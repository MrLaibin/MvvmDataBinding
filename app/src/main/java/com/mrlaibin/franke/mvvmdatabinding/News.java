package com.mrlaibin.franke.mvvmdatabinding;

import java.util.List;

/**
 * Created by franke on 16/11/17.
 */

public class News {

    public List<Stroie> stories;
    public List<Stroie> top_stories;


    public class Stroie {
        public List<String> images;
        public String image;
        public int type;
        public int id;
        public String ga_prefix;
        public String title;
    }
}
